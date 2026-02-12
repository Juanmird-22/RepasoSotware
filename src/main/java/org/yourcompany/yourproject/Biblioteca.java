package org.yourcompany.yourproject;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    private List<Socio> socios;
    private List<Bibliotecario> bibliotecarios;

    public Biblioteca() {
        socios = new ArrayList<>();
        bibliotecarios = new ArrayList<>();
    }

    public void agregarSocio(Socio socio) {
        socios.add(socio);
    }

    public void agregarBibliotecario(Bibliotecario biblio) {
        bibliotecarios.add(biblio);
    }
}

