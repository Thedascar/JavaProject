package br.com.fundamentosjava.JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdatePessoa {
    public static void main(String[] args) throws SQLException {
            Scanner e = new Scanner(System.in);

            System.out.println("Informe o codigo: ");
            int codigo = e.nextInt();




            String select = "SELECT codigo, nome FROM pessoas WHERE codigo = ?";
            String update = "UPDATE pessoas SET nome = ? WHERE codigo = ?";

            Connection conexao = Conexao.getConexao();
            PreparedStatement stmt = conexao.prepareStatement(select);
            stmt.setInt(1,codigo);
            ResultSet r = stmt.executeQuery();

            if(r.next()){
                Pessoa p = new Pessoa(r.getInt(1),r.getString(2));

                System.out.println("O nome atual é " + p.getNome());
                e.nextLine();

                System.out.println("Informe o novo nome: ");
                String novoNome = e.nextLine();

                stmt.close();
                stmt = conexao.prepareStatement(update);
                stmt.setString(1,novoNome);
                stmt.setInt(2,codigo);
                stmt.execute();
            }


            conexao.close();
            e.close();
    }
}

