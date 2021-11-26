package model;

public class Passagier extends Flugzeug{
    int _maxPassagier;
    int _momentanPassagier;

    public Passagier(int flugzeugnummer, String airline, int maxPassagier, int momentanPassagier){
        super(flugzeugnummer, airline);
        setMaxPassagier(maxPassagier);
        setMomentanPassagier(momentanPassagier);
    }

    public void setMaxPassagier(int maxPassagier) {
        this._maxPassagier = maxPassagier;
    }
    public void setMomentanPassagier(int momentanPassagier) {
        this._momentanPassagier = momentanPassagier;
    }
    public int getMaxPassagier() {
        return _maxPassagier;
    }
    public int getMomentanPassagier() {
        return _momentanPassagier;
    }
    public String prepareStart(){
        if(getMomentanPassagier() >getMaxPassagier()){
            return "Zu voll!";
        }
        else{
            return "Ok! - Passagierflugzeug kann starten!";
        }
    }
}

