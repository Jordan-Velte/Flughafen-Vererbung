package controller;

import model.Privat;
import model.Tower;
import model.Transport;
import view.Output;

public class MainController {
    public MainController(){
        //Objekterstellung: Datentyp Variablenname new Klasse(Eigenschaften)
        Privat p = new Privat(23, "SyltAir", "Jet");
        Tower t = new Tower();
        Output o = new Output();
        Transport tp = new Transport(234, "Cargo", 2000, 2005);
        
        //Am Tower Methode zurückrufen
        /*
        String temp = t.startPlane(p);
        o.printData(temp);
        */
        
        //Effizienter:
        o.printData(t.startPlane(p));
        //Polymerphie!!
        o.printData(t.startPlane(tp));


    }
}
