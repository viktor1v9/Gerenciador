package DAO;

import Model.Professor;
import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class ProfessorDAO {

    public static ArrayList<Professor> MinhaLista = new ArrayList<Professor>();

    public ProfessorDAO() {

    }

    public int maiorID() {
        int maiorID = 0;
        try{
            Statement stmt = this.getConexao().createStatement();
            ResultSet res = stmt.executeQuery("SELECT MAX(id) id FROM tb_professores");
            res.next();
            maiorID = res.getInt("id");
            stmt.close();
            
        }catch(SQLException ex){
        }
        return maiorID;

    }
    
    public Connection getConexao(){
    
        Connection connection = null;
        
        try{
            String driver = "com.mysql.cj.jdbc.Driver";
            Class.forName(driver);
            
            String server = "localhost";
            String database = "db_professores";
            String url = "jdbc:mysql://" + server + ":3306/" + database + "?useTimezone=true&serverTimezone=UTC";
            String user = "root";
            String password = "root";
            
            connection = DriverManager.getConnection(url, user, password);
            
            if(connection != null){
                System.out.println("STATUS: conectado!");
            }else{
                System.out.println("STATUS: NÃO CONECTADO");
            }
            return connection;
        
        }catch (ClassNotFoundException ex) {
          System.out.println("O driver nao foi encontrado. " + ex.getMessage() );
          return null;
          
        }catch(SQLException e){
        System.out.println("O driver nao foi encontrado. ");
        return null;
        
        }
        
    }
    
    public ArrayList getMinhaLista(){
        MinhaLista.clear();
        try{
            Statement stmt = this.getConexao().createStatement();
            ResultSet res = stmt.executeQuery("SELECT * FROM tb_professores");
            while(res.next()){
                String titulo = res.getString("Título");
                String formacao = res.getString("Formação");
                int id = res.getInt("ID");
                String nome = res.getString("Nome");
                int idade = res.getInt("Idade");
                
                Professor objeto = new Professor(titulo, formacao, id, nome, idade);
                MinhaLista.add(objeto);
                
            }
        }catch(SQLException e){
        }
        return MinhaLista;
    }
    
    public boolean insertProfessorBD(Professor objeto){
            String sql = "INSERT INTO tb_professores(ID,Nome,Idade,Título,Formação) VALUES(?,?,?,?,?)";

        try {
            PreparedStatement stmt = this.getConexao().prepareStatement(sql);

            stmt.setInt(1, objeto.getId());
            stmt.setString(2, objeto.getNome());
            stmt.setInt(3, objeto.getIdade());
            stmt.setString(4, objeto.getTitulo());
            stmt.setString(5, objeto.getFormacao());

            stmt.execute();
            stmt.close();

            return true;

        } catch (SQLException erro) {
            throw new RuntimeException(erro);
        }
        
    }
    
    public boolean deleteProfessorBD(int id){
        try{
            Statement stmt = this.getConexao().createStatement();
            stmt.executeUpdate("DELETE FROM tb_professores WHERE id = " + id);
            stmt.close();
        
        }catch(SQLException error){
        }
        return true;
    }
    
    public boolean updateProfessorBD(Professor objeto){
        String sql = "UPDATE tb_professores set Nome = ? ,Idade = ? ,Título = ? ,Formação = ? WHERE ID = ?";
        
        try{
            PreparedStatement stmt = this.getConexao().prepareStatement(sql);
            
            stmt.setString(1, objeto.getNome());
            stmt.setInt(2, objeto.getIdade());
            stmt.setString(3, objeto.getTitulo());
            stmt.setString(4, objeto.getFormacao());
            stmt.setInt(5, objeto.getId());
            
            stmt.execute();
            stmt.close();
            return true;  
            
        }catch(SQLException error){
            throw new RuntimeException(error);
        }
        
    }
    
    public Professor carregarProfessor(int id){
        Professor objeto = new Professor();
        objeto.setId(id);
        
        try{
            Statement stmt = this.getConexao().createStatement();
            ResultSet res = stmt.executeQuery("SELECT * FROM tb_professores WHERE id = " + id);
            res.next();
            
            objeto.setNome(res.getString("nome"));
            objeto.setIdade(res.getInt("idade"));
            objeto.setFormacao(res.getString("formação"));
            objeto.setTitulo(res.getString("título"));
            
            stmt.close();
            
        }catch(SQLException error){
            
        }
        return objeto;
        
    }
}
