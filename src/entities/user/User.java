package entities.user;

public class User
{
    private static Integer idTot;
    protected Integer id;
    protected String name;
    protected String surname;
    protected String email;
    protected String address;

    // Costruttore
    public User(String name, String surname, String email, String address)
    {
        this.id = idTot++;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.address = address;
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
}
