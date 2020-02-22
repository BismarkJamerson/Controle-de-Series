package Classes;

public class usuario {
    public int id;
    public String dica_senha;
    public String login;
    public String senha;

    public usuario() {
        
    }

    public usuario(int id, String dica, String login, String senha) {
        this.id = id;
        this.dica_senha = dica;
        this.login = login;
        this.senha = senha;
    }
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDica_senha() {
        return dica_senha;
    }

    public void setDica_senha(String dica) {
        this.dica_senha = dica;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
    
}
