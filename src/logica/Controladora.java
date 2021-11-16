package logica;

import java.util.List;
import persistencia.ControladoraPersistencia;


public class Controladora {

    //creo una instancia de mi controladora de persistencia para acceder a sus métodos por medio de la lógica
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    //declaro mis métodos de alta,baja,modificacion y lectura
    
    public void crearMascota(Mascota mascota) {
        controlPersis.crearMascota(mascota);

    }

    public void crearMascota(Integer cliente,String nombre, String raza, String color, String alergico, String atencionEspecial, String nombreDuenio, String celularDuenio, String observaciones) {

        //creo una instancia de mascota en mi controladotra de lógica usando constructor vacío 
        
        Mascota mascota = new Mascota();

        //seteamos los parametros recibidos de mi vista(jFrame AltaMascota)
        mascota.setNroCliente(cliente);
        mascota.setNombre(nombre);
        mascota.setRaza(raza);
        mascota.setColor(color);
        mascota.setAlergico(alergico);
        mascota.setAtencionEspecial(atencionEspecial);
        mascota.setNombreDuenio(nombreDuenio);
        mascota.setCelularDuenio(celularDuenio);
        mascota.setObservaciones(observaciones);

        // despues de esto puedo crear mi mascota usando el método correspondiente de mi controlPersis
        controlPersis.crearMascota(mascota);

    }

    //llamo al método eliminar de mi controladora de persistencia pasando objeto completo
    public void eliminarMascota(Mascota mascota) {

        controlPersis.eliminarMascota(mascota);

    }

    //llamo al metodo eliminar de mi controladora de persistencia pasando solo el id, en caso de conocerlo
    public void eliminarMascota(int id) {

        controlPersis.eliminarMascota(id);
    }

    //llamo al metodo modificar de mi controladora de persistencia y paso el objeto completo 
    public void modificarMascota(Mascota mascota) {

        controlPersis.modificarMascota(mascota);
    }

    //llamo al método buscar mascota de mi persitencia pasando objeto completo
    public Mascota buscarMascota(Mascota mascota) {

        return controlPersis.buscarMascota(mascota);
    }

    //llamo al meétodo buscar mascota pasando solamente el id
    public Mascota buscarMascotaPorId(int id) {

        return controlPersis.buscarMascotaPorId(id);
    }

    // llamo al método de consulta de mi persistencia que devuelve la lista de mascotas clientes
    public List<Mascota> obtenerListaMascotas() {

        return controlPersis.obtenerListaMascotas();
    }

    //método para generar NroDeCliente usando el idIncrementable.
    public Integer generarNroCliente() {

        return controlPersis.generacionNroCliente();

    }
}
