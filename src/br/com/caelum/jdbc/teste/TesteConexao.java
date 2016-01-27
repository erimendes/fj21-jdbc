/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
        System.out.println("Conexão aberta!");
        connection.close();
    }
}
