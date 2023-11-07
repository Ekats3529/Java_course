package edu.project2.solvers;

import edu.project2.maze.Cell;
import edu.project2.maze.Maze;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class BFSSolver implements Solver {
    @Override
    public List<Cell> solve(Maze maze, Cell start, Cell end) {
        Map<Cell, Cell> path = new HashMap<>();
        Queue<Cell> queue = new LinkedList<>();
        path.put(start, null);

        queue.add(start);

        while (!queue.isEmpty()) {
            Cell cur = queue.poll();

            if (cur.equals(end)) {
                break;
            }

            List<Cell> neighbours = getCellNeighbours(maze, cur, path);
            for (Cell neighbour : neighbours) {
                if (!path.containsKey(neighbour)) {
                    path.put(neighbour, cur);
                    queue.add(neighbour);
                }
            }
        }

        List<Cell> pathCells = new ArrayList<>();

        Cell target = end;

        while (!target.equals(start)) {
            pathCells.add(target);
            target = path.get(target);
            if (target == null) {
                break;
            }
        }
        pathCells.add(start);

        return pathCells;
    }

    private List<Cell> getCellNeighbours(Maze maze, Cell currentCell, Map<Cell, Cell> path) {
        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, -1, 0, 1};

        List<Cell> neighbours = new ArrayList<>();

        for (int i = 0; i < dx.length; i++) {
            if (maze.isValidCell(currentCell.row() + dy[i], currentCell.col() + dx[i])) {
                Cell tempCell = maze.getCell(currentCell.row() + dy[i], currentCell.col() + dx[i]);
                if (!path.containsKey(tempCell) && tempCell.type() == Cell.Type.PASSAGE) {
                    neighbours.add(tempCell);
                }
            }

        }
        return neighbours;
    }
}
