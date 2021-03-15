/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automat;

import static automat.Meny.Menu;
import java.util.ArrayList;
import java.util.function.Consumer;

/**
 *
 * @author nureddinelmas
 */
abstract public class ProduktAbs {


    public int pkod;
    public String name;
    public String beskrivning;
    public float kostnad;
    
    public static Mat mat;
    public static Drink drink;

    public ProduktAbs(int pkod, String name, String beskrivning, float kostnad) {
        this.pkod = pkod;
        this.name = name;
        this.beskrivning = beskrivning;
        this.kostnad = kostnad;
    }


}
