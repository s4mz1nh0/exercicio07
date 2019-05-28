/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio01;



/**
 * @author P4N
 */
public class Empregado extends Pessoa{
    private String codigoSetor; 
    private double salarioBase;
    private double imposto;

    public String getCodigoSetor(){
    return this.codigoSetor;
    }
    public void setCodigoSetor(String cs){
    this.codigoSetor = cs;
    }
    
    public double getSalarioBase(){
    return this.salarioBase;
    }
    public void setSalarioBase(double sb){
    this.salarioBase = sb;
    }
    
    public double getImposto(){
    return this.imposto;
    }
    public void setImposto(double i){
    this.imposto = i;
    }
            
            
    
    public Empregado(String n, String e, String t, String cs, double sb, double i){
        super(n, e, t);
        setCodigoSetor(cs);
        setSalarioBase(sb);       
        setImposto(i);
}
    double calcularSalario(){
        return this.salarioBase-(this.salarioBase*(this.imposto/100));
    }
}
