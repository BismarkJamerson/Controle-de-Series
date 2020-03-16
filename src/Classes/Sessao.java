
package Classes;

import Telas.tela_Principal;

public class Sessao {
    
    public static int id;
    public static tela_Principal prin;
    public static String login;
    public static boolean confirm = false;
    public static byte[] img;

    public static void setImg(byte[] img) {
        Sessao.img = img;
    }

    public static byte[] getImg() {
        return img;
    }

    public static boolean isConfirm() {
        return confirm;
    }

    public static void setConfirm(boolean confirm) {
        Sessao.confirm = confirm;
    }

    public static String getLogin() {
        return login;
    }

    public static void setLogin(String login) {
        Sessao.login = login;
    }
    
    public static Usuario use;

    public static Usuario getUse() {
        return use;
    }

    public static void setUse(Usuario use) {
        Sessao.use = use;
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
