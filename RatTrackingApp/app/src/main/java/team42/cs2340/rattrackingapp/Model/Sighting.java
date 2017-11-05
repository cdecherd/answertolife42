package team42.cs2340.rattrackingapp.Model;

import java.sql.Timestamp;

/**
 * Created by Orestis on 10/9/2017.
 */

public class Sighting {
    private String uniqueKey;
    private String date;
    private String locationType;
    private String incidentZip;
    private String incidentAddress;
    private String city;
    private String borough;
    private String latitude;
    private String longitude;

    public Sighting() {
        this.uniqueKey = "-1";
        this.date = "NA";
        this.locationType = "NA";
        this.incidentZip = "00000";
        this.incidentAddress = "TBD";
        this.city = "NA";
        this.borough = "NA";
        this.latitude = "0.0";
        this.longitude = "0.0";
    }

    //constructor with inputs

    /**
     * constructor with string inputs
     * @param Unique_Key
     * @param Date
     * @param Location_Type
     * @param Incident_Zip
     * @param Incident_Address
     * @param City
     * @param Borough
     * @param Latitude
     * @param Longitude
     */
    public Sighting(String Unique_Key,String Date, String Location_Type,String Incident_Zip,String Incident_Address,
                    String City,String Borough,String Latitude,String Longitude) {
        this.uniqueKey = Unique_Key;
        this.date = Date;
        this.locationType = Location_Type;
        this.incidentZip = Incident_Zip;
        this.incidentAddress = Incident_Address;
        this.city = City;
        this.borough = Borough;
        this.latitude = Latitude;
        this.longitude = Longitude;
    }

    public Sighting(String uniquekey, String date, String latitude, String longitude) {
        this();
        this.uniqueKey = uniquekey;
        this.date = date;
        this.latitude = latitude;
        this.longitude = longitude;
    }
    public Sighting(String uniqueKey, String date) {
        this();
        this.uniqueKey = uniqueKey;
        this.date = date;
    }

    /**
     * getter method for unique key.
     * @return unique key of the object
     */
    public String getUniqueKey() { return uniqueKey; }

    /**
     * getter method for date.
     * @return date of the object
     */
    public String getDate() {
        return date;
    }

    /**
     * getter method for location type.
     * @return location type of the object
     */
    public String getLocationType() { return locationType;}

    /**
     * getter method for incident zip.
     * @return incident zip of the object.
     */
    public String getIncidentZip() { return  incidentZip;}

    /**
     * getter method for incident address.
     * @return incident address of the object.
     */
    public String getIncidentAddress() {
        return incidentAddress;
    }

    /**
     * getter method for city
     * @return city of the object.
     */
    public String getCity() { return city;}

    /**
     * getter method for borough
     * @return borough of the object.
     */
    public String getBorough() { return borough;}

    /**
     * getter method for latitude
     * @return latitude of the object.
     */
    public String getLatitude() { return latitude;}

    /**
     * getter method for longitude
     * @return longitude of the object.
     */
    public String getLongitude() { return longitude;}

    /**
     * setter method to change unique key
     * @param uniqueKey : new unique key
     */
    public void setUniqueKey(String uniqueKey) {
        this.uniqueKey = uniqueKey;
    }

    /**
     * setter method to change date
     * @param date : new date
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * setter method to change location type
     * @param locationType : new location type
     */
    public void setLocationType(String locationType) {
        this.locationType = locationType;
    }

    /**
     * setter method to change incident zip
     * @param incidentZip : incident zip
     */
    public void setIncidentZip(String incidentZip) {
        this.incidentZip = incidentZip;
    }

    /**
     * setter method to change incident address
     * @param incidentAddress : incident address
     */
    public void setIncidentAddress(String incidentAddress) {
        this.incidentAddress = incidentAddress;
    }

    /**
     * setter method to change city
     * @param city : new city
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * setter method to change latitude
     * @param latitude : new latitude
     */
    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    /**
     * setter method to change longitude
     * @param longitude : new longitude
     */
    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    /**
     * setter method to change borough
     * @param borough : new borough
     */
    public void setBorough(String borough) {
        this.borough = borough;
    }

    /**
     * toString to print
     * @return string with unique key and date
     */
    @Override
    public String toString() {
        return this.uniqueKey + ", " + this.date + "," + this.latitude + "," + this.longitude;
    }

}