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
public class AlunosPosGraduacao extends MateriaGraduacao{
    private MateriaPosGraduacao soliciMatPosGraduacao;
    public AlunosPosGraduacao(String x,MateriaPosGraduacao mpg){
        super(x);
        
    }
    
    void setMpG(MateriaPosGraduacao mpg){
        this.soliciMatPosGraduacao=mpg;
    }
    MateriaPosGraduacao getMPG(){
        return this.soliciMatPosGraduacao;
    }
    
}