
package conexaoBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectFactory {
    private static String host = "127.0.0.1";
    private static String porta = "3306";
    private static String db = "aquaControl";
    private static String usuario = "root";
    private static String senha = "anima123";
                        
    public static Connection obtemConexao(){
        try{
            Connection c = DriverManager.getConnection("jdbc:mysql://" + host + ":" + porta + "/" + db + "?useTimezone=true&serverTimezone=UTC", 
                    usuario, senha);
            return c;
        }
        catch (SQLException e) {
            System.out.println("Erro: " + e.getMessage());
            return null;
        }
    }
}

