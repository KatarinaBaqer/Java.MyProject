
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class TextAnalyserTest {
    private TextAnalyser analyser;
    // Denna metod körs före varje testmetod i testklassen.
    // Det är en JUnit-annotering som säkerställer att setup() exekveras innan varje test.
    @BeforeEach
    public void setup(){
        analyser = new TextAnalyser();


    }
    // Testfall som Testar räkningen av rader och tecken
    @Test
    public void TestCharacterCount() {

        // 1 rad, 11 tecken
        analyser.analyse("Hej världen");
        // 1 rad, 10 tecken
        analyser.analyse("Java är kul");
        assertEquals(2, analyser.getRows(), "Antalet rader borde vara 2");
        assertEquals(22, analyser.getCharacters(), "Antalet tecken borde vara 22");
    }
    // Testfall som Testar räkningen av ord
    @Test
    public void TestWordCount() {
        analyser.analyse("Detta är en rad med ord");
        analyser.analyse("Och här är en till");
        assertEquals(11, analyser.getWords(), "Antalet ord borde vara 11");
        }

    // Testfall som Testar att det längsta ordet identifieras korrekt
    @Test
    public void TestLongestWord() {
        analyser.analyse("Java programmering");
        analyser.analyse("Så spännande");
        assertEquals("programmering", analyser.getLongestWord(), "Det längsta ordet borde vara 'programmering'");
    }
    // Testfall 4: Testa en tom inmatning
    @Test
    public void TestEmptyInput() {
        analyser.analyse("");
       assertEquals(1, analyser.getRows(), "Antalet rader borde vara 0 för tom inmatning");
        assertEquals(0, analyser.getCharacters(), "Antalet tecken borde vara 0 för tom inmatning");
        assertEquals(1, analyser.getWords(), "Antalet ord borde vara 0 för tom inmatning");
        assertEquals("", analyser.getLongestWord(), "Det längsta ordet borde vara tomt för tom inmatning");
    }
}
