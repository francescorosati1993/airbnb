package entities.feedback;

public class Feedback {

    private int id;
    private String titolo;
    private String testo;
    private int punteggio;
    //decommenta quando verrà creata

    //private Prenotazione prenotazione;



    //Getter and Setter

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


}
