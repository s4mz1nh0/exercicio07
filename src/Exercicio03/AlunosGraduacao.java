/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio03;

/**
 *
 * @author P4N
 */
public class AlunosGraduacao {
    private MateriaGraduacao soliciMatGraduacao;
    AlunosGraduacao(MateriaGraduacao mg){
        setMG(mg);
    }
    void setMG(MateriaGraduacao mg){ this.soliciMatGraduacao=mg;}
    MateriaGraduacao getMG(){ return this.soliciMatGraduacao;}
}

