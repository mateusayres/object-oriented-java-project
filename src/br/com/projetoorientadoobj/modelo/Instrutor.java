package br.com.projetoorientadoobj.modelo;

public class Instrutor extends Professor {
    
    private Integer mesesContrato;
    
    public Instrutor() {
    }
    
    public Integer getMesesContrato(){
        return this.mesesContrato;
    }
    
    public void setMesesContrato(Integer mesesContrato){
        this.mesesContrato = mesesContrato;
        
        System.out.println(idFuncional);
    }
    
    
    
}
