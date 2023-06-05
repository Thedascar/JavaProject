package br.com.fundamentosjava.JDBC;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Conexao {

    public static Connection getConexao(){
        try {
            Properties prop = getProporties();
            final String url = prop.getProperty("banco.url");
            final String usuario = prop.getProperty("banco.usuario");
            final String senha = prop.getProperty("banco.senha");

            return DriverManager.getConnection(url, usuario, senha);
        }catch (SQLException e){
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static Properties getProporties() throws IOException {
        Properties prop = new Properties();
        String caminho = "/conexao.properties";
        prop.load(Conexao.class.getResourceAsStream(caminho));
        return prop;
    }
}
