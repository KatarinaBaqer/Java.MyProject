import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
// Skapar en exemplar av TextAnalyser för att hålla koll på rader, tecken och ord
        TextAnalyser analyser = new TextAnalyser();
        Scanner scan = new Scanner(System.in);

        System.out.println("Skriv in text rad för rad. Skriv 'stop' för att avsluta.");

        while (true) {
            // Trim för att ta bort extra mellanslag i början och slutet
            String input = scan.nextLine().trim();

            // Kontrollera om användaren skrev 'stop'
            if (input.equalsIgnoreCase("stop")) {

                break;
            }

            // Kontrollera om raden är tom
            if (!input.isEmpty()) {
                // Analyserar raden och uppdaterar räkningen
                analyser.analyse(input);
            }
        }

        // Skriv ut resultatet
        System.out.println("Resultat:");
        System.out.println("Antalet rader är: " + analyser.getRows());
        System.out.println("Antalet tecken är: " + analyser.getCharacters());
        System.out.println("Antalet ord är: " + analyser.getWords());
        System.out.println("Det längsta ordet är: " + analyser.getLongestWord());

        scan.close();
    }
}