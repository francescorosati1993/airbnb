package entities.property;

import entities.user.User;

import java.time.LocalDate;

public class Prenotazione
{
    private static Integer idTot = 0;
    private Integer id;
    private LocalDate dataInizio;
    private LocalDate dataFine;
    private Abitazione abitazione;
    private User utente;

    // Costruttore
    public Prenotazione(LocalDate dataInizio, LocalDate dataFine,
                        Abitazione abitazione, User utente)
    {
        this.id = idTot++;
        this.dataInizio = dataInizio;
        this.dataFine = dataFine;
        this.abitazione = abitazione;
        this.utente = utente;
    }

    // Getter e Setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getDataInizio() {
        return dataInizio;
    }

    public void setDataInizio(LocalDate dataInizio) {
        this.dataInizio = dataInizio;
    }

    public LocalDate getDataFine() {
        return dataFine;
    }

    public void setDataFine(LocalDate dataFine) {
        this.dataFine = dataFine;
    }

    public Abitazione getAbitazione() {
        return abitazione;
    }

    public void setAbitazione(Abitazione abitazione) {
        this.abitazione = abitazione;
    }

    public User getUtente() {
        return utente;
    }

    public void setUtente(User utente) {
        this.utente = utente;
    }

}
