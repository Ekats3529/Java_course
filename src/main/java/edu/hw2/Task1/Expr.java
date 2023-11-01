package edu.hw2.Task1;

public sealed interface Expr {
    double evaluate();

    public record Constant(double digit) implements Expr {
        @Override
        public double evaluate() {
            return digit;
        }

        @Override
        public String toString() {
            return String.valueOf(digit);
        }
    }

    public record Negate(Expr digit) implements Expr {
        @Override
        public double evaluate() {
            return -digit.evaluate();
        }

        @Override
        public String toString() {
            return "-(" + digit.toString() + ")";
        }
    }

    public record Exponent(Expr digit, Expr pow) implements Expr {
        public Exponent(Expr digit, int pow) {
            this(digit, new Constant(pow));
        }

        @Override
        public double evaluate() {
            return Math.pow(digit.evaluate(), pow.evaluate());
        }

        @Override
        public String toString() {
            return digit.toString() + " ^ " + pow.toString();
        }
    }

    public record Addition(Expr digit1, Expr digit2) implements Expr {

        @Override
        public double evaluate() {
            return digit1.evaluate() + digit2.evaluate();
        }

        @Override
        public String toString() {
            return "(" + digit1.toString() + " + " + digit2.toString() + ")";
        }
    }

    public record Multiplication(Expr digit1, Expr digit2) implements Expr {

        @Override
        public double evaluate() {
            return digit1.evaluate() * digit2.evaluate();
        }

        @Override
        public String toString() {
            return "(" + digit1.toString() + " * " + digit2.toString() + ")";
        }
    }
}
