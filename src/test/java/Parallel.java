import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Uwaga - sposób mierzenia czasu w poniższych metodach jest BARDZO NIEDOKŁADNY.
 * Pomiar ten nie bierze pod uwagę specyfiki działania Javy (m.in. optymalizacje JIT),
 * jest tylko poglądowy.
 * Właściwym narzędziem do przeprowadzania takich pomiarów jest np. narzędzie JMH (Java Microbenchmark Harness).
 */
public class Parallel {

    String text = Files.lines(Paths.get(getClass().getResource("king_james_bible.txt").toURI()))
            .collect(Collectors.joining(" "));
    List<String> words = Arrays.asList(text.split("\\s+"));

    public Parallel() throws IOException, URISyntaxException {
    }

    @Test
    void parallelismParameters() {
        System.out.println("Ilość dostępnych rdzeni (logical cores): " + Runtime.getRuntime().availableProcessors());
        System.out.println("Ilość wątków w domyślnej puli: " + ForkJoinPool.getCommonPoolParallelism());
    }

    /**
     * Podaj ilość liczb pierwszych od 0 do miliona.
     */
    @Test
    void task1() {
        long start = System.currentTimeMillis();

        long count = Stream.iterate(0, n -> n + 1)
                .limit(1_000_000)
//                .parallel()
                .filter(Parallel::isPrime)
                .count();

        long end = System.currentTimeMillis();
        long time = end - start;

        System.out.println("Wykonane w " + time + " ms");
        System.out.println();

        System.out.println("Znalezionych liczb pierwszych: " + count);
    }

    /**
     * Podaj statystykę słów w tekście.
     * Uwzględnij tylko słowa, odfiltrowując wszystkie znaki inne niż litery.
     */
    @Test
    void task2() {
        long start = System.currentTimeMillis();

        IntSummaryStatistics statistics = words.stream()
//                .parallel()
                .map(word -> onlyAlphabeticCharacters(word))
                .filter(word -> !word.isEmpty())
                .mapToInt(word -> word.length())
                .summaryStatistics();

        long end = System.currentTimeMillis();
        long time = end - start;

        System.out.println("Wykonane w " + time + " ms");
        System.out.println();

        System.out.println("Statystyka słów:");
        System.out.println("najdłuższe: " + statistics.getMax());
        System.out.println("średnia długość: " + statistics.getAverage());
        System.out.println("ilość: " + statistics.getCount());
    }

    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        return IntStream.rangeClosed(2, number / 2).noneMatch(i -> number % i == 0);
    }

    public static String onlyAlphabeticCharacters(String s) {
        return s.replaceAll("[^\\p{IsAlphabetic}]", "");
    }

}
