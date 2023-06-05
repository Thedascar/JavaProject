package br.com.fundamentosjava.JDBC;

public class DAOTeste {
    public static void main(String[] args) {


        DAO dao = new DAO();

        String sql = "INSERT INTO pessoas (nome) VALUES (?)";
        dao.incluir(sql,"Joao");
        dao.incluir(sql,"Ana");
        dao.incluir(sql,"Baia");
        dao.incluir(sql,"Sizu");

    }
}
