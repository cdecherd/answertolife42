package team42.cs2340.rattrackingapp.Model;

import java.sql.Timestamp;

/**
 * Created by thoma on 10/9/2017.
 */

public class Sighting {
    //public User user;
    public long sightingID;
    public int userID;
    public Timestamp date;
    public String locationType;
    public String address;
    public String city;
    public String borough;
    public int zip;
    public float latitude;
    public float longitude;

}