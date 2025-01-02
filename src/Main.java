import database.Database;
import entities.property.Abitazione;
import entities.property.Prenotazione;
import entities.user.Host;
import entities.user.User;

import java.time.LocalDate;

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

        // Creazione di una prenotazione
        LocalDate dataInizioDisp = LocalDate.of(2025, 1, 5);
        LocalDate dataFineDisp = LocalDate.of(2025, 1, 16);


        abitazione.aggiungiDisponibilita(dataInizioDisp, dataFineDisp);

        Database.addAbitazione(abitazione);

        host.getAbitazioni().add(abitazione);

        User user = new User("Giulia", "Verdi", "giulia.verdi@email.com", "Via Appia 20");
        Database.addUtente(user);

        User user2 = new User("Mario", "Verdi", "mario.verdi@email.com", "Via Appia 25");
        Database.addUtente(user2);

        // Creazione di una prenotazione
        LocalDate dataInizio = LocalDate.of(2025, 1, 10);
        LocalDate dataFine = LocalDate.of(2025, 1, 15);

        System.out.println(Prenotazione.creaPrenotazione(user, abitazione, dataInizio, dataFine));

        LocalDate dataInizio1 = LocalDate.of(2025, 1, 11);
        LocalDate dataFine1 = LocalDate.of(2025, 1, 14);

        System.out.println(Prenotazione.creaPrenotazione(user2, abitazione, dataInizio1, dataFine1));

    }


}