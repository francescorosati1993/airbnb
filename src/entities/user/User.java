package entities.user;

import entities.property.Prenotazione;

import java.util.ArrayList;
import java.util.List;

public class User
{
    private static Integer idTot = 0;
    protected Integer id;
    protected String name;
    protected String surname;
    protected String email;
    protected String address;
    protected List<Prenotazione> prenotazioni;

    // Costruttore
    public User(String name, String surname, String email, String address)
    {
        this.id = idTot++;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.address = address;
        this.prenotazioni = new ArrayList<>();
    }

    // Getter e Setter

    public Integer getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getSurname()
    {
        return surname;
    }

    public void setSurname(String surname)
    {
        this.surname = surname;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getAddress()
    {
        return address;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    // Metodo per stampare i dettagli
    @Override
    public String toString()
    {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    //Metodi User
    public void aggiungiPrenotazione(Prenotazione prenotazione)
    {
        prenotazioni.add(prenotazione);
        System.out.println("Prenotazione aggiunta");
    }

}
