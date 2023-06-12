import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ContaVocaliTest {
    @Test
    @DisplayName("mancato inserimento della stringa")
    void StringaNulla() {
        assertThrows(RuntimeException.class,
                () -> ContaVocali.conteggioVocaliSottostringa(null,'a', 'b'));

        }

    @Test
    public void testEccezioneStringaVuota() {
        Assertions.assertThrows(RuntimeException.class, () -> {
            ContaVocali.conteggioVocaliSottostringa("", 'a', 'b');
        });
    }



    @ParameterizedTest
    @CsvSource({
            "stringadiprova, i, o, 4 ",
            "stringadiprova, s, p, 3 ",

            "stringadiprova, a, v, 3",
            "stringadiprova, e, v, 0",
            "stringadiprova, i, v, 4",
            "stringadiprova, o, v, 1",
            "stringadiprova, u, v, 0",

            "stringadiprova, s, a, 2",
            "stringadiprova, s, e, 0",
            "stringadiprova, s, i, 1",
            "stringadiprova, s, o, 4",
            "stringadiprova, t, z, 0",

            "stringadiprova, t, a, 2",
            " stringadiprova, t, a, 2",
            "stringa di prova, t, a, 2",
            "stringa di prova,' ',' ', 0",
            "stringa di prova,' ', i, 1",
            "stringa di prova, t,' ', 2",
            "345sfrio5656gihj96, 5, o, 2",
            "345sfrio5656gihj96i, 5, 9, 3",
            "34596, 3, 6, 0",
            "stringadiprovAdue, i, A, 2",
            "as/jdirc@efhudfg?z#, /, @, 1"

    })

    @DisplayName("Test sugli input")
    void testParam(String stringa, char inizio, char fine, int nroVocaliGiusto){
        assertEquals(nroVocaliGiusto, ContaVocali.conteggioVocaliSottostringa(stringa, inizio, fine));
    }

}
