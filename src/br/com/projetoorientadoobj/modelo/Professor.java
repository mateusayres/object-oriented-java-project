package br.com.projetoorientadoobj.modelo;

public class Professor {
    
    protected String idFuncional;
    private Double salarioBruto;
    private Double salarioLiquido;
    private Boolean isPne;
    
    public Professor () {
    }

    public String getIdFuncional() {
        return this.idFuncional;
    }

    public void setIdFuncional(String idFuncional) {
        this.idFuncional = idFuncional;
    }

    public Double getSalarioBruto() {
        return this.salarioBruto;
    }

    public void setSalarioBruto(Double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    public Double getSalarioLiquido() {
        return this.salarioLiquido;
    }

    public void setSalarioLiquido(Double salarioLiquido) {
        this.salarioLiquido = salarioLiquido;
    }

    public Boolean getIsPne() {
        return this.isPne;
    }

    public void setIsPne(Boolean isPne) {
        this.isPne = isPne;
    }
}
