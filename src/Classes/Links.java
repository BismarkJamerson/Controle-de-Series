package Classes;
public class Links {
    public int id;
    public String Link;
    public int FK_Serie;

    public Links() {
    }

    public Links(int id, String Link, int FK_Serie) {
        this.id = id;
        this.Link = Link;
        this.FK_Serie = FK_Serie;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLink() {
        return Link;
    }

    public void setLink(String Link) {
        this.Link = Link;
    }

    public int getFK_Serie() {
        return FK_Serie;
    }

    public void setFK_Serie(int FK_Serie) {
        this.FK_Serie = FK_Serie;
    }
    
    
    
    
}
