package database;

import entities.feedback.Feedback;
import entities.property.Abitazione;
import entities.property.Prenotazione;
import entities.user.Host;
import entities.user.User;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Database {
    private static Map<Integer, User> users = new HashMap<>();
    private static Map<Integer, Host> hosts = new HashMap<>();
    private static Map<Integer, Abitazione> abitazioni = new HashMap<>();
    private static Map<Integer, Prenotazione> prenotazioni = new HashMap<>();

    // Aggiunta User
    public static void addUtente(User user) {
        users.put(user.getId(), user);
        System.out.println("Hai inserito l'utente " + user.getName() + " " + user.getSurname());
    }

    // Aggiunta Host
    public static void addHost(Host host) {
        hosts.put(host.getId(), host);
        System.out.println("Hai inserito l'host " + host.getName() + " " + host.getSurname() + " Codice host: " + host.getHostCode());
    }

    // Aggiunta Abitazione
    public static void addAbitazione(Abitazione abitazione) {
        abitazioni.put(abitazione.getId(), abitazione);
        System.out.println("Hai inserito l'abitazione " + abitazione.getNome() + ", indirizzo: " + abitazione.getIndirizzo() + ", Codice host: " + abitazione.getCodiceHost());
    }

    // Aggiunta Prenotazione (Verifica delle prenotazioni sovrapposte)
    public static void addPrenotazione(Prenotazione prenotazione) {
        prenotazioni.put(prenotazione.getId(), prenotazione);
        System.out.println("Hai inserito la prenotazione");
    }


    //1. Ottenere le abitazioni corrispondenti a un certo codice host
    public static List<Abitazione> getAbitazioniHost(String codiceHost) {
        List<Abitazione> list_abitazioni = new ArrayList<>();

        for (Abitazione abitazione : abitazioni.values()) {
            if (abitazione.getCodiceHost().equals(codiceHost)) {
                list_abitazioni.add(abitazione);
            }
        }

        return list_abitazioni;
    }

    //2. Ottenere l'ultima prenotazione dato un id utente
    public static Prenotazione getUltimaPronotazioneUtente(Integer idUtente) {
        User utente = users.get(idUtente);

        if (utente != null && utente.getPrenotazioni() != null && !utente.getPrenotazioni().isEmpty()) {
            return utente.getPrenotazioni().get(utente.getPrenotazioni().size() - 1);
        }

        return null;
    }

    //3. Ottenere l'abitazione più gettonata nell'ultimo mese
    public static Abitazione getAbitazionePiùGettonataUltimoMese() {
        LocalDate oggi = LocalDate.now();
        LocalDate ultimaData = oggi.minusMonths(1);

        Map<Abitazione, Long> prenotazioniPerAbitazione = prenotazioni.values().stream()
                .filter(p -> !p.getDataFine().isBefore(ultimaData)) // Filtra le prenotazioni dell'ultimo mese
                .collect(Collectors.groupingBy(Prenotazione::getAbitazione, Collectors.counting()));

        return prenotazioniPerAbitazione.entrySet().stream()
                .max(Map.Entry.comparingByValue()) // Trova l'entrata con il massimo valore
                .map(Map.Entry::getKey)
                .orElse(null);

    }

    //4. Ottenere gli host con più prenotazioni nell'ultimo mese


    //5. Ottenere tutti i super-host


    //6. Ottenere i 5 utenti con più giorni prenotati nell'ultimo mese


    //7. Ottenere il numero medio di posti letto calcolato in base a tutte le abitazioni caricate dagli host


}
