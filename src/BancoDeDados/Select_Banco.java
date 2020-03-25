package BancoDeDados;

import Classes.Categoria;
import Classes.Classificacao_Etaria;
import Classes.Estudio;
import Classes.Historico_Series;
import Classes.Historico_Usuario;
import Classes.Links;
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
            conexao.getInstance().closeConnect();
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
            conexao.getInstance().closeConnect();
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
            conexao.getInstance().closeConnect();
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
            conexao.getInstance().closeConnect();
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
            conexao.getInstance().closeConnect();
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
            conexao.getInstance().closeConnect();
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
            conexao.getInstance().closeConnect();
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
            conexao.getInstance().closeConnect();
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
            conexao.getInstance().closeConnect();
            return Ser;
        }
    }

    public List<Categoria> Select_idCategoria(String cat) {
        List<Categoria> lista = new ArrayList();
        try {
            String sql = "SELECT * FROM Categoria WHERE Nome_Categoria = ?";
            PreparedStatement ps = conexao.getInstance().getConnection().prepareStatement(sql);
            ps.setString(1, cat);
            ResultSet rs = ps.executeQuery();
           
            while (rs.next()) {
                Categoria Cat = new Categoria();
                Cat.setId(rs.getInt("ID_Categoria"));
                lista.add(Cat);
            }

        } catch (SQLException ex) {
            ex.getMessage();
        } finally {
            conexao.getInstance().closeConnect();
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
            conexao.getInstance().closeConnect();
            return lista;
        }
    }
    
        public List<Series> Select_SeriesEdit1(String nome) {
        List<Series> lista = new ArrayList();
        try {
            String sql = "SELECT * FROM Series WHERE Nome = ?";
            PreparedStatement ps = conexao.getInstance().getConnection().prepareStatement(sql);
            ps.setString(1, nome);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Series Ser = new Series();
                Ser.setId(rs.getInt("ID_Serie"));
                Ser.setNome(rs.getString("Nome"));
                Ser.setDuracao(rs.getString("Duracao"));
                Ser.setFavorito(rs.getBoolean("Favorito"));
                Ser.setNota(rs.getInt("Nota"));
                Ser.setDublado(rs.getBoolean("Dublado"));
                Ser.setLegendado(rs.getBoolean("Legendado"));
                Ser.setFK_Status(rs.getInt("FK_Status"));
                Ser.setFK_Classificacao(rs.getInt("FK_Classificacao_Etaria"));
                Ser.setFK_Estudio(rs.getInt("FK_Estudio"));
                Ser.setFK_Nacionalidade(rs.getInt("FK_Nacionalidade"));
                Ser.setImagem(rs.getBytes("Imagem"));
                lista.add(Ser);
            }

        } catch (SQLException ex) {
            Logger.getLogger(Select_Banco.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            conexao.getInstance().closeConnect();
            return lista;
        }
    }
        public List<Series> Select_Serie_Categorias(int id) {
            List<Series> lista = new ArrayList();
        try {
            String sql = "SELECT * FROM Series_Categoria "
                    + "INNER JOIN Series,Categoria "
                    + "WHERE ID_Categoria = ? AND FK_Categoria = ? GROUP BY ID_Serie";
            PreparedStatement ps = conexao.getInstance().getConnection().prepareStatement(sql);
            ps.setInt(1, id);
            ps.setInt(2, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Series Ser = new Series();
                Ser.setId(rs.getInt("ID_Serie"));
                Ser.setNome(rs.getString("Nome"));
                Ser.setDuracao(rs.getString("Duracao"));
                Ser.setFavorito(rs.getBoolean("Favorito"));
                Ser.setNota(rs.getInt("Nota"));
                Ser.setDublado(rs.getBoolean("Dublado"));
                Ser.setLegendado(rs.getBoolean("Legendado"));
                Ser.setImagem(rs.getBytes("Imagem"));
                Ser.setFK_Status(rs.getInt("FK_Status"));
                Ser.setFK_Classificacao(rs.getInt("FK_Classificacao_Etaria"));
                Ser.setFK_Estudio(rs.getInt("FK_Estudio"));
                Ser.setFK_Nacionalidade(rs.getInt("FK_Nacionalidade"));
                lista.add(Ser);
            }

        } catch (SQLException ex) {
            Logger.getLogger(Select_Banco.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            conexao.getInstance().closeConnect();
            return lista;
        }
    }
        public List<Status> Select_Status1(int s) {
        List<Status> listaStatus = new ArrayList();
        
        try {
            String sql = "SELECT Status_Producao FROM Status WHERE ID_Status = ?";
            PreparedStatement ps = conexao.getInstance().getConnection().prepareStatement(sql);
            ps.setInt(1, s);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Status Sta = new Status();
                Sta.setStatus_Producao(rs.getString("Status_Producao"));
                listaStatus.add(Sta);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Select_Banco.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            conexao.getInstance().closeConnect();           
            return listaStatus;
        }
    }
        
        public List<Classificacao_Etaria> Select_Classificacao_Etaria1(int s) {
        List<Classificacao_Etaria> listaClass = new ArrayList();
        try {
            String sql = "SELECT Classificacao FROM Classificacao_Etaria WHERE ID_Classificacao = ?";
            PreparedStatement ps = conexao.getInstance().getConnection().prepareStatement(sql);
            ps.setInt(1, s);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Classificacao_Etaria Class = new Classificacao_Etaria();
                Class.setClassificacao(rs.getString("Classificacao"));
                listaClass.add(Class);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Select_Banco.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            conexao.getInstance().closeConnect(); 
            return listaClass;
        }
    } 
        
        public List<Estudio> Select_Estudio1(int s) {
        List<Estudio> listaEst = new ArrayList();
        try {
            String sql = "SELECT * FROM Estudio WHERE ID_Estudio = ?";
            PreparedStatement ps = conexao.getInstance().getConnection().prepareStatement(sql);
            ps.setInt(1, s);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Estudio Est = new Estudio();
                Est.setNome_Estudio(rs.getString("Nome_Estudio"));
                listaEst.add(Est);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Select_Banco.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            conexao.getInstance().closeConnect(); 
            return listaEst;
        }
    }             
           public List<Nacionalidade> Select_Nacionalidade1(int s) {
        List<Nacionalidade> listaNacio = new ArrayList();
        try {
            String sql = "SELECT * FROM Nacionalidade WHERE ID_Nacionalidade = ?";
            PreparedStatement ps = conexao.getInstance().getConnection().prepareStatement(sql);
            ps.setInt(1, s);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Nacionalidade Est = new Nacionalidade();
                Est.setPais(rs.getString("Pais"));
                listaNacio.add(Est);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Select_Banco.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            conexao.getInstance().closeConnect(); 
            return listaNacio;
        }
    }
    public Historico_Usuario Select_Historico_User (int idU, int idS) {
        Historico_Usuario HU = null;
        try {
            String sql = "SELECT * FROM Historico_Series INNER JOIN Historico_Usuario,Usuario,Series WHERE FK_Serie = ? AND ID_Usuario = ?   GROUP BY FK_Serie;";
            PreparedStatement ps = conexao.getInstance().getConnection().prepareStatement(sql);
            ps.setInt(1, idS);
            ps.setInt(2, idU);
            ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    HU = new Historico_Usuario();
                    HU.setEpisodio_Atual(rs.getInt("Episodio_Atual"));
                    HU.setTemporada_Atual(rs.getInt("Temporada_Atual"));
                    HU.setId(rs.getInt("ID_Historico"));
            }if(HU == null){
                    HU.id=0;
                    HU = new Historico_Usuario();
                    HU.setEpisodio_Atual(00);
                    HU.setTemporada_Atual(00);
            } 
        } catch (SQLException ex) {
            Logger.getLogger(Select_Banco.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            conexao.getInstance().closeConnect(); 
            return HU;
        }
    } 


        public Historico_Series Select_HistoricoUser(int id) {
        Historico_Series His = new Historico_Series();
        try {
            String sql = "SELECT * FROM Historico_Series WHERE FK_Serie= ?";
            PreparedStatement ps = conexao.getInstance().getConnection().prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                His.setFK_Historico(rs.getInt("FK_Historico"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Select_Banco.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            conexao.getInstance().closeConnect();
            return His;
        }
    } 
        
        public Historico_Usuario Select_Historico_User1 (int idU, int idS) {
        Historico_Usuario HU = null;
        try {
            String sql = "SELECT * FROM Historico_Series INNER JOIN Historico_Usuario,Usuario,Series WHERE FK_Serie = ? AND ID_Usuario = ? AND FK_Usuario= ? AND ID_Serie =?  GROUP BY FK_Serie;";
            PreparedStatement ps = conexao.getInstance().getConnection().prepareStatement(sql);
            ps.setInt(1, idS);
            ps.setInt(2, idU);
            ps.setInt(3, idU);
            ps.setInt(4, idS);
            ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    HU = new Historico_Usuario();
                    HU.setEpisodio_Atual(rs.getInt("Episodio_Atual"));
                    HU.setTemporada_Atual(rs.getInt("Temporada_Atual"));
                    HU.setId(rs.getInt("ID_Historico"));
                    Sessao.setHU(rs.getInt("ID_Historico"));
            }if(HU==null){
                    HU = new Historico_Usuario();
                    HU.setEpisodio_Atual(00);
                    HU.setTemporada_Atual(00);
                    Sessao.setHU(rs.getInt(0));
            } 
        } catch (SQLException ex) {
            Logger.getLogger(Select_Banco.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            conexao.getInstance().closeConnect(); 
            return HU;
        }
    }            

        public Links Select_Link(String lin) {
        Links link = new Links();

        try {
            String sql = "SELECT * FROM Links WHERE Site = ?";
            PreparedStatement ps = conexao.getInstance().getConnection().prepareStatement(sql);
            ps.setString(1, lin);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                link.setId(rs.getInt("ID_Link"));
            }

        } catch (SQLException ex) {
            Logger.getLogger(Select_Banco.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            conexao.getInstance().closeConnect();
            return link;
        }
    }
   
        public int Select_Series_Link (int idS) {
        int id = 0;

        try {
            String sql = "SELECT FK_Link FROM Series_Link WHERE FK_Serie = ?";
            PreparedStatement ps = conexao.getInstance().getConnection().prepareStatement(sql);
            ps.setInt(1, idS);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                id = rs.getInt("FK_Link");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Select_Banco.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            conexao.getInstance().closeConnect();
            return id;
        }
    }  
       
    public String Select_Link2(int idL) {
        String link = "";
        try {
            String sql = "SELECT * FROM Links WHERE ID_Link = ?";
            PreparedStatement ps = conexao.getInstance().getConnection().prepareStatement(sql);
            ps.setInt(1, idL);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                link = rs.getString("Site");
            }
        } catch (SQLException ex) {
            link="";
            Logger.getLogger(Select_Banco.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            conexao.getInstance().closeConnect();
            return link;
        }
    }    
        
}
        
