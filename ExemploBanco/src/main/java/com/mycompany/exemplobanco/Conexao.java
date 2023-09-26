package com.mycompany.exemplobanco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexao {

    public static void main(String[] args) throws SQLException{
        Connection conexao = DriverManager.getConnection("","usuario","senha");
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String jdbc = "jdbc:mysql://localhost/banco";
            ResultSet rsCliente = conexao.createStatement().executeQuery("SELECT * FROM CLIENTE");
            while(rsCliente.next()) {
                System.out.println("Nome: " + rsCliente.getString("nome"));
            }
            
        } catch(ClassNotFoundException ex) {
            System.out.println("Driver do banco de dados não encontrado.");
        } catch (SQLException ex) {
            System.out.println("Ocorreu um erro ao acessar o banco: " + ex.getMessage());
        } finally {
            if(conexao != null) {
                conexao.close();
            }
        }
    }
}
