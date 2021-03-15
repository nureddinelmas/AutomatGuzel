/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automat;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author nureddinelmas
 */
public class Meny {

    //public static Scanner scan = new Scanner(System.in);

    public static float laddat;
    public static ArrayList<Mat> matList = new ArrayList<Mat>();
    public static ArrayList<Drink> drinkList = new ArrayList<>();
    public static ArrayList<Dress> dressList = new ArrayList<>();
    
    public static void Menu() {
Scanner scan;
        scan = new Scanner(System.in);
        System.out.println("------------------------------------");
        System.out.println("För att köpa Mat  ..1 ");
        System.out.println("För att köpa Drink  ..2 ");
        System.out.println("För att köpa Kläder ..3 ");
        System.out.println("För att ladda pengar ..4 ");
        System.out.println("Kolla saldo ..9 ");
        System.out.println("För att avsluta programmet ..0 ");
        System.out.println("------------------------------------");
        System.out.print("Har du bestämt vad du skulle göra ? ");
        int x = scan.nextInt();
        //ProduktInterface mt = new Mat(12, "Elma", "Yiyecek", 120);

        switch(x){
            case 0: 
                System.out.println("Du har "+Meny.laddat+" kr");
                break;
            case 1:
                Mat.MatList(matList);
                Mat.MatKop(matList);
                Menu();
                break;

            case 2:
            Drink.DrinkList(drinkList);
            Drink.DrinkKop(drinkList);
                break;
            case 3:
                Dress.DressList(dressList);
                Dress.DressKop(dressList);
                break;
            case 4:
               LaddaPengar();
                Menu();               
               break;              
            case 9:
                System.out.println("Du har "+Meny.laddat+" kr");
                Menu();
                break;
            default:
                Menu();
                break;
        }
        
    }
   
    public static void LaddaPengar() {
      Scanner scan = new Scanner(System.in);
            float choiceladda;
            System.out.println(".........................................");
            System.out.println("För att avsluta köpa ..0 ");
            System.out.print("Vilken mynt ska du ladda upp? ");
            int z = scan.nextInt();

            switch(z){
                case 0:
                    Meny.Menu();
                    break; 
                case 1:
                    
                    System.out.print("Hur många ska du ladda ett mynt ? ");
                    choiceladda = scan.nextFloat();
                    Meny.laddat += ( choiceladda * 1);
                    System.out.println("Du har nu "+ Meny.laddat+" pengar :) ");
                    Meny.Menu();
                    
                    break;
                case 5:
                    System.out.print("Hur många ska du ladda fem mynt ? ");
                    choiceladda = scan.nextFloat();
                    Meny.laddat += ( choiceladda * 5);
                    System.out.println("Du har nu "+ Meny.laddat+" pengar :) ");
                    Meny.Menu();
                    break;
                case 10:
                    System.out.print("Hur många ska du ladda tio mynt ? ");
                    choiceladda = scan.nextFloat();
                    Meny.laddat += ( choiceladda * 10);
                    System.out.println("Du har nu "+ Meny.laddat+" pengar :) ");
                    Meny.Menu();
                    break;
                case 20:
                    System.out.print("Hur många ska du ladda tjugo mynt ? ");
                    choiceladda = scan.nextFloat();
                    Meny.laddat += ( choiceladda * 20);
                    System.out.println("Du har nu "+ Meny.laddat+" pengar :) ");
                    Meny.Menu();
                    break;
                default:
                    System.out.println("Lütfen doğru para değerini tıklayınız.");
                    LaddaPengar();
            }
           
    }
           


}
