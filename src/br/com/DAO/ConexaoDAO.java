package br.com.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class ConexaoDAO {

    public static Connection connector() {

        java.sql.Connection conexao = null;
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/projFim";
        String user = "root";
        String passoword = "root";

        try {
            Class.forName(driver);

            conexao = DriverManager.getConnection(url, user, passoword);
            return conexao;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "conexão falhou:  " + e.getMessage());
            return null;

        }
    }

}
