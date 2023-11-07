package edu.project2.generators;

import edu.project2.maze.Cell;
import edu.project2.maze.Maze;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

@SuppressWarnings({"MagicNumber", "ParameterAssignment"})
public class RecursiveBacktrackerGenerator implements Generator {
    @Override
    public Maze generate(int rows, int cols) {
        if (cols % 2 == 0) {
            cols++;
        }
        if (rows % 2 == 0) {
            rows++;
        }

        Cell[][] grid = new Cell[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                grid[i][j] = new Cell(i, j, Cell.Type.WALL, false);
            }
        }

        Cell curCell = grid[1][1];

        Stack<Cell> cells = new Stack<>();

        while (true) {
            Cell nextCell = getRandomCell(grid, curCell);

            if (nextCell != null) {
                nextCell = nextCell.setTypeAndVisited(Cell.Type.PASSAGE, true);

                Cell midCell = grid
                    [(curCell.row() + nextCell.row()) / 2]
                    [(curCell.col() + nextCell.col()) / 2];
                midCell = midCell.setTypeAndVisited(Cell.Type.PASSAGE, true);

                grid[nextCell.row()][nextCell.col()] = nextCell;
                grid[midCell.row()][midCell.col()] = midCell;

                cells.push(curCell);
                curCell = nextCell;
            } else if (!cells.empty()) {
                curCell = cells.pop();
            } else {
                break;
            }
        }
        return new Maze(rows, cols, grid);
    }

    private boolean isValidCell(int x, int y, int height, int width) {
        return (0 < x && x < width - 1) && (0 < y && y < height - 1);
    }

    private Cell getRandomCell(Cell[][] grid, Cell curCell) {
        int height = grid.length;
        int width = grid[0].length;

        int[] dx = {-2, 0, 2, 0};
        int[] dy = {0, -2, 0, 2};

        List<Integer> indexList = new ArrayList<>(List.of(0, 1, 2, 3));

        Collections.shuffle(indexList);

        for (int j = 0; j < dx.length; j++) {
            int i = indexList.get(j);

            if (isValidCell(curCell.col() + dy[i], curCell.row() + dx[i], height, width)) {
                Cell tempCell = grid[curCell.row() + dx[i]][curCell.col() + dy[i]];
                if (!tempCell.isVisited()) {
                    return tempCell;
                }
            }
        }
        return null;
    }
}
