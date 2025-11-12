package interviewQuestions.Easy;

import java.util.List;

public class CountStartingWithA {

    public static void main(String[] args) {

        List<String> names = List.of("Apple", "Banana", "Avocado", "Mango", "Apricot");
        long count = names.stream().filter(name->name.startsWith("A")).count();
        System.out.println(count);

    }

}
