/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automat;

import static automat.Meny.matList;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author nureddinelmas
 */
public class Mat extends ProduktAbs implements ProduktInterface{
    
    public Mat(int pkod, String name, String beskrivning, float kostnad) {
        super(pkod, name, beskrivning, kostnad);
    }

  

    @Override
    public void Buy() {
        
    Scanner scan = new Scanner(System.in);
    float summa = 0;
    
    if (Meny.laddat < kostnad){
            System.out.println(".........................................");
            System.out.println("Paran Yok kardeş");
            System.out.println("Geri gitmek için 0, yine mat almak için 1");
            int g = scan.nextInt();
            switch(g){
                case 0:
                    Meny.Menu();
                case 1:
                    MatList(matList);
                    MatKop(matList);
            }

         
        } else {
                System.out.println(".........................................");
        summa = ( Meny.laddat - kostnad );
        Meny.laddat = summa;
        System.out.println("Du har köpt "+name+" du har fortfarande "+Meny.laddat);
                

        }
    
    }

    @Override
    public void Description() {

        System.out.println(pkod+" --> "+name+" -- "+beskrivning+" -- "+kostnad+" kr ");


    }

    @Override
    public void Use() {
       
    }

      public static void MatList(ArrayList<Mat> matList){
        System.out.println("---------------------------------------");
        System.out.println("............MAT.......................");
         matList.forEach(i -> {
             i.Description();
        });
             
      }
    
       public static void MatKop(ArrayList<Mat> matList){
           Scanner scan = new Scanner(System.in);
       
        System.out.print("Ne satın almak istiyorsun? ");
        int f = scan.nextInt();
        
        System.out.print("Bunu satın almak istiyor musun? 1 eller 0 ");
        int d = scan.nextInt();
        switch(d){
            case 0:
                Meny.Menu();
                break;
            case 1:

            matList.get(f).Description();
            matList.get(f).Buy(); 
       }
}

}
 

    
       

