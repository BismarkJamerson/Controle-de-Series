
package Classes;

public class Sessao {
    private static Sessao ss = null;
    
    
    public void Sessao(int id, String login, String senha, String dica)
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
    }
}
