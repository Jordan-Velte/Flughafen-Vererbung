package model;

public class Privat extends Flugzeug{
    String _typ;

    public Privat(int flugzeugnummer, String airline, String typ){
        super(flugzeugnummer, airline);
        setTyp(typ);
    }

    public void setTyp(String typ) {
        this._typ = typ;
    }
    public String getTyp() {
        return _typ;
    }

    //String wird zurückgegeben
    public String prepareStart() {
        // || steht für ODER Bedingung --> sowohl klein als auch groß schreiben 
        // && steht für UND!
        //Mit Klammern kann man mehrere Bedingungen Verknüpfen (siehe Foto 26.11.2021)

        //Operaten bei Bedingungen:
        // == Vergleich
        // != Nicht
        // > Größer
        // < Kleiner
        // >= Größer gleich
        // <= kleiner gleich
        if(getTyp() == "Jet" || getTyp() =="jet"){
            return "Privatflugzeug darf nicht auf Starbahn 32R starten";
        }
        else{
            return "Ok! - Privatflugzeug kann starten!";
        }
    }
}
