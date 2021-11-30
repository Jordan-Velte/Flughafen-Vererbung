package model;

public class Militaer extends Flugzeug{
    int _propellerzahl;

    public Militaer(int flugzeugnummer, String airline, int propellerzahl){
        super(flugzeugnummer, airline);
        setPropellerzahl(propellerzahl);
    }

    public void setPropellerzahl(int propellerzahl) {
        this._propellerzahl = propellerzahl;
    }
    public int getPropellerzahl() {
        return _propellerzahl;
    }

    public String prepareStart(){
        if(getPropellerzahl() > 4){
            return "Am Flughafen sind nicht mehr als 4 Propeller zulaessig!";
        }
        else{
            return "Ok! - Militaerflugzeug kann starten!";
        }
    }
}
