import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class FilmeDAO {
    public void inserirFilme(Filme filme) throws SQLException {
        String sql = "INSERT INTO Filme (titulo, sinopse, genero, anoLancamento) VALUES (?, ?, ?, ?)";
        Connection conexao = ConexaoBD.conectar();
        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setString(1, filme.getTitulo());
        stmt.setString(2, filme.getSinopse());
        stmt.setString(3, filme.getGenero());
        stmt.setInt(4, filme.getAnoLancamento());
        stmt.execute();
        stmt.close();
        conexao.close();
    }
}
