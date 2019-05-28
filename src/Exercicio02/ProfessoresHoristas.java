/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio02;

/**
 *
 * @author P4N
 */
public class ProfessoresHoristas {
    private double salHora;
    private int horas;
    
    void setSalH(double sh){ 
        this.salHora=sh;
    }
    double getSalH(){ 
        return this.salHora;
    }

    void setHoras(int h){ 
        this.horas=h;
    }
    int getHoras(){ 
        return this.horas;
    }

    double calSal(){
      
        return this.horas*this.salHora;
    }
    
}
