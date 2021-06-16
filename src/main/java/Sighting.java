import org.sql2o.*;

import java.util.List;

public class Sighting{
    private String ranger;
    private String location;
    private int animal_id;
    private String date_sighted;
    private int id;

    public Sighting (String ranger, String location, int animal_id){
        this.ranger = ranger;
        this.location = location;
        this.animal_id = animal_id;
    }

    public String getRanger(){
        return ranger;
    }

    public String getLocation(){
        return location;
    }

    public int getAnimalId(){
        return animal_id;
    }

    public String getDate_sighted(){
        return date_sighted;
    }

    public int getId(){
        return id;
    }

    public void save() {
        try(Connection con = DB.sql2o.open()) {
           String sql = "INSERT INTO sightings (ranger, location, animal_id, date_sighted) VALUES (:ranger, :location, :animal_id, now())";
           this.id = (int) con.createQuery(sql, true)
           .addParameter("ranger", this.ranger)
           .addParameter("location", this.location)
           .addParameter("animal_id", this.animal_id)
           .executeUpdate()
           .getKey();
        }
     }
     
     public static List<Sighting> all() {
        String sql = "select * from sightings";
        try(Connection con = DB.sql2o.open()) {
           return con.createQuery(sql)
           .executeAndFetch(Sighting.class);
        }
     }
}