import java.security.InvalidParameterException;

public class ContaVocali {
    public static int conteggioVocaliSottostringa(String input, char letteraInizio, char letteraFine) {
        int numeroVocali = 0;
        boolean trovataInizio = false;
        boolean trovataFine = false;
        int inizio = 0;

        input = input.toLowerCase();
        letteraInizio = Character.toLowerCase(letteraInizio);
        letteraFine = Character.toLowerCase(letteraFine);


        if(input.isEmpty()){
            throw new RuntimeException("Stringa non inserita");
        }

        for (int i = 0; i < input.length(); i++) {

            char carattere = input.charAt(i);
            if (carattere == letteraInizio && trovataInizio == false) {
                inizio = i;
                trovataInizio = true;
            }
            if (carattere == letteraFine) {
                trovataFine = true;
            }


        }

        if(trovataInizio && trovataFine) {
            for (int i = inizio; i < input.length(); i++) {
                char carattere = input.charAt(i);

                if (Character.isLetter(carattere)) {
                    if (carattere == 'a' || carattere == 'e' || carattere == 'i' || carattere == 'o' || carattere == 'u') {
                        numeroVocali++;
                    }
                }

                if (carattere == letteraFine) {
                    break;
                }



            }
        }
            return numeroVocali;

    }
}
