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
        
        //Hausaufgabe:
        //1. Erstellt zwei Passagierflugzeuge und lasst sie starten!
        //2. Erweitert das Projekt um die Klasse Militaer (Eigenschaft: Propellerzahl)
        //3. Lasst zwei Flugzeuge der Klasse Militaer starten!
        //Auch an anderen Projekten als Klausurübung machen!


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
