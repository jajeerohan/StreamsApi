package interviewQuestions.Hard;

import interviewQuestions.Hard.Dto.Transaction;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class HighestSpendDay {
    public static void main(String[] args) {
        List<Transaction> transactions = Arrays.asList(
                new Transaction("T1", LocalDate.of(2024, 1, 1), 300),
                new Transaction("T2", LocalDate.of(2024, 1, 1), 200),
                new Transaction("T3", LocalDate.of(2024, 1, 2), 500),
                new Transaction("T4", LocalDate.of(2024, 1, 2), 300),
                new Transaction("T5", LocalDate.of(2024, 1, 3), 100),
                new Transaction("T6", LocalDate.of(2024, 1, 4), 1000)
        );

        // Group transactions by date and sum amounts
        Map<LocalDate, Double> map = transactions.stream()
                .collect(Collectors.groupingBy(Transaction::getDate,
                        Collectors.summingDouble(Transaction::getAmount)));

        // Find the date with the highest total spend
        map.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .ifPresent(entry -> System.out.println("Date with highest spend: " + entry.getKey() + " Amount: " + entry.getValue()));

    }
}
