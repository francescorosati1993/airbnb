package database;

import entities.property.Abitazione;
import entities.property.Prenotazione;
import entities.user.Host;
import entities.user.User;

import java.util.HashMap;
import java.util.Map;

public class Database
{
    private static Map<Integer, User> users = new HashMap<>();
    private static Map<Integer, Host> hosts = new HashMap<>();
    private static Map<Integer, Abitazione> abitazioni = new HashMap<>();
    private static Map<Integer, Prenotazione> prenotazioni = new HashMap<>();

    public static void addUtente(User user)
    {
        users.put(user.getId(), user);
        System.out.println("Hai inserito l'utente " + user.getName() + " " + user.getSurname());
    }







}
