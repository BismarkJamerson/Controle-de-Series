package BancoDeDados;

import Classes.Categoria;
import Classes.Classificacao_Etaria;
import Classes.Estudio;
import Classes.Nacionalidade;
import Classes.Series;
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

    public boolean Select_Logar(String Login, String Senha) {
        boolean acesso = false;

        try {
            String sql = "SELECT * FROM Usuario WHERE Login = ? AND Senha = ? ";
            PreparedStatement ps = conexao.getInstance().getConnection().prepareStatement(sql);
            ps.setString(1, Login);
            ps.setString(2, Senha);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                acesso = true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(Select_Banco.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            return acesso;
        }
    }

    public String Select_Dica(String Login) {
        String dica = null;
        int id = 0;

        try {
            String sql = "SELECT * FROM Usuario WHERE Login = ?";
            PreparedStatement ps = conexao.getInstance().getConnection().prepareStatement(sql);
            ps.setString(1, Login);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                dica = rs.getString("Dica_Senha");
                id = rs.getInt("ID_Usuario");
            }

        } catch (SQLException ex) {
            Logger.getLogger(Select_Banco.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            return dica;
        }
    }

    public Usuario Select_Usuario(String Login) {
        Usuario use = new Usuario();

        try {
            String sql = "SELECT * FROM Usuario WHERE Login = ?";
            PreparedStatement ps = conexao.getInstance().getConnection().prepareStatement(sql);
            ps.setString(1, Login);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                use.setId(rs.getInt("ID_Usuario"));
                use.setDica_senha(rs.getString("Dica_Senha"));
                use.setLogin(rs.getString("Login"));
                use.setSenha(rs.getString("Senha"));
                Sessao.setLogin(rs.getString("Login"));
            }

        } catch (SQLException ex) {
            Logger.getLogger(Select_Banco.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            return use;
        }
    }

    public List<Status> Select_Status() {
        List<Status> lista = new ArrayList();
        try {
            String sql = "SELECT * FROM Status ORDER BY Status_Producao";
            PreparedStatement ps = conexao.getInstance().getConnection().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Status sta = new Status();
                sta.setId(rs.getInt("ID_Status"));
                sta.setStatus_Producao(rs.getString("Status_Producao"));
                lista.add(sta);
            }

        } catch (SQLException ex) {
            ex.getMessage();
        } finally {
            return lista;
        }
    }

    public List<Classificacao_Etaria> Select_Classificacao() {
        List<Classificacao_Etaria> lista = new ArrayList();
        try {
            String sql = "SELECT * FROM Classificacao_Etaria ORDER BY ID_Classificacao";
            PreparedStatement ps = conexao.getInstance().getConnection().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Classificacao_Etaria Cls = new Classificacao_Etaria();
                Cls.setId(rs.getInt("ID_Classificacao"));
                Cls.setClassificacao(rs.getString("Classificacao"));
                lista.add(Cls);
            }

        } catch (SQLException ex) {
            ex.getMessage();
        } finally {
            return lista;
        }
    }

    public List<Estudio> Select_Estudio() {
        List<Estudio> lista = new ArrayList();
        try {
            String sql = "SELECT * FROM Estudio ORDER BY Nome_Estudio";
            PreparedStatement ps = conexao.getInstance().getConnection().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Estudio Est = new Estudio();
                Est.setId(rs.getInt("ID_Estudio"));
                Est.setNome_Estudio(rs.getString("Nome_Estudio"));
                lista.add(Est);
            }

        } catch (SQLException ex) {
            ex.getMessage();
        } finally {
            return lista;
        }
    }

    public List<Nacionalidade> Select_Nacionalidade() {
        List<Nacionalidade> lista = new ArrayList();
        try {
            String sql = "SELECT * FROM Nacionalidade ORDER BY ID_Nacionalidade";
            PreparedStatement ps = conexao.getInstance().getConnection().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Nacionalidade Nac = new Nacionalidade();
                Nac.setId(rs.getInt("ID_Nacionalidade"));
                Nac.setPais(rs.getString("Pais"));
                lista.add(Nac);
            }

        } catch (SQLException ex) {
            ex.getMessage();
        } finally {
            return lista;
        }
    }

    public List<Categoria> Select_Categoria() {
        List<Categoria> lista = new ArrayList();
        try {
            String sql = "SELECT * FROM Categoria ORDER BY Nome_Categoria";
            PreparedStatement ps = conexao.getInstance().getConnection().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Categoria Cat = new Categoria();
                Cat.setId(rs.getInt("ID_Categoria"));
                Cat.setNome_Categoria(rs.getString("Nome_Categoria"));
                lista.add(Cat);
            }

        } catch (SQLException ex) {
            ex.getMessage();
        } finally {
            return lista;
        }
    }

    public Series Select_Series(Series s) {
        Series Ser = new Series();
        Ser = s;

        try {
            String sql = "SELECT * FROM Series WHERE Nome = ?";
            PreparedStatement ps = conexao.getInstance().getConnection().prepareStatement(sql);
            ps.setString(1, Ser.getNome());
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Ser.setId(rs.getInt("ID_Serie"));
            }

        } catch (SQLException ex) {
            Logger.getLogger(Select_Banco.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            return Ser;
        }
    }

    public List<Categoria> Select_idCategoria(String cat) {
        List<Categoria> lista = new ArrayList();
        try {
            String sql = "SELECT * FROM Categoria WHERE Nome_Categoria = ?";
            PreparedStatement ps = conexao.getInstance().getConnection().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            ps.setString(1, cat);

            while (rs.next()) {
                Categoria Cat = new Categoria();
                Cat.setId(rs.getInt("ID_Categoria"));
                lista.add(Cat);
            }

        } catch (SQLException ex) {
            ex.getMessage();
        } finally {
            return lista;
        }
    }

    public List<Series> Select_SeriesEdit(Series s) {
        List<Series> lista = new ArrayList();
        try {
            String sql = "SELECT * FROM Series ORDER BY Nome";
            PreparedStatement ps = conexao.getInstance().getConnection().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Series Ser = new Series();
                Ser.setId(rs.getInt("ID_Serie"));
                Ser.setNome(rs.getString("Nome"));
                lista.add(Ser);
            }

        } catch (SQLException ex) {
            Logger.getLogger(Select_Banco.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            return lista;
        }
    }
}
