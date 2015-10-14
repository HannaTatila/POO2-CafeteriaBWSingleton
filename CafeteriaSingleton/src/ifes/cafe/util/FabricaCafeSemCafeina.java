/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifes.cafe.util;

import ifes.cafe.cdp.SemCafeina;
import ifes.cafe.cdp.Cafe;
import ifes.cafe.cdp.Ingredientes;
import java.util.ArrayList;


public class FabricaCafeSemCafeina extends FabricaCafeNormal {

    private final int QTDSEMCAFEINA = 50;
    private final double preco = 3;

    public Cafe criarCafe() {
        Cafe cafe = new Cafe();
        cafe.setPreco(preco);
        cafe.setIngredientes(ingredientes);
        return cafe;
    }

    public FabricaCafeSemCafeina() {

        for (int contador = 0; contador < QTDSEMCAFEINA; contador++) {
            SemCafeina semcafeina = new SemCafeina();
            ingredientes.add(semcafeina);
        }
    }

}
