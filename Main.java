

import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        System.out.println("Wszystkie mecze:");
        List<FootbalMatches> footbalMatchesList = createMatches();
        footbalMatchesList.stream().sorted((Comparator.comparingInt(FootbalMatches::sortScore).reversed()))
                        .forEach(System.out::println);
        System.out.println(">>>>");
        System.out.println("Wszystkie spotkania Polski: ");
        String name = "Polska";
        filtrByCountry(footbalMatchesList, name).forEach(System.out::println);
        System.out.println(">>>>");
        System.out.println("Suma wszystkich bramek " + scoreCount(footbalMatchesList));
        System.out.println("Liczba dużyn bioracych udzial w rozgrywkach " + uniqueCount(footbalMatchesList));




    }

    private static long uniqueCount(List<FootbalMatches> matches) {

       return  matches.stream()
                .flatMap(unique -> Stream.of((unique.getHomeTeam()) ,( unique.getVisitingTeam()) ))

                .distinct()
                //.peek(System.out::println)
                .count();
    }

    private static List<FootbalMatches> filtrByCountry(List<FootbalMatches> matches, String name) {
        return matches.stream()
                .filter(footbalMatches -> name.equals(footbalMatches.getHomeTeam()) || name.equals(footbalMatches.getVisitingTeam())).toList();
    }

    private static int scoreCount(List<FootbalMatches> matches) {
        return matches.stream()
                .map(FootbalMatches::bothScore)
                .reduce(0, Integer::sum);
    }

    private static List<FootbalMatches> createMatches() {
        return List.of(
                new FootbalMatches("Brazylia", 5, "Francja", 1),
                new FootbalMatches("Polska", 0, "Niemcy", 0),
                new FootbalMatches("Anglia", 1, "Argentyna", 2),
                new FootbalMatches("Włochy", 3, "Irlandia", 2),
                new FootbalMatches("San Marino", 3, "Polska", 0),
                new FootbalMatches("Anglia", 2, "Niemcy", 1),
                new FootbalMatches("Francja", 4, "Włochy", 1),
                new FootbalMatches("Brazylia2", 0, "San Marino", 3),
                new FootbalMatches("Portugalia", 0, "Polska", 2),
                new FootbalMatches("Włochy", 6, "Anglia2", 4),
                new FootbalMatches("Włochy2", 3, "Anglia2", 4)
        );
    }
}
