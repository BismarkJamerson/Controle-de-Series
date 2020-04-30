package BancoDeDados;

import Classes.Categoria;
import Classes.Classificacao_Etaria;
import Classes.Estudio;
import Classes.Historico_Usuario;
import Classes.Links;
import Classes.Nacionalidade;
import Classes.Series;
import Classes.Status;
import Classes.Temporada;
import Classes.Usuario;
import Classes.fk_Series_Categorias;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Update_Banco {

   public void Update_Usuario(Usuario use) {
        try {
            String sql = "UPDATE Usuario SET Dica_Senha = ?, Login = ?, Senha = ? WHERE ID_Usuario = ? ";
            PreparedStatement ps = conexao.getInstance().getConnection().prepareStatement(sql);
            ps.setString(1, use.getDica_senha());
            ps.setString(2, use.getLogin());
            ps.setString(3, use.getSenha());
            ps.setInt(4, use.getId());
            ps.execute();

        } catch (SQLException ex) {
            ex.getMessage();
            System.out.println(ex);
        }
    } 

    public void Update_Temporada(Temporada Temp) {
        try {
            String sql = "UPDATE Temporada SET Numero_Temporada = ?, Total_Episodios = ?, Data_Lancamento = ? WHERE ID_Temporada = ?  ";
            PreparedStatement ps = conexao.getInstance().getConnection().prepareStatement(sql);
            ps.setInt(1, Temp.getNumero_Temporada());
            ps.setInt(2, Temp.getTotal_Episodios());
            ps.setDate(3, Temp.getData_Lancamento());
            ps.setInt(4, Temp.getId());
            ps.execute();

        } catch (SQLException ex) {
            ex.getMessage();
            System.out.println(ex);
        }
    }

    public void Update_Status(Status Sta) {
        try {
            String sql = "UPDATE Status SET Status_Producao = ? WHERE ID_Status = ?  ";
            PreparedStatement ps = conexao.getInstance().getConnection().prepareStatement(sql);
            ps.setString(1, Sta.getStatus_Producao());
            ps.setInt(2, Sta.getId());
            ps.execute();

        } catch (SQLException ex) {
            ex.getMessage();
            System.out.println(ex);
        }
    }

    public void Update_Series(String duracao, String nome, boolean favorito, boolean dublado, boolean legendado, int nota, int Status, int Classificacao, int Estudio, int Nacionalidade, int id) {
        try {
            String sql = "UPDATE Series SET Nome = ?, Duracao = ?, Favorito = ?, Nota = ?, Dublado = ?, Legendado = ?, FK_Status = ?, FK_Classificacao_Etaria = ?, FK_Estudio = ?, FK_Nacionalidade=?  WHERE ID_Serie = ?";
            PreparedStatement ps = conexao.getInstance().getConnection().prepareStatement(sql);
            ps.setString(1, nome);
            ps.setString(2, duracao);
            ps.setBoolean(3, favorito);
            ps.setInt(4, nota);
            ps.setBoolean(5, dublado);
            ps.setBoolean(6, legendado);
            ps.setInt(7, Status);
            ps.setInt(8, Classificacao);
            ps.setInt(9, Estudio);
            ps.setInt(10, Nacionalidade);
            ps.setInt(11, id);
            ps.execute();

        } catch (SQLException ex) {
            ex.getMessage();
            System.out.println(ex+" up1");
        }
    }
    
    public void Update_Nacionalidade(Nacionalidade Nac) {
        try {
            String sql = "UPDATE Nacionalidade SET Pais = ? WHERE ID_Nacionalidade = ? ";
            PreparedStatement ps = conexao.getInstance().getConnection().prepareStatement(sql);
            ps.setString(1, Nac.getPais());
            ps.setInt(2, Nac.getId());

            ps.execute();

        } catch (SQLException ex) {
            ex.getMessage();
            System.out.println(ex);
        }
    }

    public void Update_Links(Links Lin) {
        try {
            String sql = "UPDATE Links SET Site = ? WHERE ID_Site = ?  ";
            PreparedStatement ps = conexao.getInstance().getConnection().prepareStatement(sql);
            ps.setString(1, Lin.getSite());
            ps.setInt(2, Lin.getId());

            ps.execute();

        } catch (SQLException ex) {
            ex.getMessage();
            System.out.println(ex);
        }
    }

    public void Update_Historico_Usuario(Historico_Usuario His) {
        try {
            String sql = "UPDATE Historico_Usuario SET Episodio_Atual = ?, Temporada_Atual = ?, Tempo_Atual = ?, Ultimo_Dia = ?, Total_Series = ?, Total_Episodios = ?, Total_Temporadas = ?, getTotal_Tempo = ?  WHERE ID_Catalogo_Usuario = ?  ";
            PreparedStatement ps = conexao.getInstance().getConnection().prepareStatement(sql);
            ps.setInt(1, His.getEpisodio_Atual());
            ps.setInt(2, His.getTemporada_Atual());
            ps.setString(3, His.getTempo_Atual());
            ps.setDate(4, His.getUltimo_Dia());
            ps.setInt(5, His.getTotal_Series());
            ps.setInt(6, His.getTotal_Episodios());
            ps.setInt(7, His.getTotal_Temporadas());
            ps.setString(8, His.getTotal_Tempo());
            ps.setInt(9, His.getId());

            ps.execute();

        } catch (SQLException ex) {
            ex.getMessage();
            System.out.println(ex);
        }
    }

    public void Update_Estudio(Estudio Est) {
        try {
            String sql = "UPDATE Estudio SET Nome_Estudio = ? WHERE ID_Estudio = ? ";
            PreparedStatement ps = conexao.getInstance().getConnection().prepareStatement(sql);
            ps.setString(1, Est.getNome_Estudio());
            ps.setInt(2, Est.getId());

            ps.execute();

        } catch (SQLException ex) {
            ex.getMessage();
            System.out.println(ex);
        }
    }

    public void Update_Classificacao_Etaria(Classificacao_Etaria ClE) {
        try {
            String sql = "UPDATE Classificacao_Etaria SET Classificacao = ? WHERE ID_Classificacao = ?  ";
            PreparedStatement ps = conexao.getInstance().getConnection().prepareStatement(sql);
            ps.setString(1, ClE.getClassificacao());
            ps.setInt(2, ClE.getId());

            ps.execute();

        } catch (SQLException ex) {
            ex.getMessage();
            System.out.println(ex);
        }
    }

    public void Update_Categoria(Categoria Cat) {
        try {
            String sql = "UPDATE Categoria SET Nome_Categoria = ? WHERE ID_Categoria = ?  ";
            PreparedStatement ps = conexao.getInstance().getConnection().prepareStatement(sql);
            ps.setString(1, Cat.getNome_Categoria());
            ps.setInt(2, Cat.getId());
 
            ps.execute();

        } catch (SQLException ex) {
            ex.getMessage();
            System.out.println(ex);
        }
    }

    public void  Update_FkSerCat(fk_Series_Categorias fkSC) {
try {
            String sql = "UPDATE Series_Categoria SET FK_Categoria = ? WHERE FK_Serie = ?";
            PreparedStatement ps = conexao.getInstance().getConnection().prepareStatement(sql);
            ps.setInt(1, fkSC.fk_Categorias);
            ps.setInt(2, fkSC.fk_Series);
            ps.execute();

        } catch (SQLException ex) {
            ex.getMessage();
            System.out.println(ex+ " Up");
        }
    }
    
    public void Update_Historico_Usuario(int temp, int ep, int id) {
        try {
            String sql = "UPDATE Historico_Usuario SET Temporada_Atual = ?, Episodio_Atual = ? WHERE ID_Historico = ?";
            PreparedStatement ps = conexao.getInstance().getConnection().prepareStatement(sql);
            ps.setInt(1, temp);
            ps.setInt(2, ep);
            ps.setInt(3, id);
            ps.execute();
        } catch (SQLException ex) {
            ex.getMessage();
            System.out.println(ex);
        }
 }
        
       public void Update_Link(int id, String site) {
        try {
            String sql = "UPDATE Links SET Site = ? WHERE ID_Link = ?";
            PreparedStatement ps = conexao.getInstance().getConnection().prepareStatement(sql);
            ps.setString(1, site);
            ps.setInt(2, id);
            ps.execute();

        } catch (SQLException ex) {
            ex.getMessage();
            System.out.println(ex);
        }
    }     
 }

