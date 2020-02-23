
package Classes;

import Telas.tela_Principal;

public class Sessao {
    
    public static int id;
    public static tela_Principal prin;
    public String dica_senha;
    public String login;
    public String senha;

    public Sessao(String dica_senha, String login, String senha) {
        this.dica_senha = dica_senha;
        this.login = login;
        this.senha = senha;
    }

    public String getDica_senha() {
        return dica_senha;
    }

    public void setDica_senha(String dica_senha) {
        this.dica_senha = dica_senha;
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

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Sessao.id = id;
    }

    public static tela_Principal getPrin() {
        return prin;
    }

    public static void setPrin(tela_Principal prin) {
        Sessao.prin = prin;
    }
    
    
    
    
    //private static Sessao ss = null;
    
    
  /**  public void Sessao(int id, String login, String senha, String dica)
    {
        String Dica = dica;
        String Login = login;
        String Senha = senha;
        int ID = id;
    }
    
    public static Sessao pega_Sessao()
    {
        if(ss == null)
        {
            ss = new Sessao();
            
        }
        return ss;
    }**/
    

}
