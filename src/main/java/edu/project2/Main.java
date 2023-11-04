package edu.project2;

import edu.project2.generators.Generator;
import edu.project2.generators.RecursiveBacktrackerGenerator;
import edu.project2.maze.Cell;
import edu.project2.maze.Maze;
import edu.project2.printers.ConsoleMazePrinter;
import edu.project2.printers.MazePrinter;
import edu.project2.solvers.BFSSolver;
import edu.project2.solvers.Solver;
import java.util.List;

@SuppressWarnings("MagicNumber")
public class Main {
    private Main() {
    }

    public static void main(String[] args) {

        Generator mazeGenerator = new RecursiveBacktrackerGenerator();
        Maze maze = mazeGenerator.generate(45, 111);
        MazePrinter mazePrinter = new ConsoleMazePrinter();
        mazePrinter.printMaze(maze);

        Solver solver = new BFSSolver();

        List<Cell> path = solver.solve(
            maze,
            maze.getCell(1, 1),
            maze.getCell(maze.getHeight() - 2, maze.getWidth() - 2)
        );

        mazePrinter.printMazeWithSolution(maze, path);

    }
}
