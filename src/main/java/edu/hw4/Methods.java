package edu.hw4;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;
import static edu.hw4.Animal.Sex;
import static edu.hw4.Animal.Type;

public class Methods {

    //task 1 Отсортировать животных по росту от самого маленького
    // к самому большому -> List<Animal>
    public List<Animal> sortByHeight(List<Animal> animals) {
        return animals.stream()
            .sorted(Comparator.comparingInt(Animal::height))
            .toList();
    }

    //task 2 Отсортировать животных по весу от самого тяжелого к самому легкому,
    // выбрать k первых -> List<Animal>
    public List<Animal> sortByWeight(List<Animal> animals, int k) {
        return animals.stream()
            .sorted(Comparator.comparingInt(Animal::weight).reversed())
            .limit(k)
            .toList();
    }

    //task 3 Сколько животных каждого вида -> Map<Animal.Type, Integer>
    public Map<Type, Long> frequencyDict(List<Animal> animals) {
        return animals.stream()
            .collect(Collectors.groupingBy(
            Animal::type,
            Collectors.counting()
        ));
    }

    //task 4 У какого животного самое длинное имя -> Animal
    public Animal getLongestNameAnimal(List<Animal> animals) {
        return animals.stream()
            .max(Comparator.comparing(animal -> animal.name().length()))
            .orElseThrow();
    }

    //task 5 Каких животных больше: самцов или самок -> Sex
    public Sex mostCommonSex(List<Animal> animals) {
        int maleCount = (int) animals.stream()
            .filter(animal -> animal.sex() == Sex.M)
            .count();

        if (2 * maleCount > animals.size()) {
            return Sex.M;
        }
        return Sex.F;
    }

    //task 6 Самое тяжелое животное каждого вида -> Map<Animal.Type, Animal>
    public Map<Type, Animal> heaviestAnimals(List<Animal> animals) {
        return animals.stream()
            .collect(Collectors.toMap(
                Animal::type,
                Function.identity(),
                BinaryOperator.maxBy(Comparator.comparing(Animal::weight))
            ));
    }

    //task 7 K-е самое старое животное -> Animal
    public Animal kthOldest(List<Animal> animals, int k) {
        return animals.stream()
            .sorted(Comparator.comparingInt(Animal::age).reversed())
            .skip(k - 1)
            .findFirst()
            .orElse(null);
    }

    //task 8 Самое тяжелое животное среди животных ниже k см -> Optional<Animal>
    public Optional<Animal> heaviestBelowK(List<Animal> animals, int k) {
        return animals.stream()
            .filter(animal -> animal.height() < k)
            .max(Comparator.comparing(Animal::weight));
    }

    //task 9 Сколько в сумме лап у животных в списке -> Integer
    public Integer sumOfPaws(List<Animal> animals) {
        return animals.stream()
            .mapToInt(Animal::paws)
            .sum();
    }

    //task 10 Список животных, возраст у которых не совпадает с количеством лап -> List<Animal>
    public List<Animal> ageNotEqualPaws(List<Animal> animals) {
        return animals.stream()
            .filter(animal -> animal.paws() != animal.age())
            .toList();
    }
}
