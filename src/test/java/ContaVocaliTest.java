import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ContaVocaliTest {
    @Test
    @DisplayName("TestConValoriValidi")
    void ValoriValidi() {

        Assertions.assertEquals(6, ContaVocali.conteggioVocaliSottostringa("alfa", "a", "b"));
    }




    @ParameterizedTest // prove
    @CsvSource({
            "articolo, 00.0, 1 , "
    })
    void testParam(String nomeArticolo, double prezzoArticolo, int quantitaArticolo, List<Articolo> articoli ){
        Calcolo myCalc = new Calcolo();
    }
}
