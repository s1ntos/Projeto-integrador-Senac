import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBD {
    private static final String URL = "jdbc:mysql://localhost:3306/nome-bancodedados"; //nome do banco de dados
    private static final String USER = "root";
    private static final String PASSWORD = "password"; //coloque sua senha

    public static Connection conectar() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
