package database;

import entities.property.Abitazione;
import entities.property.Prenotazione;
import entities.user.Host;
import entities.user.User;

import java.util.HashMap;
import java.util.Map;

public class Database
{
    private static Map<Integer, User> users = new HashMap<>();
    private static Map<Integer, Host> hosts = new HashMap<>();
    private static Map<Integer, Abitazione> abitazioni = new HashMap<>();
    private static Map<Integer, Prenotazione> prenotazioni = new HashMap<>();

    // Aggiunta User
    public static void addUtente(User user)
    {
        users.put(user.getId(), user);
        System.out.println("Hai inserito l'utente " + user.getName() + " " + user.getSurname());
    }

    // Aggiunta Host
    public static void addHost(Host host)
    {
        hosts.put(host.getId(), host);
        System.out.println("Hai inserito l'host " + host.getName() + " " + host.getSurname() + " Codice host: " + host.getHostCode())  ;
    }

    // Aggiunta Abitazione
    public static void addAbitazione(Abitazione abitazione)
    {
        abitazioni.put(abitazione.getId(), abitazione);
        System.out.println("Hai inserito l'abitazione " + abitazione.getNome() + ", indirizzo: " + abitazione.getIndirizzo() + ", Codice host: " + abitazione.getCodiceHost());
    }

    // Aggiunta Prenotazione (Verifica delle prenotazioni sovrapposte)
    public static void addPrenotazione(Prenotazione prenotazione)
    {
        prenotazioni.put(prenotazione.getId(), prenotazione);
        System.out.println("Hai inserito la prenotazione");
    }

    // Aggiunta Feedback



    //1. Ottenere le abitazioni corrispondenti a un certo codice host


    //2. Ottenere l'ultima prenotazione dato un id utente


    //3. Ottenere l'abitazione più gettonata nell'ultimo mese


    //4. Ottenere gli host con più prenotazioni nell'ultimo mese


    //5. Ottenere tutti i super-host


    //6. Ottenere i 5 utenti con più giorni prenotati nell'ultimo mese


    //7. Ottenere il numero medio di posti letto calcolato in base a tutte le abitazioni caricate dagli host


}
