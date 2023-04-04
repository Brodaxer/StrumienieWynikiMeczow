
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<FootbalMatches> footbalMatchesList = createMatches();
        footbalMatchesList.stream().sorted((f1,f2) -> -Integer.compare(f1.getScoreHome(), f2.getScoreVisiting()))
                .forEach(System.out::println);
        System.out.println("Podaj nazwe kraju aby odfiltrowac: ");
        String name =sc.nextLine();
        filtrByCountry(footbalMatchesList,name).forEach(System.out::println);
    }
    private static List<FootbalMatches> filtrByCountry(List<FootbalMatches> matches,String name){
        return matches.stream()
                .filter(footbalMatches -> name.equals(footbalMatches.getHomeTeam()) || name.equals(footbalMatches.getVisitingTeam())).toList();
    }
    private static List<FootbalMatches> createMatches (){

        return List.of(
                new FootbalMatches("Brazylia",5,"Francja",1),
                new FootbalMatches("Polska",0,"Niemcy",0),
                new FootbalMatches("Anglia", 1,"Argentyna",2),
                new FootbalMatches("Włochy",3,"Irlandia",2),
                new FootbalMatches("San Marino", 3,"Polska", 0),
                new FootbalMatches("Anglia",2,"Niemcy",1),
                new FootbalMatches("Francja",4,"Włochy",1),
                new FootbalMatches("Brazylia",0,"San Marino",2),
                new FootbalMatches("Portugalia",0, "Polska", 2),
                new FootbalMatches("Włochy", 6,"Anglia", 4)
        );
    }
}
