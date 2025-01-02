package entities.user;

import entities.property.Abitazione;

import java.util.ArrayList;
import java.util.List;

public class Host extends User
{
    private String hostCode;
    private List<Abitazione> abitazioni;

    public Host(String name, String surname, String email, String address, String hostCode)
    {
        super(name, surname, email, address);
        this.hostCode = hostCode;
        this.abitazioni = new ArrayList<>();
    }

    public String getHostCode()
    {
        return hostCode;
    }

    public void setHostCode(String hostCode)
    {
        this.hostCode = hostCode;
    }

    public List<Abitazione> getAbitazioni()
    {
        return abitazioni;
    }

    public void setAbitazioni(List<Abitazione> abitazioni)
    {
        this.abitazioni = abitazioni;
    }

    @Override
    public String toString()
    {
        return "Host{" +
                "hostCode='" + hostCode + '\'' +
                ", abitazioni=" + abitazioni +
                "} " + super.toString();
    }

}
