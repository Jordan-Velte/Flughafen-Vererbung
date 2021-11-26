package model;

public abstract class Flugzeug {
    int _flugzeugnummer;
    String _airline;

    public Flugzeug(int flugzeugnummer, String airline){
        setAirline(airline);
        setFlugzeugnummer(flugzeugnummer);
    }

    public void setAirline(String airline) {
        this._airline = airline;
    }
    public void setFlugzeugnummer(int flugzeugnummer) {
        this._flugzeugnummer = flugzeugnummer;
    }
    public String getAirline() {
        return _airline;
    }
    public int getFlugzeugnummer() {
        return _flugzeugnummer;
    }
    //Methodensignatur ohne Rumpf!
    public abstract String prepareStart();

}
