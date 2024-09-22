package Model;

import java.util.*;
import DAO.AlunoDAO;
import java.sql.SQLException;

public class Aluno extends Pessoa {

    private String curso;
    private int fase;
    private final AlunoDAO dao; 

    public Aluno() {
        this.dao = new AlunoDAO(); 
    }

    public Aluno(String curso, int fase) {
        this.curso = curso;
        this.fase = fase;
        this.dao = new AlunoDAO();
    }

    
    public Aluno(String curso, int fase, int id, String nome, int idade) {
        super(id, nome, idade);
        this.curso = curso;
        this.fase = fase;
        this.dao = new AlunoDAO(); 
    }

    
    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getFase() {
        return fase;
    }

    public void setFase(int fase) {
        this.fase = fase;
    }


    @Override
    public String toString() {
        return "\n ID: " + this.getId()
                + "\n Nome: " + this.getNome()
                + "\n Idade: " + this.getIdade()
                + "\n Curso: " + this.getCurso()
                + "\n Fase:" + this.getFase()
                + "\n -----------";
    }

    public ArrayList getMinhaLista() {
    
        return dao.getMinhaLista();
    }

    public boolean InsertAlunoBD(String curso, int fase, String nome, int idade) throws SQLException {
        int id = this.maiorID() + 1;
        Aluno objeto = new Aluno(curso, fase, id, nome, idade);

        dao.InsertAlunoBD(objeto);
        return true;

    }

  
    public boolean DeleteAlunoBD(int id) {

        dao.DeleteAlunoBD(id);
        return true;
    }

  
    public boolean UpdateAlunoBD(String curso, int fase, int id, String nome, int idade) {
        Aluno objeto = new Aluno(curso, fase, id, nome, idade);

        dao.UpdateAlunoBD(objeto);
        return true;
    }

    public Aluno carregaAluno(int id) {

        dao.carregaAluno(id);
        return null;
    }
    
   
        public int maiorID() throws SQLException{

        return dao.maiorID();
    }   
}
