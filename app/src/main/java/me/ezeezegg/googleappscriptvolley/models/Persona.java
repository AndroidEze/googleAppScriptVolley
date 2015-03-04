package me.ezeezegg.googleappscriptvolley.models;

/**
 * Created by Itguardian on 04/03/2015.
 */
public class Persona {

    private  String nombre;
    private  String salarioDiario;
    private  String diasLaborados;
    private  String sueldo;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSalarioDiario() {
        return salarioDiario;
    }

    public void setSalarioDiario(String salarioDiario) {
        this.salarioDiario = salarioDiario;
    }

    public String getDiasLaborados() {
        return diasLaborados;
    }

    public void setDiasLaborados(String diasLaborados) {
        this.diasLaborados = diasLaborados;
    }

    public String getSueldo() {
        return sueldo;
    }

    public void setSueldo(String sueldo) {
        this.sueldo = sueldo;
    }
}
