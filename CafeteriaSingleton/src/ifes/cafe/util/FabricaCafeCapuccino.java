/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifes.cafe.util;

import ifes.cafe.cdp.CafeSoluvel;
import ifes.cafe.cdp.ChocolatePo;
import ifes.cafe.cdp.Agua;
import ifes.cafe.cdp.Canela;
import ifes.cafe.cdp.LeitePo;
import ifes.cafe.cdp.Bicarbonato;
import ifes.cafe.cdp.Acucar;
import ifes.cafe.cdp.Cafe;
import ifes.cafe.cdp.Ingredientes;
import java.util.ArrayList;


public class FabricaCafeCapuccino implements FabricaC {

    private final int QTDCAFESOLUVEL = 100;
    private final int QTDACUCAR = 2;
    private final int QTDLEITEPO = 100;
    private final int QTDBICARBONATO = 1;
    private final int QTDCHOCOLATEPO = 50;
    private final int QTDCANELA = 1;
    private final int QTDAGUA = 100;
    private final double preco = 5;
    private ArrayList<Ingredientes> ingredientes = new ArrayList<>();

    public Cafe criarCafe() {
        Cafe cafe = new Cafe();
        cafe.setPreco(preco);
        cafe.setIngredientes(ingredientes);
        return cafe;
    }

    public FabricaCafeCapuccino() {
        
        for (int contador = 0; contador < QTDAGUA; contador++) {
            Agua agua = new Agua();
            ingredientes.add(agua);
        }

        for (int contador = 0; contador < QTDCAFESOLUVEL; contador++) {
            CafeSoluvel cafesoluvel = new CafeSoluvel();
            ingredientes.add(cafesoluvel);
        }

        for (int contador = 0; contador < QTDACUCAR; contador++) {
            Acucar acucar = new Acucar();
            ingredientes.add(acucar);
        }

        for (int contador = 0; contador < QTDLEITEPO; contador++) {
            LeitePo leitepo = new LeitePo();
            ingredientes.add(leitepo);
        }

        for (int contador = 0; contador < QTDBICARBONATO; contador++) {
            Bicarbonato bicarbonato = new Bicarbonato();
            ingredientes.add(bicarbonato);
        }
        for (int contador = 0; contador < QTDCHOCOLATEPO; contador++) {
            ChocolatePo chocolatepo = new ChocolatePo();
            ingredientes.add(chocolatepo);
        }

        for (int contador = 0; contador < QTDCANELA; contador++) {
            Canela canela = new Canela();
            ingredientes.add(canela);
        }
    }

}
