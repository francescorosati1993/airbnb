package entities.property;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Abitazione {
    private static Integer idTot = 0;
    private Integer id;
    private String nome;
    private String indirizzo;
    private int numeroLocali;
    private int numeroPostiLetto;
    private int piano;
    private String codiceHost;
    private Map<LocalDate, LocalDate> disponibilita;
    private List<Prenotazione> prenotazioni;


    // Costruttore
    public Abitazione(String nome, String indirizzo, int numeroLocali,
                      int numeroPostiLetto, int piano, String codiceHost) {
        this.id = idTot++;;
        this.nome = nome;
        this.indirizzo = indirizzo;
        this.numeroLocali = numeroLocali;
        this.numeroPostiLetto = numeroPostiLetto;
        this.piano = piano;
        this.codiceHost = codiceHost;
        this.disponibilita = new HashMap<>();
        this.prenotazioni = new ArrayList<>();
    }

    // Getter e Setter

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public int getNumeroLocali() {
        return numeroLocali;
    }

    public int getNumeroPostiLetto() {
        return numeroPostiLetto;
    }

    public int getPiano() {
        return piano;
    }

    public String getCodiceHost() {
        return codiceHost;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    public void setNumeroLocali(int numeroLocali) {
        this.numeroLocali = numeroLocali;
    }

    public void setNumeroPostiLetto(int numeroPostiLetto) {
        this.numeroPostiLetto = numeroPostiLetto;
    }

    public void setPiano(int piano) {
        this.piano = piano;
    }

    public void setCodiceHost(String codiceHost) {
        this.codiceHost = codiceHost;
    }

    public Map<LocalDate, LocalDate> getDisponibilita() {
        return disponibilita;
    }

    public void setDisponibilita(Map<LocalDate, LocalDate> disponibilita) {
        this.disponibilita = disponibilita;
    }

    public List<Prenotazione> getPrenotazioni() {
        return prenotazioni;
    }

    public void setPrenotazioni(List<Prenotazione> prenotazioni) {
        this.prenotazioni = prenotazioni;
    }

    public void aggiungiDisponibilita(LocalDate inizio, LocalDate fine)
    {
        disponibilita.put(inizio, fine);
    }

    public Boolean isDisponibile(LocalDate dataInizio, LocalDate dataFine)
    {
        for(Map.Entry<LocalDate, LocalDate> entry : disponibilita.entrySet())
        {
            LocalDate periodoIniziale = entry.getKey();
            LocalDate periodoFinale = entry.getValue();

            if(!(periodoFinale.isBefore(dataInizio) || periodoIniziale.isAfter(dataFine)))
            {
                return true;
            }
        }

        for (Prenotazione prenotazione : this.prenotazioni)
        {
            LocalDate prenotazioneInizio = prenotazione.getDataInizio();
            LocalDate prenotazioneFine = prenotazione.getDataFine();

            if (dataFine.isBefore(prenotazioneInizio) || dataInizio.isAfter(prenotazioneFine))
            {
                return false;
            }
        }


        return true;
    }
}
