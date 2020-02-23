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
    
    public void Insert_Usuario(Usuario use){
        try {
        String sql = "INSERT INTO Usuario (Dica_Senha, Login, Senha) VALUES (?,?,?) ";
        PreparedStatement ps = conexao.getInstance().getConnection().prepareStatement(sql);
        ps.setString(1, use.getDica_senha());
        ps.setString(2, use.getLogin());
        ps.setString(3, use.getSenha());
        ps.execute();
        }catch (SQLException ex) {
            ex.getMessage();
            System.out.println(ex);
        }
   }    
    public void Insert_Temporada(Temporada Temp, int Ser, int Sta){
        try {
        String sql = "INSERT INTO Temporada (Numero_Temporada, Total_Episodios, FK_Serie, Data_Lancamento, FK_Status) VALUES (?,?,?,?,?) ";
        PreparedStatement ps = conexao.getInstance().getConnection().prepareStatement(sql);
        ps.setInt(1, Temp.getNumero_Temporada());
        ps.setInt(2, Temp.getTotal_Episodios());
        ps.setInt(3, Ser);
        ps.setDate(4, Temp.getData_Lancamento());
        ps.setInt(5, Sta);
        
        ps.execute();
        }catch (SQLException ex) {
            ex.getMessage();
            System.out.println(ex);
        }
   }    
    
        public void Insert_Status(Status Sta){
        try {
        String sql = "INSERT INTO Status ( Status) VALUES (?) ";
        PreparedStatement ps = conexao.getInstance().getConnection().prepareStatement(sql);
        ps.setString(1, Sta.getStatus());
        
        ps.execute();
        }catch (SQLException ex) {
            ex.getMessage();
            System.out.println(ex);
        }
   } 
        
            public void Insert_Series(Series Ser, int Sta, int Cat){
        try {
        String sql = "INSERT INTO Series (ID_Serie, Nome, Duracao, Favorito, Nota, Dublado, Legendado, FK_Status, FK_Categoria) VALUES (?,?,?,?,?,?,?,?,?) ";
        PreparedStatement ps = conexao.getInstance().getConnection().prepareStatement(sql);
        ps.setInt(1, Ser.getId());
        ps.setString(2, Ser.getNome());
        ps.setString(3, Ser.getDuracao());
        ps.setBoolean(4, Ser.isFavorito());
        ps.setInt(5,Ser.getNota());
        ps.setBoolean(6, Ser.isDublado());
        ps.setBoolean(7, Ser.isLegendado());
        ps.setInt(8, Sta);
        ps.setInt(9,Cat);
            
        ps.execute();
        }catch (SQLException ex) {
            ex.getMessage();
            System.out.println(ex);
        }
   }
            
             public void Insert_Nacionalidade(Nacionalidade Nac){
        try {
        String sql = "INSERT INTO Nacionalidade (ID_Nacionalidade, Nacionalidade) VALUES (?,?) ";
        PreparedStatement ps = conexao.getInstance().getConnection().prepareStatement(sql);
        ps.setInt(1, Nac.getId());
        ps.setString(2, Nac.getNacionalidade());
        
        ps.execute();
        }catch (SQLException ex) {
            ex.getMessage();
            System.out.println(ex);
        }
   }
             
              public void Insert_Links(Links Lin, int Ser){
        try {
        String sql = "INSERT INTO Links (Link,FK_Serie) VALUES (?,?) ";
        PreparedStatement ps = conexao.getInstance().getConnection().prepareStatement(sql);
        ps.setString(1, Lin.getLink());
        ps.setInt(2, Ser);
        
        ps.execute();
        }catch (SQLException ex) {
            ex.getMessage();
            System.out.println(ex);
        }
   }
              
            public void Insert_Historico_Usuario(Historico_Usuario His, int Use, int Ser ){
        try {
        String sql = "INSERT INTO Historico_Usuario (Episodio_Atual, Temporada_Atual, Tempo_Atual, FK_Usuario, FK_Serie, Ultimo_Dia) VALUES (?,?,?,?,?,?) ";
        PreparedStatement ps = conexao.getInstance().getConnection().prepareStatement(sql);
        ps.setInt(1, His.getEpisodio_Atual());
        ps.setInt(2, His.getTemporada_Atual());
        ps.setString(3, His.getTempo_Atual());
        ps.setInt(4,Use);
        ps.setInt(5, Ser);
        ps.setDate(6, His.getUltimo_Dia());
            
        ps.execute();
        }catch (SQLException ex) {
            ex.getMessage();
            System.out.println(ex);
        }
   }
      
               public void Insert_Estudio(Estudio Est){
        try {
        String sql = "INSERT INTO Estudio (Nome_Estudio) VALUES (?) ";
        PreparedStatement ps = conexao.getInstance().getConnection().prepareStatement(sql);
        ps.setString(1, Est.getNome_Estudio());
        
        ps.execute();
        }catch (SQLException ex) {
            ex.getMessage();
            System.out.println(ex);
        }
   }
               
                public void Insert_Classificacao_Etaria(Classificacao_Etaria ClE){
        try {
        String sql = "INSERT INTO Classificacao_Etaria (Classificacao_Etaria) VALUES (?)";
        PreparedStatement ps = conexao.getInstance().getConnection().prepareStatement(sql);
        ps.setString(1, ClE.getClassificacao_Etaria());
        
        ps.execute();
        }catch (SQLException ex) {
            ex.getMessage();
            System.out.println(ex);
        }
   }
                
            public void Insert_Categoria(Categoria Cat, int Nac, int Est, int Cls){
        try {
        String sql = "INSERT INTO Categoria (Nome_Categoria, FK_Nacionalidade, FK_Estudio, FK_Classificacao) VALUES (?,?,?,?)";
        PreparedStatement ps = conexao.getInstance().getConnection().prepareStatement(sql);
        ps.setString(1, Cat.getNome_Categoria());
        ps.setInt(2, Nac);
        ps.setInt(3, Est);
        ps.setInt(4, Cls);
        
        ps.execute();
        }catch (SQLException ex) {
            ex.getMessage();
            System.out.println(ex);
        }
   }
}
