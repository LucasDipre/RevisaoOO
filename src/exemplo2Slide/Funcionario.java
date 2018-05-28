/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplo2Slide;

/**
 *
 * @author 20101bsi0135
 */
abstract class Funcionario {
    
    protected double salario; //protected pois salario é sigiloso
    
    public double getBonificacao(){
        return this.salario * 1.2;
    }
    
}
