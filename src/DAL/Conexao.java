package DAL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    private static final String ConnectionString = "jdbc:mysql://localhost:3306/hssolution";
    private static final String User = "root";
    private static final String Pass = "1234";

    public static Connection abreConexao() {
        try {
            return DriverManager.getConnection(ConnectionString, User, Pass);
        } catch (SQLException erro) {
            System.out.println("SQLException");
            System.out.println(erro.getMessage());
        } catch (Exception erro) {
            System.out.println("Exception");
            System.out.println(erro.getMessage());
        }
        return null;
    }
}