package rgbg.ss18.android.ephemeris.model;

import java.io.Serializable;
import java.util.Calendar;


public class DiaEntry implements Serializable {
    private long id;
    private String name;
    private Calendar date;
    private int mood;
    private String description;
    private byte[] image;
    private String city;

    // backup Constructor
    public DiaEntry(String name, Calendar date, int mood, String description, byte[] image, String city) {
        this.name = name;
        this.date = date;
        this.mood = mood;
        this.description = description;
        this.image = image;
        this.city = city;
    }

    public DiaEntry(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public DiaEntry(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Calendar getDate() {
        return date;
    }

    public void setDate(Calendar date) {
        this.date = date;
    }

    public int getMood() {
        return mood;
    }

    public void setMood(int mood) {
        this.mood = mood;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
