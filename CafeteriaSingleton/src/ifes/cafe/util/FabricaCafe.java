/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifes.cafe.util;

import ifes.cafe.cdp.Cafe;


public class FabricaCafe {
    public static Cafe criarCafe(String nome){        
        Cafeteria cafeteria = Cafeteria.getInstancia();
        FabricaC fabrica;
        
        if (nome.equals("normal")){
            fabrica = cafeteria.instanciarCafeNormal();
        } else{ 
            if (nome.equals("capuccino")) {
                fabrica = cafeteria.instanciarCafeCapuccino();
            }else{
                fabrica = cafeteria.instanciarCafeSemCafeina();
            }
        }

        Cafe cafe = fabrica.criarCafe();
        return cafe;
        
    }
}
