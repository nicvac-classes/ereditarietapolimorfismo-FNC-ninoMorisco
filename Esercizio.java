//LEGGERE LE ISTRUZIONI NEL FILE README.md

//Import di Classi Java necessarie al funzionamento del programma
import java.util.Scanner;

// Classe principale, con metodo main
class Esercizio {

    class Persona {
        Protected String nome;
        Protected int eta;
        Protected float altezza;
        Protected String genere;
    }

    class Atleta extends Persona {
        Protected String sport;
        Protected String categoria;
        Protected int anniAttivita;
    }

    class Calciatore extends Atleta {
        Protected String piedeForte;
        Protected String ruolo;
        Protected int numeroMaglia;
        Protected int presenze;
        Protected int gol;
        Protected int assist;
        Protected int cartelliniGialli;
        Protected int cartelliniRossi;
    }

    class Tennista extends Atleta {
        Protected String manoForte;
        Protected int matchGiocati;
        Protected int matchVinti;
        Protected int posizioneClassificaATP;
        Protected String nomePersonalCoach;
    }

    public static void main(String args[])
    {
        //Variabili del programma
        String nome;

        //Creo l'oggetto in per l'input da tastiera
        Scanner in = new Scanner( System.in );

        //Leggo l'input da tastiera
        System.out.print("Inserisci il tuo nome: ");
        nome = in.nextLine();

        //Output del nome acquisito da tastiera
        System.out.println("Ciao "+nome+"!");
    }
}

//LEGGERE LE ISTRUZIONI NEL FILE README.md