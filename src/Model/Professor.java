package Model;

import java.util.ArrayList;
import DAO.ProfessorDAO;

public class Professor extends Pessoa {

    private String titulo;
    private String formacao;
    private final ProfessorDAO dao;

    public Professor() {
        this.dao = new ProfessorDAO();
    }

    public Professor(String titulo, String formacao) {
        this.titulo = titulo;
        this.formacao = formacao;
        this.dao = new ProfessorDAO();
    }

    public Professor(String titulo, String formacao, ProfessorDAO dao) {
        this.titulo = titulo;
        this.formacao = formacao;
        this.dao = dao;
    }

    public Professor(String titulo, String formacao, int id, String nome, int idade) {
        super(id, nome, idade);
        this.titulo = titulo;
        this.formacao = formacao;
        this.dao = new ProfessorDAO();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    @Override
    public String toString() {
        return "\n ID: " + this.getId()
                + "\n Nome: " + this.getNome()
                + "\n Idade: " + this.getIdade()
                + "\n Título: " + this.getTitulo()
                + "\n Formação: " + this.getFormacao()
                + "\n -----------";
    }

    public ArrayList getMinhaLista() {
        return dao.getMinhaLista();
        
    }

    public boolean insertProfessorBD(String titulo, String formacao, String nome, int idade) {
        int id = this.maiorID() + 1;
        Professor objeto = new Professor(titulo, formacao, id, nome, idade);
        dao.insertProfessorBD(objeto);
        return true;
    }

    public boolean deleteProfessorBD(int id) {
        dao.deleteProfessorBD(id);
        return true;
    }

    public boolean updateProfessorBD(String titulo, String formacao,int id, String nome, int idade) {
        Professor objetoProf = new Professor(titulo, formacao, id , nome, idade);
        dao.updateProfessorBD(objetoProf);
        return true;
    }
    
    public Professor carregaProfessor(int id){
        dao.carregarProfessor(id);
        return null;
    }
    
    public int maiorID(){
        return dao.maiorID();
    }
}
