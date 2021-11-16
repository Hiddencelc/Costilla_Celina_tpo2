package persistencia;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import logica.Mascota;
import persistencia.exceptions.NonexistentEntityException;

public class ControladoraPersistencia {

    //agrego una instancia de mi MascotaJpaController usando el constructor definido por nosotros.
    MascotaJpaController mascotaJpa = new MascotaJpaController();

    //                      --------ALTA,BAJA,MODIFICACION Y LECTURA------
    
    //recibe una mascota y la creo usando el método create.
    public void crearMascota(Mascota mascota) {

        try {

            mascotaJpa.create(mascota);
        } catch (Exception e) {
            System.out.println("Error al crear el Cliente mascota");
        }

    }

    //Método para dar de baja una mascota(eliminar) pasando la mascota completa y trayendo con get su id 
    public void eliminarMascota(Mascota mascota) {

        try {
            mascotaJpa.destroy(mascota.getId());
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    // si tengo el id, directamente hago sobrecarga de métodos y me evito traer todo el objeto
    public void eliminarMascota(int id) {

        try {
            mascotaJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    // modifico los datos pasando toda la mascota, sin optar por modificar el id 
    public void modificarMascota(Mascota mascota) {
        try {
            mascotaJpa.edit(mascota);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    //metodo buscar donde pasamos todo el objeto y obtenemos su id retornando el objeto buscado
    public Mascota buscarMascota(Mascota mascota) {

        return mascotaJpa.findMascota(mascota.getId());

    }

    //buscar el objeto pasando solo el id - sobrecarga del método buscar
    public Mascota buscarMascotaPorId(int id) {

        return mascotaJpa.findMascota(id);
    }

    //consulta de todas las mascotas clientes; nos proporciona los datos persistidos.
    public List<Mascota> obtenerListaMascotas() {

        return mascotaJpa.findMascotaEntities();

    }
    
    //método para obtener el id incremental y poder usarlo en generación de Nro de cliente
    
    public Integer generacionNroCliente(){
        
       return mascotaJpa.idIncrementable();
        
    }

}
