package model;

public class Transport extends Flugzeug{
    int _maxZuladung;
    int _momentanZuladung;

    public Transport(int flugzeugnummer, String airline, int maxZuladung, int momentanZuladung){
        super(flugzeugnummer, airline);
        setMaxZuladung(maxZuladung);
        setMomentanZuladung(momentanZuladung);
    }

    public void setMaxZuladung(int maxZuladung) {
        this._maxZuladung = maxZuladung;
    }
    public void setMomentanZuladung(int momentanZuladung) {
        this._momentanZuladung = momentanZuladung;
    }
    public int getMaxZuladung() {
        return _maxZuladung;
    }
    public int getMomentanZuladung() {
        return _momentanZuladung;
    }
    public String prepareStart(){
        if(getMomentanZuladung() >getMaxZuladung()){
            return "Zu voll!";
        }
        else{
            return "Ok! - Transportflugzeug kann starten!";
        }
    }
}
