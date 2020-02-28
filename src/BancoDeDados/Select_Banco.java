package BancoDeDados;

import Classes.Sessao;
import Classes.Status;
import Classes.Usuario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
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
              dica = rs.getString("Dica_Senha");
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
      
        public Usuario Select_Usuario(String Login)
    {
        Usuario use = new Usuario();
        
        try {
        String sql = "SELECT * FROM Usuario WHERE Login = ?";
        PreparedStatement ps = conexao.getInstance().getConnection().prepareStatement(sql);
        ps.setString(1, Login);
        ResultSet rs = ps.executeQuery();
            while (rs.next()) 
            {
              use.setId(rs.getInt("ID_Usuario"));
              use.setDica_senha(rs.getString("Dica_Senha"));          
              use.setLogin(rs.getString("Login"));
              use.setSenha(rs.getString("Senha"));
              Sessao.setLogin(rs.getString("Login"));
            }
        
        } catch (SQLException ex) {
            Logger.getLogger(Select_Banco.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally
        {
          return use;
        } 
    }
        
        public List<Status> Select_Status() {
        List<Status> lista = new ArrayList();
        try {
            String sql = "SELECT * FROM Status ORDER BY Status";
            PreparedStatement ps = conexao.getInstance().getConnection().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Status sta = new Status();
                sta.setId(rs.getInt("ID_Status"));
                sta.setStatus(rs.getString("Status"));
                lista.add(sta);
            }

        } catch (SQLException ex) {
            ex.getMessage();
        } finally {
            return lista;
        }
    }
      
}
