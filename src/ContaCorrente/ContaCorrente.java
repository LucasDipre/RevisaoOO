/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ContaCorrente;

/**
 *
 * @author 20101bsi0135
 */
public class ContaCorrente extends Conta implements Tributavel{

    @Override
    public double calculaTributos() {
        return this.saldo* 0.1;
        
    }
   
    
}
