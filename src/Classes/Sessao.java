
package Classes;

import Telas.tela_Principal;

public class Sessao {
    
    public static int id;
    public static tela_Principal prin;

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
