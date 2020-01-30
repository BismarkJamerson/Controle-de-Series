package BancoDeDados;

import Classes.Series;
import Classes.Status;
import Classes.Temporada;
import Classes.usuario;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Update_Banco {
        public void Update_Usuario(usuario use) {
        try {
            String sql = "UPDATE Usuario SET Nome_Usuario = ?, Login = ?, Senha = ? WHERE ID_Usuario = ?  ";
            PreparedStatement ps = conexao.getInstance().getConnection().prepareStatement(sql);
        ps.setString(1, use.getNome());
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
            String sql = "UPDATE Status SET Status = ? WHERE ID_Status = ?  ";
            PreparedStatement ps = conexao.getInstance().getConnection().prepareStatement(sql);
        ps.setString(1, Sta.getStatus()); 
        ps.setInt(2, Sta.getId());
            ps.execute();

        } catch (SQLException ex) {
            ex.getMessage();
            System.out.println(ex);
        }
    }
        public void Update_Series(Series Ser) {
        try {
            String sql = "UPDATE Series SET Nome = ?, Duracao = ?, Favorito = ?, Nota = ?, Imagem = ?, Dublado = ?, Legendado = ? WHERE ID_Series = ?  ";
            PreparedStatement ps = conexao.getInstance().getConnection().prepareStatement(sql);
        ps.setString(1, Ser.getNome());
        ps.setString(2, Ser.getDuracao());
        ps.setBoolean(3, Ser.isFavorito());
        ps.setInt(4,Ser.getNota());
        ps.setString(5, Ser.getImagem());
        ps.setBoolean(6, Ser.isDublado());
        ps.setBoolean(7, Ser.isLegendado());
        ps.setInt(8, Ser.getId());
        
            ps.execute();
            

        } catch (SQLException ex) {
            ex.getMessage();
            System.out.println(ex);
        }
    }
}
