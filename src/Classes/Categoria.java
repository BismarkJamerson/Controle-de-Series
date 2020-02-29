package Classes;

public class Categoria {

    public int id;
    public String nome_Categoria;

    public Categoria() {
    }

    public Categoria(int id, String nome_Categoria) {
        this.id = id;
        this.nome_Categoria = nome_Categoria;
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

    public void setNome_Categoria(String nome_Categoria) {
        this.nome_Categoria = nome_Categoria;
    }

}
