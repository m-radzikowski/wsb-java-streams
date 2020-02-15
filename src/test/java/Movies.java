import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Movies {

    List<Movie> topMovies = Arrays.asList(
            new Movie("Skazani na Shawshank", 1994, 8.75, "Frank Darabont", 25_000_000, 59_841_469),
            new Movie("Nietykalni", 2011, 8.63, "Olivier Nakache", 9_500_000, 426_588_510),
            new Movie("Zielona mila", 1999, 8.61, "Frank Darabont", 60_000_000, 286_801_374),
            new Movie("Ojciec chrzestny", 1972, 8.59, "Francis Ford Coppola", 6_000_000, 245_066_411),
            new Movie("Dwunastu gniewnych ludzi", 1957, 8.54, "Sidney Lumet", 340_000, 2_000_000),
            new Movie("Forrest Gump", 1994, 8.52, "Robert Zemeckis", 55_000_000, 677_387_716),
            new Movie("Lot nad kukułczym gniazdem", 1975, 8.44, "Miloš Forman", 3_000_000, 108_981_275),
            new Movie("Ojciec chrzestny II", 1974, 8.38, "Francis Ford Coppola", 13_000_000, 193_000_000),
            new Movie("Joker", 2019, 8.36, "Todd Phillips", 55_000_000, 1_071_014_743),
            new Movie("Lista Schindlera", 1993, 8.33, "Steven Spielberg", 22_000_000, 322_139_355)
    );

    /**
     * Podaj tytuły filmów powstałych przed rokiem 2000.
     */
    @Test
    void task1() {
        List<String> movies = Collections.emptyList(); // TODO Zastąp tworzenie pustej listy implementacją

        System.out.println("Filmy powstałe przed rokiem 2000:");
        System.out.println(movies);

        List<String> expected = Arrays.asList("Skazani na Shawshank", "Zielona mila", "Ojciec chrzestny", "Dwunastu gniewnych ludzi", "Forrest Gump", "Lot nad kukułczym gniazdem", "Ojciec chrzestny II", "Lista Schindlera");
        assertEquals(expected, movies);
    }

    /**
     * Podaj tytuły 3 najlepiej ocenionych filmów, których budżet wynosił poniżej 10 milionów dolarów.
     */
    @Test
    void task2() {
        List<String> movies = Collections.emptyList(); // TODO Zastąp tworzenie pustej listy implementacją

        System.out.println("3 najlepsze filmy z budżetem poniżej $10.000.000:");
        System.out.println(movies);

        List<String> expected = Arrays.asList("Nietykalni", "Ojciec chrzestny", "Dwunastu gniewnych ludzi");
        assertEquals(expected, movies);
    }

    /**
     * Podaj reżyserów 5 najlepszych filmów, zapisane WIELKIMI LITERAMI.
     */
    @Test
    void task3() {
        List<String> directors = Collections.emptyList(); // TODO Zastąp tworzenie pustej listy implementacją

        System.out.println("Reżyserzy najlepszych filmów:");
        System.out.println(directors);

        List<String> expected = Arrays.asList("FRANK DARABONT", "OLIVIER NAKACHE", "FRANK DARABONT", "FRANCIS FORD COPPOLA", "SIDNEY LUMET");
        assertEquals(expected, directors);
    }

    /**
     * Podaj reżyserów 5 najlepszych filmów, zapisane WIELKIMI LITERAMI. Użyj metody distinct() aby usunąć duplikaty.
     */
    @Test
    void task4() {
        List<String> directors = Collections.emptyList(); // TODO Zastąp tworzenie pustej listy implementacją

        System.out.println("Reżyserzy najlepszych filmów:");
        System.out.println(directors);

        List<String> expected = Arrays.asList("FRANK DARABONT", "OLIVIER NAKACHE", "FRANCIS FORD COPPOLA", "SIDNEY LUMET", "ROBERT ZEMECKIS");
        assertEquals(expected, directors);
    }

    /**
     * Podaj opisy filmów w formacie: Tytuł (rok) - reżyser
     */
    @Test
    void task5() {
        List<String> movies = Collections.emptyList(); // TODO Zastąp tworzenie pustej listy implementacją

        System.out.println("Najlepsze filmy:");
        System.out.println(movies);

        assertEquals("Skazani na Shawshank (1994) - Frank Darabont", movies.get(0));
    }

}
