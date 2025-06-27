package cadastro;
import java.util.*;
import java.sql.*;
import javax.swing.*;

public class Pessoa {
    private int id;
    private String nome,endereco,sexo,cpf;
    
    
    //vazio
    public Pessoa() {
    }
    
    //metade
    public Pessoa(String nome, String endereco, String sexo, String cpf) {
        this.nome = nome;
        this.endereco = endereco;
        this.sexo = sexo;
        this.cpf = cpf;    
    }
    
    //cheio

    public Pessoa(int id, String nome, String endereco, String sexo, String cpf) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
        this.sexo = sexo;
        this.cpf = cpf;
    }
    
    
    
        
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
    

    
}
