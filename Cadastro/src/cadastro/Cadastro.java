package cadastro;

import java.sql.*;
import javax.swing.*;
import java.util.*;


public class Cadastro {
    public static void main(String[] args) throws SQLException {
        AlunoDAO alun = new AlunoDAO();
        Pessoa p = new Aluno("ads","15948753629",0,"Pedro", "Guara", "M", "15948862365");
            //criar usuario
        try {
            alun.criarPessoa((Aluno) p);
            JOptionPane.showMessageDialog(null,
                    "Aluno criado com sucesso!!",
                    "Sucesso!!",
                    JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,
                    "Nao foi possivel criar o aluno",
                    "erro: "+e.getMessage(),
                    JOptionPane.WARNING_MESSAGE);
        }
            //deletar usuario
//        try{
//            
//            alun.deletarAluno(1);
//            alun.deletarAluno(2);
//            alun.deletarAluno(3);
//            alun.deletarAluno(4);
//            alun.deletarAluno(5);
//        
//        }catch(SQLException e){
//            System.out.println("Erro: "+e.getMessage());
//        }
            //Listar Alunos
        try {
            List<Aluno> listAl = new AlunoDAO().listarUsuarios(); 
            if(listAl.isEmpty()){
                JOptionPane.showMessageDialog(null,
                        "Nao ha nenhum aluno",
                        "erro",
                        JOptionPane.WARNING_MESSAGE);
            }else{
                for(Aluno aluno : listAl){
                    System.out.println("Id: " + aluno.getId());
                    System.out.println("Nome: " + aluno.getNome());
                    System.out.println("Endereco: " + aluno.getEndereco());
                    System.out.println("Sexo: " + aluno.getSexo());
                    System.out.println("Cpf: " + aluno.getCpf());
                    System.out.println("Curso: " + aluno.getCurso());
                    System.out.println("Matricula: " + aluno.getMatricula());
                    System.out.println("__________________________________________________");
                }
            }
        } catch (SQLException e) {
            System.out.println("erro: "+e.getMessage());
        }
//        
        //buscar alunos
      
          //atualizar aluno
//          Connection con = null;
//          
//          try {
//            con = new CF().ConectDB();
//            AlunoDAO dao = new AlunoDAO(con);
//            Aluno alunAtualizado = new Aluno();
//            
//            alunAtualizado.setId(0);
//            alunAtualizado.setNome("");
//            alunAtualizado.setEndereco("");
//            alunAtualizado.setCurso("");
//            alunAtualizado.setCpf("");
//            alunAtualizado.setSexo("");
//            
//            
//        } catch (SQLException e) {
//              JOptionPane.showMessageDialog(null,
//                      e.getMessage(),
//                      "erro",
//                      JOptionPane.ERROR_MESSAGE);
//        }finally{
//              try {
//                  if(con != null)con.close();
//              } catch (SQLException e) {
//                  System.out.println("Erro: "+e.getMessage());
//              }
//          }
    }   
}
