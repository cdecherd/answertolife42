package team42.cs2340.rattrackingapp.Model;

import java.util.ArrayList;
import java.util.List;

/**
 * The model class which holds an array list of users.
 */
public class Model {
    private static final Model instance = new Model();
    public static Model getInstance() { return instance; }

    private List<User> users;

    /**
     * No-arg constructor that creates an ArrayList of Users
     */
    private Model() {
        users = new ArrayList<>();
        addUser(new User("a", "a"));
    }

    /**
     * Getter for ArrayList of Users
     * @return ArrayList of Users
     */
    public List<User> getUsers() { return users; }

    /**
     * Method to add a User to the ArrayList
     * @param tempUser the User to be added to the ArrayList
     * @return whether or not the User was successfully added
     */
    public boolean addUser(User tempUser) {
        for (User c : users ) {
            if (c.getUsername().equals(tempUser.getUsername())) return false;
        }
        users.add(tempUser);
        return true;
    }
}