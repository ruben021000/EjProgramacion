package com.example.rubenmarin.ejprogramacion;

public class Programa {



    int horaIni;
    int horaFin;
    String tipoProg;

    public Programa(int horaIni, int horaFin, String tipoProg) {
        this.horaIni = horaIni;
        this.horaFin = horaFin;
        this.tipoProg = tipoProg;
    }

    public Programa() {

    }



    public int getHoraIni() {
        return horaIni;
    }

    public void setHoraIni(int horaIni) {
        this.horaIni = horaIni;
    }

    public int getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(int horaFin) {
        this.horaFin = horaFin;
    }

    public String getTipoProg() {
        return tipoProg;
    }

    public void setTipoProg(String tipoProg) {
        this.tipoProg = tipoProg;
    }

    @Override
    public String toString() {
        return "Programa{" +
                "horaIni=" + horaIni +
                ", horaFin=" + horaFin +
                ", tipoProg='" + tipoProg + '\'' +
                '}';
    }
}
