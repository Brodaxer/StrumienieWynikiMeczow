
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<FootbalMatches> footbalMatchesList = createMatches();

    }
    private static List<FootbalMatches> createMatches (){
        // Brazylia, Francja, Polska, Niemcy, Anglia, Argentyna, Włochym Irlandia, Portugalia, San Marino,
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
