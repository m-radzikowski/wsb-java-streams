import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Numbers {

    List<Integer> numbers = Arrays.asList(75, 89, 80, 20, 92, 4, 48, 9, 5, 14, 1, 65, 99, 21, 73, 43, 40, 1, 58, 48, 38, 74, 87, 85, 54, 26, 83, 54, 13, 32, 13, 57, 82, 7, 27, 4, 17, 37, 38, 53, 26, 21, 17, 24, 5, 70, 22, 42, 45, 22, 34, 97, 33, 100, 72, 71, 89, 84, 96, 35, 69, 27, 63, 87, 90, 46, 84, 58, 98, 87, 90, 77, 72, 99, 8, 73, 6, 78, 43, 57, 73, 86, 83, 65, 64, 3, 22, 50, 100, 87, 98, 13, 61, 66, 5, 86, 39, 83, 70, 85);

    /**
     * Znajdź wszystkie liczby większe od 50 z listy "numbers".
     */
    @Test
    void task1_imperative() {
        List<Integer> above50 = new ArrayList<>();
        for (Integer number : numbers) {
            if (number > 50) {
                above50.add(number);
            }
        }

        System.out.println("Liczby większe od 50:");
        System.out.println(above50);

        assertEquals(54, above50.size());
    }

    /**
     * Znajdź wszystkie liczby większe od 50 z listy "numbers".
     */
    @Test
    void task1_functional() {
        List<Integer> above50 = numbers; // TODO Napisz implementację wykorzystując strumienie i przypisz wynik do zmiennej "above50"

        System.out.println("Liczby większe od 50:");
        System.out.println(above50);

        assertEquals(54, above50.size());
    }

    /**
     * Pomnóż wszystkie liczby przez 2.
     */
    @Test
    void task2() {
        List<Integer> multipliedBy2 = numbers; // TODO Napisz implementację

        System.out.println("Liczby pomnożone przez 2:");
        System.out.println(multipliedBy2);

        List<Integer> expected = Arrays.asList(150, 178, 160, 40, 184, 8, 96, 18, 10, 28, 2, 130, 198, 42, 146, 86, 80, 2, 116, 96, 76, 148, 174, 170, 108, 52, 166, 108, 26, 64, 26, 114, 164, 14, 54, 8, 34, 74, 76, 106, 52, 42, 34, 48, 10, 140, 44, 84, 90, 44, 68, 194, 66, 200, 144, 142, 178, 168, 192, 70, 138, 54, 126, 174, 180, 92, 168, 116, 196, 174, 180, 154, 144, 198, 16, 146, 12, 156, 86, 114, 146, 172, 166, 130, 128, 6, 44, 100, 200, 174, 196, 26, 122, 132, 10, 172, 78, 166, 140, 170);
        assertEquals(expected, multipliedBy2);
    }

    /**
     * Podaj 5 pierwszych (w kolejności) liczb z listy.
     */
    @Test
    void task3() {
        List<Integer> first5 = numbers; // TODO Napisz implementację

        System.out.println("Pierwsze 5 liczb:");
        System.out.println(first5);

        List<Integer> expected = Arrays.asList(75, 89, 80, 20, 92);
        assertEquals(expected, first5);
    }

    /**
     * Oblicz sumę, iloczyn, minimum i maksimum pierwszych 5 liczb z listy za pomocą redukcji.
     */
    @Test
    void task4() {
        int sum = 0; // TODO Napisz implementację
        int product = 0; // TODO Napisz implementację
        int min = 0; // TODO Napisz implementację
        int max = 0; // TODO Napisz implementację

        System.out.println("Suma: " + sum);
        System.out.println("Iloczyn: " + product);
        System.out.println("Minimum: " + min);
        System.out.println("Maksimum: " + max);

        assertEquals(356, sum);
        assertEquals(982560000, product);
        assertEquals(20, min);
        assertEquals(92, max);
    }

}
