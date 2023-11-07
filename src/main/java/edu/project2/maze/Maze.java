package edu.project2.maze;

public final class Maze {
    private final int height;
    private final int width;
    private final Cell[][] grid;

    public Maze(int height, int width, Cell[][] grid) {
        this.height = height;
        this.width = width;
        this.grid = grid;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public Cell getCell(int row, int col) {
        return grid[row][col];
    }

    public boolean isValidCell(int row, int col) {
        return (0 < col && col < width - 1) && (0 < row && row < height - 1);
    }

}
