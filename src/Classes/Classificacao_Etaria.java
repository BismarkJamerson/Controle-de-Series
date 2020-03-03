package Classes;

public class Classificacao_Etaria {

    public int id;
    public String Classificacao;

    public Classificacao_Etaria() {
    }

    public Classificacao_Etaria(int id, String Classificacao) {
        this.id = id;
        this.Classificacao = Classificacao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getClassificacao() {
        return Classificacao;
    }

    public void setClassificacao(String Classificacao) {
        this.Classificacao = Classificacao;
    }

}
