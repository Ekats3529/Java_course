package edu.project2.printers;

import edu.project2.maze.Cell;
import edu.project2.maze.Maze;
import java.util.List;

public interface MazePrinter {
    void printMaze(Maze maze);

    void printMazeWithSolution(Maze maze, List<Cell> solution);
}
