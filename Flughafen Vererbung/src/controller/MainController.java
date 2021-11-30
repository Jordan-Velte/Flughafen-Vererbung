package controller;

//Import nötig: MainController = Schnittstelle zwischen Model und View (siehe MVC)
import model.Passagier;
import model.Privat;
import model.Tower;
import model.Transport;
import model.Militaer;
import view.Output;

public class MainController {
    public MainController(){
        //DEMODATEN
        //Objekterstellung: Datentyp Variablenname = new Klasse (Eigenschaften)
        Privat p = new Privat(23, "SyltAir", "Jet");
        Tower t = new Tower();
        Transport tp = new Transport(234, "Cargo", 2000, 2005);

        //Erstellung von zwei Passagierflugzeugen (Instanzen) aus Subklasse Passagier
        Passagier p1 = new Passagier(22, "LH", 200, 170);
        Passagier p2 = new Passagier(13, "AF", 300, 270);

        //Erstellung von Militaerflugzeugen
        Militaer m1 = new Militaer(7, "Luftwaffe", 3);
        Militaer m2 = new Militaer(8, "Luftwaffe", 2);
        Militaer m3 = new Militaer(8, "Luftwaffe", 9);

        //Erstellung einer Instanz der Klasse Output aus dem View (ohne Parameterübergabe), um Ausgabemethode der Klasse per Punktnoation aufzurufen
        Output o = new Output();
        

        //FLUGSTART
        //Effizienter:
        o.printData(t.startPlane(p));
        //Polymerphie: printData = View, Instanz t von Tower (data) = Model --> Controller als Schnittstelle!
        o.printData(t.startPlane(tp));

        //Starten der Passagierflugzeuge
        o.printData(t.startPlane(p1));
        o.printData(t.startPlane(p2));

        //Starten der Militaerflugzeuge
        o.printData(t.startPlane(m1));
        o.printData(t.startPlane(m2));
        o.printData(t.startPlane(m3));

        //Hausaufgabe zum 01.12.2021:
        //1. Erstellt zwei Passagierflugzeuge und lasst sie starten!
        //2. Erweitert das Projekt um die Klasse Militaer (Eigenschaft: Propellerzahl)
        //3. Lasst zwei Flugzeuge der Klasse Militaer starten!
        //Auch an anderen Projekten als Klausurübung machen!


        //Am Tower Methode zurückrufen (Zeitaufwendiger zu programmieren über Zwischenvariable)
        /*
        String temp = t.startPlane(p);
        o.printData(temp);
        */
    }
}
