package Classes;
public class Links {
    public int id;
    public String Site;
    public int FK_Serie;

    public Links() {
    }

    public Links(int id, String Site, int FK_Serie) {
        this.id = id;
        this.Site = Site;
        this.FK_Serie = FK_Serie;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSite() {
        return Site;
    }

    public void setSite(String Site) {
        this.Site = Site;
    }

    public int getFK_Serie() {
        return FK_Serie;
    }

    public void setFK_Serie(int FK_Serie) {
        this.FK_Serie = FK_Serie;
    }
    
    
    
    
}
