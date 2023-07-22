package br.com.BaseJava.JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ExcluirPessoa {

    public static void main(String[] args) throws SQLException {

        Scanner e = new Scanner(System.in);
        System.out.println("Digite o código: ");
        int codigo = e.nextInt();


        Connection conexao = Conexao.getConexao();
        String sql = "DELETE FROM pessoas WHERE codigo = ?";

        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setInt(1,codigo);

        if(stmt.executeUpdate() > 0){
            System.out.println("Pessoa excluida!!");
        }else{
            System.out.println("Nada certo");
        }


    }
}
