import java.util.Scanner;

public class VocaliSottostringa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci una stringa: ");
        String input = scanner.nextLine();

        System.out.print("Inserisci la lettera di inizio: ");
        char letteraInizio = scanner.nextLine().charAt(0);

        System.out.print("Inserisci la lettera di fine: ");
        char letteraFine = scanner.nextLine().charAt(0);

        int numeroVocali = ContaVocali.conteggioVocaliSottostringa(input, letteraInizio, letteraFine);

        System.out.println("Numero di vocali nella sottostringa: " + numeroVocali);
    }


}
