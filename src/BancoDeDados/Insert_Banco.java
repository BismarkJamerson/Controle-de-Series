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
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Insert_Banco {

    public void Insert_Usuario(Usuario use) {
        try {
            String sql = "INSERT INTO Usuario (Dica_Senha, Login, Senha) VALUES (?,?,?) ";
            PreparedStatement ps = conexao.getInstance().getConnection().prepareStatement(sql);
            ps.setString(1, use.getDica_senha());
            ps.setString(2, use.getLogin());
            ps.setString(3, use.getSenha());
            ps.execute();
        } catch (SQLException ex) {
            ex.getMessage();
            System.out.println(ex);
        }
    }

    public void Insert_Temporada(Temporada Temp, int Ser, int Sta) {
        try {
            String sql = "INSERT INTO Temporada (Numero_Temporada, Total_Episodios, FK_Serie, Data_Lancamento, FK_Status) VALUES (?,?,?,?,?) ";
            PreparedStatement ps = conexao.getInstance().getConnection().prepareStatement(sql);
            ps.setInt(1, Temp.getNumero_Temporada());
            ps.setInt(2, Temp.getTotal_Episodios());
            ps.setInt(3, Ser);
            ps.setDate(4, Temp.getData_Lancamento());
            ps.setInt(5, Sta);

            ps.execute();
        } catch (SQLException ex) {
            ex.getMessage();
            System.out.println(ex);
        }
    }

    public void Insert_Status(Status Sta) {
        try {
            String sql = "INSERT INTO Status (Status) VALUES (?) ";
            PreparedStatement ps = conexao.getInstance().getConnection().prepareStatement(sql);
            ps.setString(1, Sta.getStatus());

            ps.execute();
        } catch (SQLException ex) {
            ex.getMessage();
            System.out.println(ex);
        }
    }

    public void Insert_Series(Series Ser, int Sta, int Ce, int Est, int Nac, int Cat) {
        try {
            String sql = "INSERT INTO Series (Nome, Duracao, Favorito, Nota, Dublado, Legendado, FK_Status,FK_Classificacao_Etaria, Fk_Estudio,FK_Nacionalidade, FK_Categoria) VALUES (?,?,?,?,?,?,?,?,?,?,?) ";
            PreparedStatement ps = conexao.getInstance().getConnection().prepareStatement(sql);
            ps.setString(1, Ser.getNome());
            ps.setString(2, Ser.getDuracao());
            ps.setBoolean(3, Ser.isFavorito());
            ps.setInt(4, Ser.getNota());
            ps.setBoolean(5, Ser.isDublado());
            ps.setBoolean(6, Ser.isLegendado());
            ps.setInt(7, Sta);
            ps.setInt(8, Ce);
            ps.setInt(9, Est);        //Falta Campo Imagem 
            ps.setInt(10, Nac);
            ps.setInt(11, Cat);
            ps.execute();
        } catch (SQLException ex) {
            ex.getMessage();
            System.out.println(ex);
        }
    }

    public void Insert_Nacionalidade(Nacionalidade Nac) {
        try {
            String sql = "INSERT INTO Nacionalidade (Nacionalidade) VALUES (?) ";
            PreparedStatement ps = conexao.getInstance().getConnection().prepareStatement(sql);
            ps.setString(1, Nac.getNacionalidade());

            ps.execute();
        } catch (SQLException ex) {
            ex.getMessage();
            System.out.println(ex);
        }
    }

    public void Insert_Links(Links Lin, int Ser) {
        try {
            String sql = "INSERT INTO Links (Link,FK_Serie) VALUES (?,?) ";
            PreparedStatement ps = conexao.getInstance().getConnection().prepareStatement(sql);
            ps.setString(1, Lin.getLink());
            ps.setInt(2, Ser);

            ps.execute();
        } catch (SQLException ex) {
            ex.getMessage();
            System.out.println(ex);
        }
    }

    public void Insert_Historico_Usuario(Historico_Usuario His, int Use, int Ser) {
        try {
            String sql = "INSERT INTO Historico_Usuario (Episodio_Atual, Temporada_Atual, Tempo_Atual, FK_Usuario, FK_Serie, Ultimo_Dia, Total_Series, Total_Episodios, Total_Temporadas, Total_Tempo) VALUES (?,?,?,?,?,?,?,?,?,?) ";
            PreparedStatement ps = conexao.getInstance().getConnection().prepareStatement(sql);
            ps.setInt(1, His.getEpisodio_Atual());
            ps.setInt(2, His.getTemporada_Atual());
            ps.setString(3, His.getTempo_Atual());
            ps.setInt(4, Use);
            ps.setInt(5, Ser);
            ps.setDate(6, His.getUltimo_Dia());
            ps.setInt(7, His.getTotal_Series());
            ps.setInt(8, His.getTotal_Episodios());
            ps.setInt(9, His.getTotal_Temporadas());
            ps.setString(10, His.getTotal_Tempo());

            ps.execute();
        } catch (SQLException ex) {
            ex.getMessage();
            System.out.println(ex);
        }
    }

    public void Insert_Estudio(Estudio Est) {
        try {
            String sql = "INSERT INTO Estudio (Nome_Estudio) VALUES (?) ";
            PreparedStatement ps = conexao.getInstance().getConnection().prepareStatement(sql);
            ps.setString(1, Est.getNome_Estudio());

            ps.execute();
        } catch (SQLException ex) {
            ex.getMessage();
            System.out.println(ex);
        }
    }

    public void Insert_Classificacao_Etaria(Classificacao_Etaria ClE) {
        try {
            String sql = "INSERT INTO Classificacao_Etaria (Classificacao_Etaria) VALUES (?)";
            PreparedStatement ps = conexao.getInstance().getConnection().prepareStatement(sql);
            ps.setString(1, ClE.getClassificacao_Etaria());

            ps.execute();
        } catch (SQLException ex) {
            ex.getMessage();
            System.out.println(ex);
        }
    }

    public void Insert_Categoria(Categoria Cat) {
        try {
            String sql = "INSERT INTO Categoria (Nome_Categoria) VALUES (?)";
            PreparedStatement ps = conexao.getInstance().getConnection().prepareStatement(sql);
            ps.setString(1, Cat.getNome_Categoria());
            ps.execute();
        } catch (SQLException ex) {
            ex.getMessage();
            System.out.println(ex);
        }
    }
}
