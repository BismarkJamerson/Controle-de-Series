package BancoDeDados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class conexao {

    private static conexao me = null;
    private Connection conn;
    private String file = System.getProperty("user.dir") + "\\Catalogo.db";
    //private String file = "C:\\Projeto\\ControleDeSeries\\target\\classes\\BancoDeDados\\Catalogo.db";

    public conexao() {
        try {
            System.out.println(file);
            Class.forName("org.sqlite.JDBC");
            this.conn = DriverManager.getConnection("jdbc:sqlite:\\" + file);

        } catch (ClassNotFoundException | SQLException ex) {
            //   System.exit(0);
            System.out.println(ex.getMessage());
        }
    }

    public static conexao getInstance() {
        if (me == null) {
            me = new conexao();
        }
        return me;
    }

    public Connection getConnection() {
        return conn;
    }
    
    public void closeConnect(){
        try {
            conn.close();
            me = null;
        } catch (SQLException ex) {
            Logger.getLogger(conexao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
