package BancoDeDados;

import Classes.usuario;
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
    
      public String Select_Dica(String Login)
    {
        String dica = null;
        int id = 0;
        
        try {
        String sql = "SELECT * FROM Usuario WHERE Login = ?";
        PreparedStatement ps = conexao.getInstance().getConnection().prepareStatement(sql);
        ps.setString(1, Login);
        ResultSet rs = ps.executeQuery();
            while (rs.next()) 
            {
              dica = rs.getString("Nome_Usuario");
              id = rs.getInt("ID_Usuario");
            }
        
        } catch (SQLException ex) {
            Logger.getLogger(Select_Banco.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally
        {
          return dica;
        } 
    }
      
        public usuario Select_Usuario(String Login)
    {
        usuario use = new usuario();
        
        try {
        String sql = "SELECT * FROM Usuario WHERE Login = ?";
        PreparedStatement ps = conexao.getInstance().getConnection().prepareStatement(sql);
        ps.setString(1, Login);
        ResultSet rs = ps.executeQuery();
            while (rs.next()) 
            {
              use.setId(rs.getInt("ID_Usuario"));
              use.setNome(rs.getString("Nome_Usuario"));          
              use.setLogin(rs.getString("Login"));
              use.setSenha(rs.getString("Senha"));
            }
        
        } catch (SQLException ex) {
            Logger.getLogger(Select_Banco.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally
        {
          return use;
        } 
    }
      
}
