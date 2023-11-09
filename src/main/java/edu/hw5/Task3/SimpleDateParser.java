package edu.hw5.Task3;

import javax.swing.text.DateFormatter;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SimpleDateParser extends AbstractDateParser {

    private static final List<DateTimeFormatter> SUPPORTED_PATTERNS = List.of(
        DateTimeFormatter.ofPattern("yyyy-MM-dd"),
        DateTimeFormatter.ofPattern("yyyy-dd-MM"),
        DateTimeFormatter.ofPattern("d/M/yyyy"),
        DateTimeFormatter.ofPattern("d/M/yy"),
        DateTimeFormatter.ofPattern("dd/MM/yyyy"),
        DateTimeFormatter.ofPattern("dd/MM/yy")
    );

    public SimpleDateParser() {
        super();
    }

    public SimpleDateParser(AbstractDateParser nextParser) {
        super(nextParser);
    }

    @Override
    public Optional<LocalDate> parseDate(String stringDate) {
        for (DateTimeFormatter pattern : SUPPORTED_PATTERNS) {
            try {
                LocalDate date = LocalDate.parse(stringDate, pattern);
                return Optional.of(date);
            } catch (Exception ignored) {
            }
        }
        return super.parseDate(stringDate);
    }
}
