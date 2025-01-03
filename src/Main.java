import database.Database;
import entities.property.Abitazione;
import entities.property.Prenotazione;
import entities.user.Host;
import entities.user.User;

import java.time.LocalDate;
import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        // Creazione di un nuovo host
        Host host = new Host("Mario", "Rossi", "mario.rossi@email.com", "Via Roma 123");
        // Aggiunta dell'host al database
        Database.addHost(host); // Utilizzando il metodo addUtente per aggiungere un host

        Abitazione abitazione = new Abitazione(
                "Appartamento in Centro",       // Nome
                "Via del Corso 50",            // Indirizzo
                3,                             // Numero locali
                6,                             // Numero posti letto
                2,                             // Piano
                host.getHostCode()             // Codice host
        );

        Abitazione abitazione1 = new Abitazione(
                "Appartamento Roma",       // Nome
                "Via dei Tulipani 32",            // Indirizzo
                5,                             // Numero locali
                8,                             // Numero posti letto
                1,                             // Piano
                host.getHostCode()             // Codice host
        );

        Abitazione abitazione2 = new Abitazione(
                "Appartamento Milano",       // Nome
                "Via dei Papaveri 45",            // Indirizzo
                2,                             // Numero locali
                4,                             // Numero posti letto
                5,                             // Piano
                host.getHostCode()             // Codice host
        );

        // Creazione di una prenotazione
        LocalDate dataInizioDisp = LocalDate.of(2024, 11, 1);
        LocalDate dataFineDisp = LocalDate.of(2024, 12, 30);


        abitazione.aggiungiDisponibilita(dataInizioDisp, dataFineDisp);

        Database.addAbitazione(abitazione);
        Database.addAbitazione(abitazione1);
        Database.addAbitazione(abitazione2);

        host.getAbitazioni().add(abitazione);
        host.getAbitazioni().add(abitazione1);
        host.getAbitazioni().add(abitazione2);


        User user = new User("Giulia", "Verdi", "giulia.verdi@email.com", "Via Appia 20");
        Database.addUtente(user);

        User user2 = new User("Mario", "Verdi", "mario.verdi@email.com", "Via Appia 25");
        Database.addUtente(user2);

        // Creazione di una prenotazione
        LocalDate dataInizio = LocalDate.of(2024, 12, 1);
        LocalDate dataFine = LocalDate.of(2024, 12, 3);

        System.out.println(Prenotazione.creaPrenotazione(user, abitazione, dataInizio, dataFine));

        LocalDate dataInizio1 = LocalDate.of(2024, 11, 25);
        LocalDate dataFine1 = LocalDate.of(2024, 11, 30);

        System.out.println(Prenotazione.creaPrenotazione(user2, abitazione, dataInizio1, dataFine1));


        List<Abitazione> abitazioniHostMario = Database.getAbitazioniHost(host.getHostCode());

        for(Abitazione a: abitazioniHostMario)
        {
            System.out.println(a.getNome());
        }


        Prenotazione ultimaPrenotazioneGiulia = Database.getUltimaPronotazioneUtente(user.getId());

        System.out.println("L'ultima prenotazione dell'utente " + user.getName() + " con id " + user.getId() + " è la prenotazione che inizia il " + ultimaPrenotazioneGiulia.getDataInizio());


        // Ottenere l'abitazione più gettonata nell'ultimo mese
        Abitazione abitazionePiuGettonata = Database.getAbitazionePiùGettonataUltimoMese();

        if (abitazionePiuGettonata != null) {
            System.out.println("L'abitazione più gettonata nell'ultimo mese è:");
            System.out.println("Nome: " + abitazionePiuGettonata.getNome());
            System.out.println("Indirizzo: " + abitazionePiuGettonata.getIndirizzo());
            System.out.println("Numero posti letto: " + abitazionePiuGettonata.getNumeroPostiLetto());
        } else {
            System.out.println("Nessuna abitazione con prenotazioni nell'ultimo mese.");
        }

    }


}