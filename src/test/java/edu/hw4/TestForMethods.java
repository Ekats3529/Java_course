package edu.hw4;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.assertEquals;

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
}
