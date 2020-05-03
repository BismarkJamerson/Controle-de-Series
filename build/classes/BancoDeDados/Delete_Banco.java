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

public class Delete_Banco {

    public void Excluir_Usuario(Usuario Use) {
        try {
            String sql = "DELETE FROM Usuario WHERE ID_Usuario = ? ";
            PreparedStatement ps = conexao.getInstance().getConnection().prepareStatement(sql);
            ps.setInt(1, Use.getId());
            ps.execute();

        } catch (SQLException ex) {
            ex.getMessage();
            System.out.println(ex);
        }
    }

    public void Excluir_Temporada(Temporada Temp) {
        try {
            String sql = "DELETE FROM Temporada WHERE ID_Temporada = ? ";
            PreparedStatement ps = conexao.getInstance().getConnection().prepareStatement(sql);
            ps.setInt(1, Temp.getId());
            ps.execute();

        } catch (SQLException ex) {
            ex.getMessage();
            System.out.println(ex);
        }
    }

    public void Excluir_Status(Status Sta) {
        try {
            String sql = "DELETE FROM Status WHERE ID_Status = ? ";
            PreparedStatement ps = conexao.getInstance().getConnection().prepareStatement(sql);
            ps.setInt(1, Sta.getId());
            ps.execute();

        } catch (SQLException ex) {
            ex.getMessage();
            System.out.println(ex);
        }
    }

    public void Excluir_Series(String x) {
        try {
            String sql = "DELETE FROM Series WHERE Nome = ? ";
            PreparedStatement ps = conexao.getInstance().getConnection().prepareStatement(sql);
            ps.setString(1, x);
            ps.execute(); 

        } catch (SQLException ex) {
            ex.getMessage();
            System.out.println(ex);
        }
    }

    public void Excluir_Nacionalidade(Nacionalidade Nac) {
        try {
            String sql = "DELETE FROM Nacionalidade WHERE ID_Nacionalidade = ? ";
            PreparedStatement ps = conexao.getInstance().getConnection().prepareStatement(sql);
            ps.setInt(1, Nac.getId());
            ps.execute();

        } catch (SQLException ex) {
            ex.getMessage();
            System.out.println(ex);
        }
    }

    public void Excluir_Links(Links Lin) {
        try {
            String sql = "DELETE FROM Links WHERE ID_Link = ? ";
            PreparedStatement ps = conexao.getInstance().getConnection().prepareStatement(sql);
            ps.setInt(1, Lin.getId());
            ps.execute();

        } catch (SQLException ex) {
            ex.getMessage();
            System.out.println(ex);
        }
    }

    public void Excluir_Historico_Usuario(Historico_Usuario His) {
        try {
            String sql = "DELETE FROM Historico_Usuario WHERE ID_Catalogo_Usuario = ? ";
            PreparedStatement ps = conexao.getInstance().getConnection().prepareStatement(sql);
            ps.setInt(1, His.getId());
            ps.execute();

        } catch (SQLException ex) {
            ex.getMessage();
            System.out.println(ex);
        }
    }

    public void Excluir_Estudio(Estudio Est) {
        try {
            String sql = "DELETE FROM Estudio WHERE ID_Estudio = ? ";
            PreparedStatement ps = conexao.getInstance().getConnection().prepareStatement(sql);
            ps.setInt(1, Est.getId());
            ps.execute();

        } catch (SQLException ex) {
            ex.getMessage();
            System.out.println(ex);
        }
    }

    public void Excluir_Classificacao_Etaria(Classificacao_Etaria Cla) {
        try {
            String sql = "DELETE FROM Classificacao_Etaria WHERE ID_Classificacao = ? ";
            PreparedStatement ps = conexao.getInstance().getConnection().prepareStatement(sql);
            ps.setInt(1, Cla.getId());
            ps.execute();

        } catch (SQLException ex) {
            ex.getMessage();
            System.out.println(ex);
        }
    }

    public void Excluir_Categoria(Categoria Cat) {
        try {
            String sql = "DELETE FROM Categoria WHERE ID_Categoria = ? ";
            PreparedStatement ps = conexao.getInstance().getConnection().prepareStatement(sql);
            ps.setInt(1, Cat.getId());
            ps.execute();

        } catch (SQLException ex) {
            ex.getMessage();
            System.out.println(ex);
        }
    }
    public void Excluir_fk_SerCat(int fkSC) {
        try {
            String sql = "DELETE FROM Series_Categoria WHERE FK_Serie = ? ";
            PreparedStatement ps = conexao.getInstance().getConnection().prepareStatement(sql);
            ps.setInt(1, fkSC);
            ps.execute();

        } catch (SQLException ex) {
            ex.getMessage();
            System.out.println(ex);
        }
    }
}
