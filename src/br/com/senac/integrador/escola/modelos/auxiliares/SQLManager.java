package br.com.senac.integrador.escola.modelos.auxiliares;

import br.com.senac.integrador.escola.modelos.Aluno;
import design.Login;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Definição da classe auxiliar abstrata SQLManager para manuseamentos no banco de dados.
 * @author Felipe Godinho Dal Molin
 */
public abstract class SQLManager {
    private static PropertiesSQL info = null;
    public static void fillProperties(String serverName, String database, String username, String password) {
        SQLManager.info = new PropertiesSQL(serverName, database, username, password);
    };
    public static void cadastrarAluno(Aluno aluno) throws SQLException {
        SQLManager.fillProperties("localhost", "escola", "Nero", "LegendaryForwards15!");
        Connection connection = DriverManager.getConnection(info.getUrl(), info.getUsername(), info.getPassword());
        Statement statement = connection.createStatement();
        
        String sqlStatement = String.format(
                "INSERT INTO alunos " +
                "(nome, cpf, periodo) VALUES " +
                "('%s', '%s', '%s')",
                aluno.getNome(), aluno.getCpf(), aluno.getPeriodo());
        
        statement.execute(sqlStatement);
    };

    public static void verificarCadastro(Login login) {
        // Obter todos os logins da tabela
        // Verificar se são iguais
        // Dependendo do tipo vai para uma tela diferente
        
        
        
        
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}