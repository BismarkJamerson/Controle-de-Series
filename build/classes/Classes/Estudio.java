package Classes;

public class Estudio {
       public int id;
       public String Nome_Estudio;

    public Estudio() {
    }

    public Estudio(int id, String Nome_Estudio) {
        this.id = id;
        this.Nome_Estudio = Nome_Estudio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome_Estudio() {
        return Nome_Estudio;
    }

    public void setNome_Estudio(String Nome_Estudio) {
        this.Nome_Estudio = Nome_Estudio;
    }
       
}
