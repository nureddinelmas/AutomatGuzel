/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automat;

import static automat.Mat.MatKop;
import static automat.Meny.drinkList;
import static automat.Meny.matList;
import static automat.Meny.scan;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author nureddinelmas
 */
public class Drink extends ProduktAbs implements ProduktInterface{

    public Drink(int pkod, String name, String beskrivning, float kostnad) {
        super(pkod, name, beskrivning, kostnad);
    }

    @Override
    public void Buy() {
      Scanner scan = new Scanner(System.in);
        float summa = 0;
    
    if (Meny.laddat < kostnad){
            System.out.println(".........................................");
            System.out.println("Det finns ingen tillräckligt pengar, fylla pengar först och främst");
            System.out.println("för att avsluta köp --- 0, för att fylla pengar--- 1");
            int g = scan.nextInt();
            switch(g){
                case 0:
                    Meny.Menu();
                    break;
                case 1:
                    Meny.LaddaPengar();
                    break;

            }

         
        } else {
                System.out.println(".........................................");
        summa = ( Meny.laddat - kostnad );
        Meny.laddat = summa;
        System.out.println("Du har köpt "+name+" och du har fortfarande "+Meny.laddat);
                

        }
    }
    

    @Override
    public void Description() {

        System.out.println(pkod+" --> "+name+" -- "+beskrivning+" -- "+kostnad+" kr ");


    }

    @Override
    public void Use() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
  
     public static void DrinkList(ArrayList<Drink> drinkList) throws InterruptedException{
        System.out.println("---------------------------------------");
        System.out.println("............DRINK.......................");
         drinkList.forEach(i -> {
             i.Description();
        });
               
      }

       public static void DrinkKop(ArrayList<Drink> drinkList){
           
       Scanner scan = new Scanner(System.in);
        System.out.print("Vad ska du köpa ?  ");
        int f = scan.nextInt();
        drinkList.get(f).Description();
        System.out.print("Är du säker att du köper "+drinkList.get(f).name+" ? 1 eller 0 ");
        int d = scan.nextInt();
        switch(d){
            case 0:
                Meny.Menu();
                break;
            case 1:

           drinkList.get(f).Description();
            drinkList.get(f).Buy(); 
       }
   
}
