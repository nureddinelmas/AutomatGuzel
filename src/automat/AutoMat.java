/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automat;

import static automat.Meny.drinkList;
import static automat.Meny.matList;



/**
 *
 * @author nureddinelmas
 */
public class AutoMat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        matList.add(new Mat(0, "Armut", "Yiyecek", 35));
        matList.add(new Mat(1, "Elma", "Yiyecek", 20));
        matList.add(new Mat(2, "Kayısı", "Yiyecek", 25));
        matList.add(new Mat(3, "Muz", "Yiyecek", 17));
        matList.add(new Mat(4, "Portakal", "Yiyecek", 28));
        
        drinkList.add(new Drink(0, "Meyve Suyu", "Icecek", 35));
        drinkList.add(new Drink(1, "Cola", "Icecek", 35));
        drinkList.add(new Drink(2, "Gazoz", "Icecek", 35));
        drinkList.add(new Drink(3, "Su", "Icecek", 35));
        drinkList.add(new Drink(4, "Fanta", "Icecek", 35));
       Meny.Menu();
        
    }

   
}
