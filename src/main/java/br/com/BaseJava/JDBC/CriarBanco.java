package br.com.BaseJava.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CriarBanco {
    public static void main(String[] args) throws SQLException {

        final String url = "jdbc:mysql://localhost?verifyServerCertificate=false&useSSL=true";
        final String usuario = "root";
        final String senha = "123456789";

        Connection conexao = DriverManager
                .getConnection(url,usuario,senha);

        Statement stmt = conexao.createStatement();
        stmt.execute("CREATE DATABASE java_primeiro");

        conexao.close();
    }
}
