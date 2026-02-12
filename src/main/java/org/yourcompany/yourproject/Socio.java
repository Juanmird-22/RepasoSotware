package org.yourcompany.yourproject;

public class Socio extends Usuario {

    private int limiteEjemplares;
    private int ejemplaresEnPrestamo;
    private double multasPendientes;

    public Socio(String id, String nombre, String email, int limiteEjemplares) {
        super(id, nombre, email);
        this.limiteEjemplares = limiteEjemplares;
        this.ejemplaresEnPrestamo = 0;
        this.multasPendientes = 0.0;
    }

    public boolean puedePedirPrestamo(int cantidad) {
        return (ejemplaresEnPrestamo + cantidad) <= limiteEjemplares;
    }

    public void agregarMulta(double monto) {
        multasPendientes += monto;
    }

    public void registrarPrestamo(int cantidad) {
        ejemplaresEnPrestamo += cantidad;
    }
}

