package br.com.BaseJava.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TesteConexao {
    public static void main(String[] args) throws SQLException {

        String stringDeConexao = "jdbc:mysql://localhost:3306?verifyServerCertificate=false&useSSL=true";
        String usuario = "root";
        String senha = "123456789";

        Connection conexao = DriverManager
                .getConnection(stringDeConexao,usuario,senha);

        System.out.println("Deu boa");
        conexao.close();
    }
}
