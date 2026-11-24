import java.io.*;

/**
 * Classe principale dell'applicazione.
 * Punto di partenza standard.
 *
 * @author Nome Cognome
 * @version 1.0
 */
public class App {

    /**
     * Metodo principale (entry point) avviato dalla Java Virtual Machine.
     *
     * @param args Eventuali argomenti passati da riga di comando.
     * @throws IOException In caso di errore durante la lettura dallo stream di input.
     */
    public static void main(String[] args) throws IOException 
    {
        String titoloProgetto = "Esercitazione Java 25 - 4ª ITT";
        stampaIntestazione(titoloProgetto);

        // TODO: Inserisci qui il codice dell'esercizio
        //int valore=Utility.leggiIntero("Inserisci un numero ");
        //System.out.println("Il numero è "+valore);

        //
        String[] vociMenu = {"Prima opzione", "Seconda opzione", "Terza opzione"};
        int scelta;
        do {
            scelta = Utility.mostraMenu("Titolo Programma", "Esci", vociMenu);
            switch (scelta) 
            {
                case 1: stampaIntestazione("ciao"); break;
                //case 2: secondaOpzione(); break;
                //case 3: terzaOpzione(); break;
                case 0: System.out.println("Chiusura programma..."); break;
            }
        } while (scelta != 0);
    }

    /**
     * Metodo di utilità che stampa a video un titolo incorniciato.
     *
     * @param titolo Il testo da visualizzare come intestazione.
     */
    public static void stampaIntestazione(String titolo) 
    {
        System.out.println("=========================================");
        System.out.println("===   " + titolo );
        System.out.println("=========================================");
    }
}
