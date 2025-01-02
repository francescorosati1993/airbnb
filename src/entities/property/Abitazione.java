package entities.property;

import java.time.LocalDate;
import java.util.List;

public class Abitazione {
    private int id;
    private String nome;
    private String indirizzo;
    private int numeroLocali;
    private int numeroPostiLetto;
    private int piano;
    private String codiceHost;


    // Costruttore
    public Abitazione(int id, String nome, String indirizzo, int numeroLocali,
                      int numeroPostiLetto, int piano, String codiceHost) {
        this.id = id;
        this.nome = nome;
        this.indirizzo = indirizzo;
        this.numeroLocali = numeroLocali;
        this.numeroPostiLetto = numeroPostiLetto;
        this.piano = piano;
        this.codiceHost = codiceHost;
    }

    // Getter e Setter

    public int getId() {
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
}
