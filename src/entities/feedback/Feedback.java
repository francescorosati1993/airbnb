package entities.feedback;

import entities.property.Prenotazione;

public class Feedback
{
    private static Integer idTot = 0;
    private Integer id;
    private String titolo;
    private String testo;
    private int punteggio;
    private Prenotazione prenotazione;

    public Feedback(String titolo, String testo, int punteggio)
    {
        this.id = idTot++;
        this.titolo = titolo;
        this.testo = testo;
        this.punteggio = punteggio;
    }


    //Getter and Setter

    public Integer getId() {
        return id;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public int getPunteggio() {
        return punteggio;
    }

    public void setPunteggio(int punteggio) {
        this.punteggio = punteggio;
    }

    public String getTesto() {
        return testo;
    }

    public void setTesto(String testo) {
        this.testo = testo;
    }

    public Prenotazione getPrenotazione() {
        return prenotazione;
    }

    public void setPrenotazione(Prenotazione prenotazione) {
        this.prenotazione = prenotazione;
    }
}
