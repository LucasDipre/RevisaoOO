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
public class Gerente extends Funcionario implements Autenticavel {
    
    private int senha;
    
    public boolean autentica(int senha){
        if (this.senha != senha){
            return false;
        }
        return true;
    }
    
    public double getBonificacao(){
        return this.salario * 1.4 + 1000;
    }
    
}
