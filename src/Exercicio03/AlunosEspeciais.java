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
public class AlunosEspeciais extends AlunosGraduacao{
    private MateriaPosGraduacao soliciMatPosGraduacao;
    public AlunosEspeciais(MateriaGraduacao mg,MateriaPosGraduacao mpg){
        super(mg);
        setMPG(mpg);
    }
    
    void setMPG(MateriaPosGraduacao mpg){ 
        this.soliciMatPosGraduacao=mpg;
    }
    MateriaPosGraduacao getMPG(){ 
        return this.soliciMatPosGraduacao;
    }
    
}