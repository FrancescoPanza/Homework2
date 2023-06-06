public class ContaVocali {
    public static int conteggioVocaliSottostringa(String input, char letteraInizio, char letteraFine) {
        int numeroVocali = 0;
        boolean trovataInizio = false;

        input = input.toLowerCase();

        for (int i = 0; i < input.length(); i++) {
            char carattere = input.charAt(i);

            if (carattere == letteraInizio) {
                trovataInizio = true;
            }

            if (trovataInizio && carattere == letteraFine) {
                if (letteraFine == 'a' || carattere == 'e' || carattere == 'i' || carattere == 'o' || carattere == 'u') {
                    numeroVocali++;
                }
                break;
            }

            if (trovataInizio && Character.isLetter(carattere)) {
                if (carattere == 'a' || carattere == 'e' || carattere == 'i' || carattere == 'o' || carattere == 'u') {
                    numeroVocali++;
                }
            }
        }

        return numeroVocali;
    }
}
