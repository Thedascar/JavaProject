package br.com.fundamentosjava.JDBC;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CriarBanco {
    public static void main(String[] args) throws SQLException {

        final String url = "jdbc:mysql://localhost?verifyServerCertificate=false&useSSL=true";
        final String usuario = "root";
        final String senha = "123456789";

        Connection conexao = DriverManager
                .getConnection(url,usuario,senha);

        System.out.println("Deu boa");
        conexao.close();
    }
}
