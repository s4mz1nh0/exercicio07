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

public class Pessoa {
    private String nome;
    private String endereço;
    private String telefone;
    
    public Pessoa(String n,String e,String t){
        setNome(n);
        setEnd(e);
        setTel(t);
    }
    
    void setNome(String n){
        this.nome=n;
    }
    void setEnd(String e){
        this.endereço=e;
    }
    void setTel(String t){
        this.telefone=t;
    }
    
    String getNome(){
        return this.nome;
    }
    String getEnd(){
        return this.endereço;
    }
    String getTEL(){ 
        return this.telefone;
    }
}

