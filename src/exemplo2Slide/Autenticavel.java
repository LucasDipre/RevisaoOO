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

// Nessa solução cria-se uma interface para que as classes que fazem login
//possam fazer login, ao inves de criar uma classe de login dentro de cada classe.
public interface Autenticavel {
    
    boolean autentica(int senha);
    
}
