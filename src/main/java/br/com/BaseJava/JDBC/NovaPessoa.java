package br.com.BaseJava.JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class NovaPessoa {
    public static void main(String[] args) throws SQLException {

        Scanner e = new Scanner(System.in);
        System.out.println("Informe o nome: ");
        String nome = e.nextLine();

        Connection conexao = Conexao.getConexao();

        String sql = "INSERT INTO pessoas (nome) VALUES (?)";
        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setString(1,nome);
        stmt.execute();
        e.close();
    }
}
