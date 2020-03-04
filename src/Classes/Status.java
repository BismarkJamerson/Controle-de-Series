package Classes;
public class Status {
    public int id;
    public String Status_Producao;

    public Status() {
    }

    public Status(int id, String Status_Producao) {
        this.id = id;
        this.Status_Producao = Status_Producao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStatus_Producao() {
        return Status_Producao;
    }

    public void setStatus_Producao(String Status_Producao) {
        this.Status_Producao = Status_Producao;
    }
    
    
    
}
