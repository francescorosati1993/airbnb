package entities.user;

import entities.property.Property;

import java.util.ArrayList;
import java.util.List;

public class Host extends User
{
    private String hostCode;
    private List<Property> properties;

    public Host(String name, String surname, String email, String address, String hostCode)
    {
        super(name, surname, email, address);
        this.hostCode = hostCode;
        this.properties = new ArrayList<>();
    }

    public String getHostCode()
    {
        return hostCode;
    }

    public void setHostCode(String hostCode)
    {
        this.hostCode = hostCode;
    }

    public List<Property> getProperties()
    {
        return properties;
    }

    public void setProperties(List<Property> properties)
    {
        this.properties = properties;
    }

    @Override
    public String toString()
    {
        return "Host{" +
                "hostCode='" + hostCode + '\'' +
                ", properties=" + properties +
                "} " + super.toString();
    }

}
