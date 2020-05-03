package Classes;
public class Series {
    public int id;
    public String nome;
    public String Duracao;
    public boolean Favorito;
    public int Nota;
    public boolean Dublado;
    public boolean Legendado;
    public int FK_Status;
    public int FK_Categoria;
    public byte[] Imagem;
    public int FK_Nacionalidade;
    public int FK_Estudio;
    public int FK_Classificacao;

    public Series() {
        
    }

    public Series(int id, String nome, String Duracao, boolean Favorito, int Nota, boolean Dublado, boolean Legendado, int FK_Status, int FK_Categoria, byte[] Imagem, int FK_Nacionalidade, int FK_Estudio, int FK_Classificacao) {
        this.id = id;
        this.nome = nome;
        this.Duracao = Duracao;
        this.Favorito = Favorito;
        this.Nota = Nota;
        this.Dublado = Dublado;
        this.Legendado = Legendado;
        this.FK_Status = FK_Status;
        this.FK_Categoria = FK_Categoria;
        this.Imagem = Imagem;
        this.FK_Nacionalidade = FK_Nacionalidade;
        this.FK_Estudio = FK_Estudio;
        this.FK_Classificacao = FK_Classificacao;
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

   

    public byte[] getImagem() {
        return Imagem;
    }

    public void setImagem(byte[] Imagem) {
        this.Imagem = Imagem;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDuracao() {
        return Duracao;
    }

    public void setDuracao(String Duracao) {
        this.Duracao = Duracao;
    }

    public boolean isFavorito() {
        return Favorito;
    }

    public void setFavorito(boolean Favorito) {
        this.Favorito = Favorito;
    }

    public int getNota() {
        return Nota;
    }

    public void setNota(int Nota) {
        this.Nota = Nota;
    }

    public boolean isDublado() {
        return Dublado;
    }

    public void setDublado(boolean Dublado) {
        this.Dublado = Dublado;
    }

    public boolean isLegendado() {
        return Legendado;
    }

    public void setLegendado(boolean Legendado) {
        this.Legendado = Legendado;
    }

    public int getFK_Status() {
        return FK_Status;
    }

    public void setFK_Status(int FK_Status) {
        this.FK_Status = FK_Status;
    }

    public int getFK_Categoria() {
        return FK_Categoria;
    }

    public void setFK_Categoria(int FK_Categoria) {
        this.FK_Categoria = FK_Categoria;
    }
    
    
    
    
    
    
}
