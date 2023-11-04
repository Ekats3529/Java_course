package edu.project2.printers;

import edu.project2.maze.Cell;
import edu.project2.maze.Maze;
import java.util.List;

@SuppressWarnings("RegexpSinglelineJava")
public class ConsoleMazePrinter implements MazePrinter {
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RED = "\u001B[31m";

    private static final Character WALL_SYMBOL = '▉';
    private static final Character EMPTY_SYMBOL = '░';
    private static final Character SOLUTION_SYMBOL = '▒';

    @Override
    @SuppressWarnings("RegexpSinglelineJava")
    public void printMaze(Maze maze) {
        int mazeWidth = maze.getWidth();
        int mazeHeight = maze.getHeight();

        for (int i = 0; i < mazeHeight; i++) {
            for (int j = 0; j < mazeWidth; j++) {
                Cell tempCell = maze.getCell(i, j);

                if (tempCell.type() == Cell.Type.WALL) {
                    System.out.print(ANSI_BLACK + WALL_SYMBOL + ANSI_BLACK);
                } else {
                    System.out.print(ANSI_GREEN + EMPTY_SYMBOL + ANSI_GREEN);
                }
            }
            System.out.println();
        }
    }

    @Override
    public void printMazeWithSolution(Maze maze, List<Cell> solution) {
        int mazeWidth = maze.getWidth();
        int mazeHeight = maze.getHeight();

        for (int i = 0; i < mazeHeight; i++) {
            for (int j = 0; j < mazeWidth; j++) {
                Cell curCell = maze.getCell(i, j);

                if (curCell.type() == Cell.Type.WALL) {
                    System.out.print(ANSI_BLACK + WALL_SYMBOL + ANSI_BLACK);
                } else {
                    if (solution.contains(curCell)) {
                        System.out.print(ANSI_RED + SOLUTION_SYMBOL + ANSI_RED);
                    } else {
                        System.out.print(ANSI_GREEN + EMPTY_SYMBOL + ANSI_GREEN);
                    }
                }
            }
            System.out.println();
        }
    }
}
