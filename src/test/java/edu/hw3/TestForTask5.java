package edu.hw3;

import edu.hw3.Task5.Contact;
import edu.hw3.Task5.Task5;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestForTask5 {
    static Stream<Arguments> contactManagerParameters() {
        return Stream.of(
            Arguments.of(
                List.of("John Locke", "Thomas Aquinas", "David Hume", "Rene Descartes"),
                "ASC",
                List.of(
                    new Contact("Thomas", "Aquinas"),
                    new Contact("Rene", "Descartes"),
                    new Contact("David", "Hume"),
                    new Contact("John", "Locke")
                )
            ),
            Arguments.of(
                List.of("Paul Erdos", "Leonhard Euler", "Carl Gauss"),
                "DESC",
                List.of(
                    new Contact("Carl Gauss"),
                    new Contact("Leonhard Euler"),
                    new Contact("Paul Erdos")
                )
            ),
            Arguments.of(Collections.emptyList(), "DESC", Collections.emptyList()),
            Arguments.of(null, "DESC", Collections.emptyList())
        );
    }

    @ParameterizedTest
    @MethodSource("contactManagerParameters")
    void testContactManager(
        List<String> input, String order, List<Contact> expected
    ) {
        Task5 task5 = new Task5();

        List<Contact> actual = task5.parseContacts(input, order);

        assertEquals(expected, actual);
    }
}
