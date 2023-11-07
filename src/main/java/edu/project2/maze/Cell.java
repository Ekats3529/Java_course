package edu.project2.maze;

public record Cell(int row, int col, Type type, boolean isVisited) {
    public enum Type { WALL, PASSAGE }

    public Cell setTypeAndVisited(Type type, boolean isVisited) {
        return new Cell(row(), col(), type, isVisited);
    }
}
