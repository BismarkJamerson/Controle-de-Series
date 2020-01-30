package Classes;

public class Categoria {
    public int id;
    public String nome_Categoria;
    public int FK_Nacionalidade;
    public int FK_Estudio;
    public int FK_Classificacao;

    public Categoria() {
    }

    public int getFK_Nacionalidade() {
        return FK_Nacionalidade;
    }

    public void setFK_Nacionalidade(int FK_Nacionalidade) {
        this.FK_Nacionalidade = FK_Nacionalidade;
    }

    public int getFK_Estudio() {
        return FK_Estudio;
    }

    public void setFK_Estudio(int FK_Estudio) {
        this.FK_Estudio = FK_Estudio;
    }

    public int getFK_Classificacao() {
        return FK_Classificacao;
    }

    public void setFK_Classificacao(int FK_Classificacao) {
        this.FK_Classificacao = FK_Classificacao;
    }

    public Categoria(int id, String nome, int FK_Nacionalidade, int FK_Estudio, int FK_Classificacao) {
        this.id = id;
        this.nome_Categoria = nome;
        this.FK_Nacionalidade = FK_Nacionalidade;
        this.FK_Estudio = FK_Estudio;
        this.FK_Classificacao = FK_Classificacao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome_Categoria() {
        return nome_Categoria;
    }

    public void setNome_Categoria(String nome) {
        this.nome_Categoria = nome;
    }
    
    
}