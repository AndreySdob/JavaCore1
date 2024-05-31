import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>(Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4));

        // Отфильтровать положительные числа
        List<Integer> positiveNumbers = new ArrayList<>();
        for (Integer num : intList) {
            if (num > 0) {
                positiveNumbers.add(num);
            }
        }

        // Найти среди положительных чисел четные
        List<Integer> evenPositiveNumbers = new ArrayList<>();
        for (Integer num : positiveNumbers) {
            if (num % 2 == 0) {
                evenPositiveNumbers.add(num);
            }
        }

        // Отсортировать числа в порядке возрастания
        Collections.sort(evenPositiveNumbers);

        // Вывести результат на экран
        for (Integer num : evenPositiveNumbers) {
            System.out.println(num);
        }
    }
}