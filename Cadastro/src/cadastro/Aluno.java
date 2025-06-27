package cadastro;
import java.sql.*;
import java.util.*;
import javax.swing.*;

public class Aluno extends Pessoa{
    private String curso, matricula;

    public Aluno() {
    }

    public Aluno(String curso, String matricula, int id, String nome, String endereco, String sexo, String cpf) {
        super(id, nome, endereco, sexo, cpf);
        this.curso = curso;
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    
}
