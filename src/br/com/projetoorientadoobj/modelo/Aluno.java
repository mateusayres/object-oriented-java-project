package br.com.projetoorientadoobj.modelo;

import java.util.Date;

public class Aluno {
    
    private String nome;
    private String cpf;
    private String matricula;
    private Date dataNasc;
    
    public Aluno() {
    }
    
    public String getNome () {
        return this.nome;
    }
    
    public void setNome (String nome) {
        this.nome = nome;
    }
    
    public String getCpf () {
        return this.cpf;
    }
    
    public void setCpf (String cpf) {
        this.cpf = cpf;
    }
    
    public String getMatricula () {
        return this.matricula;
    }
    
    public void setMatricula (String matricula) {
        this.matricula = matricula;
    }
    
    public Date getDataNasc () {
        return this.dataNasc;
    }
    
    public void setDataNasc (Date dataNasc) {
        this.dataNasc = dataNasc;
    }    
    
}
