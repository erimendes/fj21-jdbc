package br.com.caelum.jdbc.teste;

import br.com.caelum.jdbc.ConnectionFactory;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author FRabelo
 */
public class TesteConexao {
    public static void main(String[] args) throws SQLException {
        // TODO code application logic here
        Connection connection = new ConnectionFactory().getConnection();
        System.out.println("Conexão aberta com sucesso!");
        connection.close();
    }
}
