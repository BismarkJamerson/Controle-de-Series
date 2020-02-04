package BancoDeDados;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Select_Banco {

    
    public boolean Select_Logar(String Login, String Senha)
    {
        boolean acesso = false;
        
        try {
        String sql = "SELECT * FROM Usuario WHERE Login = ? AND Senha = ? ";
        PreparedStatement ps = conexao.getInstance().getConnection().prepareStatement(sql);
        ps.setString(1, Login);
        ps.setString(2, Senha);
        ResultSet rs = ps.executeQuery();
            while (rs.next()) 
            {
                acesso = true;
            }
        
        } catch (SQLException ex) {
            Logger.getLogger(Select_Banco.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally
        {
            return acesso;
        } 
    }
}
