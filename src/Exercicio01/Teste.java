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
public class Teste {
    public static void main(String[]args){
        Pessoa p1= new Pessoa("Samuel","Rua: Ana numero:116","(38)1111-1111");
        Fornecedor F =new Fornecedor("Google","Em algum lugar numero 20","(38) 2222-2222",2.4,4.2);
        Empregado E =new Empregado("Alguem","Qualquer coisa","só pra completar espaço mesmo","100",2000,20);
        
        
        System.out.println(F.obterSaldo());
        System.out.println(E.calcularSalario());
    }
}