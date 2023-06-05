package br.com.fundamentosjava.JDBC;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CriarTabelasPessoas {
    public static void main(String[] args) throws SQLException {

        String sql = "CREATE TABLE IF NOT EXISTS pessoas ("
                +"codigo INT AUTO_INCREMENT PRIMARY KEY,"
                +"nome VARCHAR(80) NOT NULL"
                +")";
        Connection conexao = Conexao.getConexao();
        Statement stmt = conexao.createStatement();
        stmt.execute(sql);
        stmt.execute(sql);

        conexao.close();
    }
}
