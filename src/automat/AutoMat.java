/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automat;

import static automat.Meny.dressList;
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
        matList.add(new Mat(0, "Armut", "Mat", 35));
        matList.add(new Mat(1, "Elma", "Mat", 20));
        matList.add(new Mat(2, "Kayısı", "Mat", 25));
        matList.add(new Mat(3, "Muz", "Mat", 17));
        matList.add(new Mat(4, "Portakal", "Mat", 28));
        
        drinkList.add(new Drink(0, "Meyve Suyu", "Drink", 35));
        drinkList.add(new Drink(1, "Cola", "Drink", 35));
        drinkList.add(new Drink(2, "Gazoz", "Drink", 35));
        drinkList.add(new Drink(3, "Su", "Drink", 35));
        drinkList.add(new Drink(4, "Fanta", "Drink", 35));
        
        dressList.add(new Dress(0, "Tunik", "Kläder", 135));
        dressList.add(new Dress(1, "Skor", "Kläder", 435));
        dressList.add(new Dress(2, "Byxor", "Kläder", 234));
        dressList.add(new Dress(3, "Stumpa", "Kläder", 45));
        dressList.add(new Dress(4, "Skjorta", "Kläder", 95));
       Meny.Menu();
        
    }

   
}
