package edu.hw4;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestForMethods {
    Methods methods = new Methods();

    @Test
    @DisplayName("task 1")
    public final void test1() {
        Animal animal1 = new Animal(
            "1",
            Animal.Type.CAT,
            Animal.Sex.F,
            Integer.MIN_VALUE,
            1,
            Integer.MIN_VALUE,
            false
        );
        Animal animal2 = new Animal(
            "2",
            Animal.Type.CAT,
            Animal.Sex.F,
            Integer.MIN_VALUE,
            2,
            Integer.MIN_VALUE,
            false
        );
        Animal animal3 = new Animal(
            "3",
            Animal.Type.DOG,
            Animal.Sex.F,
            Integer.MIN_VALUE,
            3,
            Integer.MIN_VALUE,
            false
        );

        List<Animal> animals = List.of(animal2, animal1, animal3);

        List<Animal> actual = methods.sortByHeight(animals);
        List<Animal> expected = List.of(animal1, animal2, animal3);

        assertEquals(expected, actual);

    }

    @Test
    @DisplayName("task 2")
    public final void test2() {
        Animal animal1 = new Animal(
            "2",
            Animal.Type.DOG,
            Animal.Sex.F,
            1,
            3,
            50,
            false
        );
        Animal animal2 = new Animal(
            "3",
            Animal.Type.DOG,
            Animal.Sex.F,
            1,
            3,
            40,
            false
        );
        Animal animal3 = new Animal(
            "1",
            Animal.Type.DOG,
            Animal.Sex.F,
            1,
            3,
            30,
            false
        );
        Animal animal4 = new Animal(
            "1",
            Animal.Type.DOG,
            Animal.Sex.F,
            1,
            3,
            20,
            false
        );

        List<Animal> animals = List.of(animal2, animal1, animal4, animal3);

        List<Animal> actual = methods.sortByWeight(animals, 2);
        List<Animal> expected = List.of(animal1, animal2);

        assertEquals(expected, actual);

    }

    @Test
    @DisplayName("task 3")
    public final void test3() {
        Animal animal1 = new Animal(
            "2",
            Animal.Type.CAT,
            Animal.Sex.F,
            1,
            3,
            50,
            false
        );
        Animal animal2 = new Animal(
            "3",
            Animal.Type.DOG,
            Animal.Sex.F,
            1,
            3,
            40,
            false
        );
        Animal animal3 = new Animal(
            "1",
            Animal.Type.DOG,
            Animal.Sex.F,
            1,
            3,
            30,
            false
        );
        Animal animal4 = new Animal(
            "1",
            Animal.Type.SPIDER,
            Animal.Sex.F,
            1,
            3,
            20,
            false
        );

        List<Animal> animals = List.of(animal2, animal1, animal4, animal3);

        Map<Animal.Type, Long> expected = new HashMap<>();
        expected.put(Animal.Type.DOG, 2L);
        expected.put(Animal.Type.SPIDER, 1L);
        expected.put(Animal.Type.CAT, 1L);

        Map<Animal.Type, Long> actual = methods.frequencyDict(animals);

        assertEquals(expected, actual);

    }

    @Test
    @DisplayName("task 4")
    public final void test4() {
        Animal animal1 = new Animal(
            "123456",
            Animal.Type.CAT,
            Animal.Sex.F,
            Integer.MIN_VALUE,
            1,
            Integer.MIN_VALUE,
            false
        );
        Animal animal2 = new Animal(
            "123",
            Animal.Type.CAT,
            Animal.Sex.F,
            Integer.MIN_VALUE,
            2,
            Integer.MIN_VALUE,
            false
        );
        Animal animal3 = new Animal(
            "5",
            Animal.Type.DOG,
            Animal.Sex.F,
            Integer.MIN_VALUE,
            3,
            Integer.MIN_VALUE,
            false
        );

        List<Animal> animals = List.of(animal2, animal1, animal3);

        Animal actual = methods.getLongestNameAnimal(animals);

        assertEquals(animal1, actual);

    }

    @Test
    @DisplayName("task 5")
    public final void test5() {
        Animal animal1 = new Animal(
            "2",
            Animal.Type.CAT,
            Animal.Sex.F,
            1,
            3,
            50,
            false
        );
        Animal animal2 = new Animal(
            "3",
            Animal.Type.DOG,
            Animal.Sex.F,
            1,
            3,
            40,
            false
        );
        Animal animal3 = new Animal(
            "1",
            Animal.Type.DOG,
            Animal.Sex.M,
            1,
            3,
            30,
            false
        );
        Animal animal4 = new Animal(
            "1",
            Animal.Type.SPIDER,
            Animal.Sex.F,
            1,
            3,
            20,
            false
        );

        List<Animal> animals = List.of(animal2, animal1, animal4, animal3);

        Animal.Sex actual = methods.mostCommonSex(animals);

        assertEquals(Animal.Sex.F, actual);

    }

    @Test
    @DisplayName("task 6")
    public final void test6() {
        Animal animal1 = new Animal(
            "2",
            Animal.Type.CAT,
            Animal.Sex.F,
            1,
            3,
            50,
            false
        );
        Animal animal2 = new Animal(
            "3",
            Animal.Type.DOG,
            Animal.Sex.F,
            1,
            3,
            40,
            false
        );
        Animal animal3 = new Animal(
            "1",
            Animal.Type.DOG,
            Animal.Sex.F,
            1,
            3,
            30,
            false
        );
        Animal animal4 = new Animal(
            "1",
            Animal.Type.SPIDER,
            Animal.Sex.F,
            1,
            3,
            20,
            false
        );

        List<Animal> animals = List.of(animal2, animal1, animal4, animal3);

        Map<Animal.Type, Animal> expected = new HashMap<>();
        expected.put(Animal.Type.DOG, animal2);
        expected.put(Animal.Type.SPIDER, animal4);
        expected.put(Animal.Type.CAT, animal1);

        Map<Animal.Type, Animal> actual = methods.heaviestAnimals(animals);

        assertEquals(expected, actual);

    }

    @Test
    @DisplayName("task 7")
    public final void test7() {
        Animal animal1 = new Animal(
            "2",
            Animal.Type.CAT,
            Animal.Sex.F,
            10,
            3,
            50,
            false
        );
        Animal animal2 = new Animal(
            "3",
            Animal.Type.DOG,
            Animal.Sex.F,
            7,
            3,
            40,
            false
        );
        Animal animal3 = new Animal(
            "1",
            Animal.Type.DOG,
            Animal.Sex.F,
            12,
            3,
            30,
            false
        );
        Animal animal4 = new Animal(
            "1",
            Animal.Type.SPIDER,
            Animal.Sex.F,
            2,
            3,
            20,
            false
        );

        List<Animal> animals = List.of(animal2, animal1, animal4, animal3);

        Animal actual = methods.kthOldest(animals, 3);

        assertEquals(animal2, actual);

    }

    @Test
    @DisplayName("task 8")
    public final void test8() {
        Animal animal1 = new Animal(
            "2",
            Animal.Type.CAT,
            Animal.Sex.F,
            10,
            99,
            50,
            false
        );
        Animal animal2 = new Animal(
            "3",
            Animal.Type.DOG,
            Animal.Sex.F,
            7,
            90,
            40,
            false
        );
        Animal animal3 = new Animal(
            "1",
            Animal.Type.DOG,
            Animal.Sex.F,
            12,
            120,
            30,
            false
        );
        Animal animal4 = new Animal(
            "1",
            Animal.Type.SPIDER,
            Animal.Sex.F,
            2,
            35,
            20,
            false
        );

        List<Animal> animals = List.of(animal2, animal1, animal4, animal3);

        Animal actual = methods.heaviestBelowK(animals, 100).get();

        assertEquals(animal1, actual);

    }

    @Test
    @DisplayName("task 9")
    public final void test9() {
        Animal animal1 = new Animal(
            "2",
            Animal.Type.CAT,
            Animal.Sex.F,
            10,
            99,
            50,
            false
        );
        Animal animal2 = new Animal(
            "3",
            Animal.Type.FISH,
            Animal.Sex.F,
            7,
            90,
            40,
            false
        );
        Animal animal3 = new Animal(
            "1",
            Animal.Type.DOG,
            Animal.Sex.F,
            12,
            120,
            30,
            false
        );
        Animal animal4 = new Animal(
            "1",
            Animal.Type.SPIDER,
            Animal.Sex.F,
            2,
            35,
            20,
            false
        );

        List<Animal> animals = List.of(animal2, animal1, animal4, animal3);

        Integer actual = methods.sumOfPaws(animals);

        assertEquals(16, actual);

    }

    @Test
    @DisplayName("task 10")
    public final void test10() {
        Animal animal1 = new Animal(
            "2",
            Animal.Type.CAT,
            Animal.Sex.F,
            4,
            99,
            50,
            false
        );
        Animal animal2 = new Animal(
            "3",
            Animal.Type.FISH,
            Animal.Sex.F,
            7,
            90,
            40,
            false
        );
        Animal animal3 = new Animal(
            "1",
            Animal.Type.DOG,
            Animal.Sex.F,
            12,
            120,
            30,
            false
        );
        Animal animal4 = new Animal(
            "1",
            Animal.Type.SPIDER,
            Animal.Sex.F,
            8,
            35,
            20,
            false
        );

        List<Animal> animals = List.of(animal2, animal1, animal4, animal3);

        List<Animal> expected = List.of(animal2, animal3);
        List<Animal> actual = methods.ageNotEqualPaws(animals);

        assertEquals(expected, actual);

    }

    @Test
    @DisplayName("task 11")
    public final void test11() {
        Animal animal1 = new Animal(
            "2",
            Animal.Type.CAT,
            Animal.Sex.F,
            4,
            99,
            50,
            false
        );
        Animal animal2 = new Animal(
            "3",
            Animal.Type.FISH,
            Animal.Sex.F,
            7,
            110,
            40,
            false
        );
        Animal animal3 = new Animal(
            "1",
            Animal.Type.DOG,
            Animal.Sex.F,
            12,
            120,
            30,
            true
        );
        Animal animal4 = new Animal(
            "1",
            Animal.Type.SPIDER,
            Animal.Sex.F,
            8,
            35,
            20,
            true
        );

        List<Animal> animals = List.of(animal2, animal1, animal4, animal3);

        List<Animal> expected = List.of(animal3);
        List<Animal> actual = methods.canBiteMoreThanHundred(animals);

        assertEquals(expected, actual);

    }

    @Test
    @DisplayName("task 12")
    public final void test12() {
        Animal animal1 = new Animal(
            "2",
            Animal.Type.CAT,
            Animal.Sex.F,
            4,
            99,
            50,
            false
        );
        Animal animal2 = new Animal(
            "3",
            Animal.Type.FISH,
            Animal.Sex.F,
            7,
            10,
            40,
            false
        );
        Animal animal3 = new Animal(
            "1",
            Animal.Type.DOG,
            Animal.Sex.F,
            12,
            120,
            30,
            true
        );
        Animal animal4 = new Animal(
            "1",
            Animal.Type.SPIDER,
            Animal.Sex.F,
            8,
            15,
            20,
            true
        );

        List<Animal> animals = List.of(animal2, animal1, animal4, animal3);

        long actual = methods.countWeightGreaterHeight(animals);

        assertEquals(2, actual);

    }

    @Test
    @DisplayName("task 13")
    public final void test13() {
        Animal animal1 = new Animal(
            "a a a",
            Animal.Type.CAT,
            Animal.Sex.F,
            4,
            99,
            50,
            false
        );
        Animal animal2 = new Animal(
            "a a",
            Animal.Type.FISH,
            Animal.Sex.F,
            7,
            10,
            40,
            false
        );
        Animal animal3 = new Animal(
            "s",
            Animal.Type.DOG,
            Animal.Sex.F,
            12,
            120,
            30,
            true
        );
        Animal animal4 = new Animal(
            "asass",
            Animal.Type.SPIDER,
            Animal.Sex.F,
            8,
            15,
            20,
            true
        );

        List<Animal> animals = List.of(animal1, animal2, animal3, animal3);

        List<Animal> actual = methods.nameMoreTwoWords(animals);
        List<Animal> expected = List.of(animal1, animal2);

        assertEquals(expected, actual);

    }

    @Test
    @DisplayName("task 14")
    public final void test14() {
        Animal animal1 = new Animal(
            "2",
            Animal.Type.CAT,
            Animal.Sex.F,
            4,
            99,
            50,
            false
        );
        Animal animal2 = new Animal(
            "3",
            Animal.Type.FISH,
            Animal.Sex.F,
            7,
            10,
            40,
            false
        );
        Animal animal3 = new Animal(
            "1",
            Animal.Type.DOG,
            Animal.Sex.F,
            12,
            120,
            30,
            true
        );
        Animal animal4 = new Animal(
            "1",
            Animal.Type.SPIDER,
            Animal.Sex.F,
            8,
            15,
            20,
            true
        );

        List<Animal> animals = List.of(animal2, animal1, animal4, animal3);

        Boolean actual = methods.isInListDogMoreThanK(animals, 100);

        assertTrue(actual);

    }

    @Test
    @DisplayName("task 15")
    public final void test15() {
        int l = 10;
        int k = 4;

        Animal animal1 = new Animal(
            "2",
            Animal.Type.CAT,
            Animal.Sex.F,
            4,
            99,
            50,
            false
        );
        Animal animal2 = new Animal(
            "3",
            Animal.Type.CAT,
            Animal.Sex.F,
            7,
            10,
            40,
            false
        );
        Animal animal3 = new Animal(
            "1",
            Animal.Type.DOG,
            Animal.Sex.F,
            12,
            120,
            30,
            true
        );
        Animal animal4 = new Animal(
            "1",
            Animal.Type.DOG,
            Animal.Sex.F,
            8,
            15,
            20,
            true
        );

        List<Animal> animals = List.of(animal2, animal1, animal4, animal3);

        Map<Animal.Type, Integer> expected = new HashMap<>();
        expected.put(Animal.Type.DOG, 20);
        expected.put(Animal.Type.CAT, 90);

        Map<Animal.Type, Integer> actual = methods.sumWeightEachType(animals, k, l);

        assertEquals(expected, actual);

    }

    @Test
    @DisplayName("task 16")
    public final void test16() {
        Animal animal1 = new Animal(
            "aaa",
            Animal.Type.CAT,
            Animal.Sex.F,
            4,
            99,
            50,
            false
        );
        Animal animal2 = new Animal(
            "bbb",
            Animal.Type.FISH,
            Animal.Sex.F,
            7,
            10,
            40,
            false
        );
        Animal animal3 = new Animal(
            "ccc",
            Animal.Type.CAT,
            Animal.Sex.M,
            12,
            120,
            30,
            true
        );
        Animal animal4 = new Animal(
            "ddd",
            Animal.Type.CAT,
            Animal.Sex.F,
            8,
            15,
            20,
            true
        );

        List<Animal> animals = List.of(animal1, animal2, animal3, animal4);

        List<Animal> actual = methods.sortByTypeSexName(animals);
        List<Animal> expected = List.of(animal3, animal1, animal4, animal2);

        assertEquals(expected, actual);

    }

    @Test
    @DisplayName("task 17")
    public final void test17() {
        Animal animal1 = new Animal(
            "aaa",
            Animal.Type.DOG,
            Animal.Sex.F,
            4,
            99,
            50,
            false
        );
        Animal animal2 = new Animal(
            "bbb",
            Animal.Type.SPIDER,
            Animal.Sex.F,
            7,
            10,
            40,
            true
        );
        Animal animal3 = new Animal(
            "ccc",
            Animal.Type.SPIDER,
            Animal.Sex.M,
            12,
            120,
            30,
            true
        );
        Animal animal4 = new Animal(
            "ddd",
            Animal.Type.DOG,
            Animal.Sex.F,
            8,
            15,
            20,
            true
        );

        List<Animal> animals = List.of(animal1, animal2, animal3, animal4);

        boolean actual = methods.isSpidersBitesMoreThanDogs(animals);

        assertTrue(actual);

    }

    @Test
    @DisplayName("task 18")
    public final void test18() {
        Animal animal1 = new Animal(
            "aaa",
            Animal.Type.FISH,
            Animal.Sex.F,
            4,
            99,
            50,
            false
        );
        Animal animal2 = new Animal(
            "bbb",
            Animal.Type.FISH,
            Animal.Sex.F,
            7,
            10,
            40,
            true
        );
        Animal animal3 = new Animal(
            "ccc",
            Animal.Type.SPIDER,
            Animal.Sex.M,
            12,
            120,
            30,
            true
        );
        Animal animal4 = new Animal(
            "ddd",
            Animal.Type.DOG,
            Animal.Sex.F,
            8,
            15,
            20,
            true
        );

        List<Animal> animals1 = List.of(animal1, animal3);
        List<Animal> animals2 = List.of(animal2, animal4);

        List<List<Animal>> animals = List.of(animals1, animals2);

        Animal actual = methods.heaviestFish(animals);

        assertEquals(animal1, actual);

    }

    @Test
    @DisplayName("task 19")
    public final void test19() {
        Animal animal1 = new Animal(
            "some",
            null,
            null,
            -1,
            0,
            -50,
            false
        );

        List<Animal> animals = List.of(animal1);

        Set<Methods.ValidationError> expected = Set.of(
            new Methods.ValidationError(
                "Name must starts with capital character",
                Methods.ValidationErrorType.NAME
            ),
            new Methods.ValidationError(
                "Type cannot be null",
                Methods.ValidationErrorType.TYPE
            ),
            new Methods.ValidationError(
                "Sex cannot be null",
                Methods.ValidationErrorType.SEX
            ),
            new Methods.ValidationError(
                "Age must be non-negative",
                Methods.ValidationErrorType.AGE
            ),
            new Methods.ValidationError(
                "Height must be positive",
                Methods.ValidationErrorType.HEIGHT
            ),
            new Methods.ValidationError(
                "Weight must be positive",
                Methods.ValidationErrorType.WEIGHT
            )
        );

        Set<Methods.ValidationError> actual = methods.animalError(animals).get("some");

        assertEquals(expected, actual);

    }

    @Test
    @DisplayName("task 20")
    public final void test20() {
        Animal animal1 = new Animal(
            "",
            null,
            Animal.Sex.F,
            -1,
            0,
            -50,
            false
        );

        List<Animal> animals = List.of(animal1);

        String expected = "AGE; HEIGHT; NAME; TYPE; WEIGHT";

        String actual = methods.animalErrorToString(animals).get("");

        assertEquals(expected, actual);

    }
}
