package logica;

import igu.AltaMascota;

public class TestPeluqueria {

    public static void main(String[] args) {

        //Creo una instancia de mi controladora de logica
        Controladora control = new Controladora();

        //conecto mi vista con mi controladora usando el contructor modificado
        AltaMascota formAlta = new AltaMascota(control);

        //hago visible mi vista y la centro.
        formAlta.setVisible(true);
        formAlta.setLocale(null);

    }

}
