/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio01;

/**
 *
 * @author P4N
 */

public class Fornecedor extends Pessoa{
    private double valorCredito;
    private double valorDivida;
    
    public void setValorCredito(double c){
    this.valorCredito = c;
    }
    public double getValorCredito(){
    return this.valorCredito;
    }
    public void setValorDivida(double d){
    this.valorDivida = d;
    }
    public double getValorDivida(){
    return this.valorDivida;
 
    }
    public Fornecedor(String n, String e, String t, double c, double d){
    super(n,e,t);
    setValorCredito(c);
    setValorDivida(d);
    
    }
  double obterSaldo(){
        return this.valorCredito-this.valorDivida;
}
}