package org.yourcompany.yourproject;

public class Main {

    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca();

        Socio socio = new Socio("1", "Juan", "juan@email.com", 3);
        biblioteca.agregarSocio(socio);
        
    }
}



