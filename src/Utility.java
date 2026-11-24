import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Utility
{
    public static BufferedReader console= new BufferedReader(new InputStreamReader(System.in));
    //costruttore
    public Utility()
    {
    }
    //metodo leggiInt
    public static int leggiIntero(String messaggio) {
        int numero = 0;
        boolean valido = false;
        do
        {
            System.out.print(messaggio);
    try
    {
        numero = Integer.parseInt(console.readLine().trim());
        valido = true;
    } catch (NumberFormatException e) {
        System.out.println("Errore: inserisci un intero.");
    }catch (IOException e) {
    System.out.println("Errore: " + e.getMessage());
    }
        } while (!valido);
    return numero;
    }
 // Metodo leggiDouble
public static double leggiDouble(String messaggio) {
    double numero = 0.0;
    boolean valido = false;
    do {
        System.out.print(messaggio);
        try {
            numero = Double.parseDouble(console.readLine());
            valido = true;
        } catch (NumberFormatException e) {
            System.out.println("Errore: inserisci un numero decimale valido.");
        } catch (IOException e) {
            System.out.println("Errore: " + e.getMessage());
        }
    } while (!valido);
    return numero;
}

// Metodo leggiString
public static String leggiString(String messaggio) {
    String testo = "";
    boolean valido = false;
    do {
        System.out.print(messaggio);
        try {
            testo = console.readLine().trim();
            if (!testo.isEmpty()) {
                valido = true;
            } else {
                System.out.println("Errore: il testo non può essere vuoto.");
            }
        } catch (IOException e) {
            System.out.println("Errore: " + e.getMessage());
        }
    } while (!valido);
    return testo;
}
public static int mostraMenu(String titolo, String voceZero, String[] opzioni) {
System.out.println("\n===========================================");
System.out.println(" " + titolo.toUpperCase());
System.out.println("===========================================");
for (int i = 0; i < opzioni.length; i++) {
System.out.println((i + 1) + ". " + opzioni[i]);
}
System.out.println("0. " + voceZero);
System.out.println("===========================================");
return leggiIntero("Scegli un'opzione: ");
}





}
