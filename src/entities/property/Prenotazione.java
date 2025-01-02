package entities.property;

import java.time.LocalDate;

public class Prenotazione {
    private int id;
    private LocalDate dataInizio;
    private LocalDate dataFine;
    private int idAbitazione;
    private int idUtente;

    // Costruttore
    public Prenotazione(int id, LocalDate dataInizio, LocalDate dataFine,
                        int idAbitazione, int idUtente) {
        this.id = id;
        this.dataInizio = dataInizio;
        this.dataFine = dataFine;
        this.idAbitazione = idAbitazione;
        this.idUtente = idUtente;
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

    public int getIdAbitazione() {
        return idAbitazione;
    }

    public void setIdAbitazione(int idAbitazione) {
        this.idAbitazione = idAbitazione;
    }

    public int getIdUtente() {
        return idUtente;
    }

    public void setIdUtente(int idUtente) {
        this.idUtente = idUtente;
    }
}
