/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifes.cafe.util;

import ifes.cafe.cdp.Cafe;

/**
 *
 * @author dell
 */
public class Cafeteria {

    public static Cafeteria instancia;

    protected Cafeteria() {

    }

    public static Cafeteria getInstancia() {
        if (instancia == null) {
            instancia = new Cafeteria();
        }
        return instancia;
    }

    public FabricaC instanciarCafeNormal() {
        return new FabricaCafeNormal();
    }

    public FabricaC instanciarCafeCapuccino() {
        return new FabricaCafeCapuccino();
    }

    public FabricaC instanciarCafeSemCafeina() {
        return new FabricaCafeSemCafeina();
    }

}
