/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifes.cafe.application;

import ifes.cafe.cdp.Cafe;
import ifes.cafe.cdp.Ingredientes;
import ifes.cafe.util.FabricaCafe;


public class App {

    public static void main(String[] args) {
        Cafe cafe = FabricaCafe.criarCafe("normal");
        System.out.println("Cafe normal");
        System.out.println(cafe);
        
        cafe = FabricaCafe.criarCafe("semcafeina");
        System.out.println("Cafe sem cafeína");
        System.out.println(cafe);
        
        cafe = FabricaCafe.criarCafe("capuccino");
        System.out.println("Capuccino");
        System.out.println(cafe);

    }

}
