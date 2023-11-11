package edu.hw5;

public final class Task8 {
    private Task8() {

    }

    /* Напишите регулярные выражения для строк из алфавита {0, 1} */
    /* нечетной длины */
    public static boolean isLengthOdd(String str) {
        return str.matches("^[01]([01]{2})*$");
    }

    /* начинается с 0 и имеет нечетную длину, или начинается с 1 и имеет четную длину */
    public static boolean startsWithZeroLengthEvenOrStartsWithOneLengthOdd(String str) {
        return str.matches("^0([01]{2})*$|^1[01]([01]{2})*$");
    }

    /* количество 0 кратно 3 */
    public static boolean countOfZeroMultipleOfThree(String str) {
        return false;
    }

    /* любая строка, кроме 11 или 111 */
    public static boolean notTwoOrThreeOnes(String str) {
        return str.matches("^(?!(11$|111$))[01]*$");
    }

    /* каждый нечетный символ равен 1 */
    public static boolean everyOddIsOne(String str) {
        return str.matches("^1([01]1)*[01]?$");
    }

    /* содержит не менее двух 0 и не более одной 1 */
    public static boolean containsAtLeastTwoZeroAndSingleOrNoOne(String str) {
        return str.matches("^0*(010|100|001|00)0*$");
    }

    /* нет последовательных 1 */
    public static boolean noConcurrentOnes(String str) {
        return str.matches("^(0|10)*$");
    }

}
