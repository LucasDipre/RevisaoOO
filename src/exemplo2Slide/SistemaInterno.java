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
public class SistemaInterno {
    private int senha;
    
    //teste github
    
    void login(Autenticavel a){
        boolean ok = a.autentica(senha);
    }
    
}
