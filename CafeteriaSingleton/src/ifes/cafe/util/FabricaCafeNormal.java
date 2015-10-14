/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifes.cafe.util;

import ifes.cafe.cdp.CafeSoluvel;
import ifes.cafe.cdp.Leite;
import ifes.cafe.cdp.Agua;
import ifes.cafe.cdp.Acucar;
import ifes.cafe.cdp.Cafe;
import ifes.cafe.cdp.Ingredientes;
import java.util.ArrayList;


public class FabricaCafeNormal implements FabricaC {

    private final int QTDLEITE = 100;
    private final int QTDACUCAR = 2;
    private final int QTDCAFESOLUVEL = 50;
    private final int QTDAGUA = 100;
    private final double preco = 2;
    protected ArrayList<Ingredientes> ingredientes = new ArrayList<>();

    public Cafe criarCafe() {
        Cafe cafe = new Cafe();
        cafe.setPreco(preco);
        cafe.setIngredientes(ingredientes);
        return cafe;
    }

    public FabricaCafeNormal() {

        for (int contador = 0; contador < QTDAGUA; contador++) {
            Agua agua = new Agua();
            ingredientes.add(agua);
        }
        
        for (int contador = 0; contador < QTDCAFESOLUVEL; contador++) {
            CafeSoluvel cafesoluvel = new CafeSoluvel();
            ingredientes.add(cafesoluvel);
        }
        
        for (int contador = 0; contador < QTDLEITE; contador++) {
            Leite leite = new Leite();
            ingredientes.add(leite);
        }

        for (int contador = 0; contador < QTDACUCAR; contador++) {
            Acucar acucar = new Acucar();
            ingredientes.add(acucar);
        }

    }

}
