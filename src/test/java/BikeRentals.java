import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.collection.IsMapContaining.hasEntry;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BikeRentals {

    List<BikeRental> rentals = Files.lines(Paths.get(getClass().getResource("bike_rentals_2019-07.csv").toURI()))
            .skip(1)
            .map(line -> line.split(","))
            .map(fields -> new BikeRental(
                    LocalDateTime.parse(fields[0], DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")),
                    Integer.parseInt(fields[1]),
                    LocalDateTime.parse(fields[2], DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")),
                    Integer.parseInt(fields[3]),
                    Integer.parseInt(fields[4]),
                    "1".equals(fields[4])
            ))
            .collect(Collectors.toList());

    List<BikeStation> stations = Files.lines(Paths.get(getClass().getResource("bike_stations.csv").toURI()))
            .skip(1)
            .map(line -> line.split(","))
            .map(fields -> new BikeStation(
                    Integer.parseInt(fields[0]),
                    fields[1],
                    Double.parseDouble(fields[2]),
                    Double.parseDouble(fields[3])
            ))
            .collect(Collectors.toList());

    public BikeRentals() throws IOException, URISyntaxException {
    }

    /**
     * Podaj kody i sumaryczne ilości wypożyczeń dla 3 stacji, z których najczęściej wypożyczano rowery.
     * Podpowiedź: stwórz mapę [stacja początkowa -> wypożyczenia],
     * następnie na podstawie jej elementów stwórz docelową strukturę.
     */
    @Test
    void task1() {
        Map<Integer, List<BikeRental>> byStartStation = Collections.emptyMap(); // TODO Napisz implementację

        Map<Integer, Integer> rentalsByStation = Collections.emptyMap(); // TODO Napisz implementację

        System.out.println("Najpopularniejsze stacje:");
        rentalsByStation.forEach((key, value) -> System.out.println("Stacja " + key + ": " + value + " wypożyczeń"));

        assertThat(rentalsByStation, hasEntry(6052, 8780));
        assertThat(rentalsByStation, hasEntry(6184, 8266));
        assertThat(rentalsByStation, hasEntry(6136, 8626));
    }

    /**
     * Podaj sumę przejechanych kilometrów przez wszystkie rowery.
     * Porównaj czas z używaniem przetwarzania równoległego przy obliczaniu wartości totalDistanceMeters.
     */
    @Test
    void task2() {
        Map<Integer, List<BikeStation>> byStartStation = Collections.emptyMap(); // TODO Napisz implementację

        Map<Integer, BikeStation> stationsByCode = Collections.emptyMap(); // TODO Napisz implementację

        double totalDistanceMeters = 0; // TODO Napisz implementację

        long totalDistanceKM = Math.round(totalDistanceMeters / 1000);

        System.out.println("Rowery przejechały w sumie " + totalDistanceKM + " km");

        assertEquals(2_106_093, totalDistanceKM);
    }

    /**
     * Podaj statystykę wypożyczeń dla wszystkich stacji.
     * Użyj Collectors.groupingBy podając inny collector z Collectors jako drugi argument,
     * by w jednej operacji pogrupować i zliczyć elementy.
     */
    @Test
    void task3() {
        Map<Integer, Long> rentalsByStation = Collections.emptyMap(); // TODO Napisz implementację

        System.out.println("Wypożyczenia wg stacji:");
        rentalsByStation.forEach((key, value) -> System.out.println(key + ": " + value + " wypożyczeń"));

        assertEquals(615, rentalsByStation.size());
        assertEquals(2470, rentalsByStation.get(6145));
    }

    /**
     * Liczy odległość między dwoma współrzędnymi geograficznymi.
     *
     * @return Odległość w metrach.
     */
    public static double distance(double latitude1, double longitude1, double latitude2, double longitude2) {
        final int R = 6371; // radius of the earth

        double latDistance = Math.toRadians(latitude2 - latitude1);
        double lonDistance = Math.toRadians(longitude2 - longitude1);
        double a = Math.sin(latDistance / 2) * Math.sin(latDistance / 2)
                + Math.cos(Math.toRadians(latitude1)) * Math.cos(Math.toRadians(latitude2))
                * Math.sin(lonDistance / 2) * Math.sin(lonDistance / 2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));

        return R * c * 1000; // convert to meters
    }

}
