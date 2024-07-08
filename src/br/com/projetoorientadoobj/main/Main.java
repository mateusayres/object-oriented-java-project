package br.com.projetoorientadoobj.main;

import br.com.projetoorientadoobj.form.TelaPrincipal;
import br.com.projetoorientadoobj.modelo.Aluno;
import br.com.projetoorientadoobj.modelo.Instrutor;
import br.com.projetoorientadoobj.modelo.Professor;
import br.com.projetoorientadoobj.regras.AlunoController;
import br.com.projetoorientadoobj.util.Util;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        TelaPrincipal telaPrincipal = new TelaPrincipal();
        telaPrincipal.setVisible(true);
               
        
        //Mesmo projeto porém em 
        /*Aluno aluno = new Aluno();
        Scanner leitor = new Scanner(System.in);
        System.out.println("-- ALUNO -- ");
        System.out.print("Digite seu nome: ");
        aluno.setNome(leitor.next());
        System.out.print("Digite seu CPF: ");
        aluno.setCpf(leitor.next());
        System.out.print("Digite sua matrícula: ");
        aluno.setMatricula(leitor.next());
        
        Professor professor = new Professor ();
        System.out.println(" ");
        System.out.println("-- PROFESSOR -- ");
        System.out.print("Digite seu ID: ");
        professor.setIdFuncional(leitor.next());
        System.out.print("Qual seu salário Liquido? ( Ex.: 1234.56 ): ");
        professor.setSalarioLiquido(leitor.nextDouble());
        System.out.print("Qual seu salário Bruto? ( Ex.: 1234.56 ): ");
        professor.setSalarioBruto(leitor.nextDouble());
        System.out.print("É Portador de Necessidades Especiais? (True/False): ");
        professor.setIsPne(leitor.nextBoolean());
        
        System.out.println(" ");
        System.out.println("-- Registro Aluno --");
        System.out.println("Seu nome: " + aluno.getNome());
        System.out.println("Seu CPF: " + aluno.getCpf());
        System.out.println("Sua matrícula: " + aluno.getMatricula());

        System.out.println(" ");
        System.out.println("-- Registro Professor --");
        System.out.println("Seu ID: " + professor.getIdFuncional());
        System.out.println("Seu Salário Liquido: " + professor.getSalarioLiquido());
        System.out.println("Seu Salário Bruto: " + professor.getSalarioBruto());
        System.out.println("É PNE: " + professor.getIsPne());*/
        
        /*AlunoController alunoController = new AlunoController ();
        System.out.println(alunoController.calcularMedia(20.0,2));*/
        
        /*Date data = new Date ();
        System.out.println(Util.getDataPtBr(data));*/
    }
}
