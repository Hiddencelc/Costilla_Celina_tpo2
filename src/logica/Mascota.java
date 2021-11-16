package logica;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Mascota{

    //declaracion de atributos y mapeo de los mismos
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Integer id;
    
    @Basic
    private Integer nroCliente;

    @Basic
    @Column(nullable = false)
    private String nombre;

    @Basic
    private String raza;

    @Basic
    private String color;

    @Column(nullable = false)
    private String alergico;

    @Column(nullable = false)
    private String atencionEspecial;

    @Column(nullable = false)
    private String nombreDuenio;

    @Column(nullable = false)
    private String celularDuenio;

    @Basic
    private String observaciones;

    //metodo constructor sin parametros
    
    public Mascota() {
    }

    //metodo constructor con todos los parametros

    public Mascota(Integer id, Integer nroCliente, String nombre, String raza, String color, String alergico, String atencionEspecial, String nombreDuenio, String celularDuenio, String observaciones) {
        this.id = id;
        this.nroCliente = nroCliente;
        this.nombre = nombre;
        this.raza = raza;
        this.color = color;
        this.alergico = alergico;
        this.atencionEspecial = atencionEspecial;
        this.nombreDuenio = nombreDuenio;
        this.celularDuenio = celularDuenio;
        this.observaciones = observaciones;
    }
    
    
    //declaracion de getters y setters
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNroCliente() {
        return nroCliente;
    }

    public void setNroCliente(Integer nroCliente) {
        this.nroCliente = nroCliente;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getAlergico() {
        return alergico;
    }

    public void setAlergico(String alergico) {
        this.alergico = alergico;
    }

    public String getAtencionEspecial() {
        return atencionEspecial;
    }

    public void setAtencionEspecial(String atencionEspecial) {
        this.atencionEspecial = atencionEspecial;
    }

    public String getNombreDuenio() {
        return nombreDuenio;
    }

    public void setNombreDuenio(String nombreDuenio) {
        this.nombreDuenio = nombreDuenio;
    }

    public String getCelularDuenio() {
        return celularDuenio;
    }

    public void setCelularDuenio(String celularDuenio) {
        this.celularDuenio = celularDuenio;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    // metodo toString 

    @Override
    public String toString() {
        return "Mascota{" + "id=" + id + ", nroCliente=" + nroCliente + ", nombre="
         + nombre + ", raza=" + raza + ", color=" + color + ", alergico=" + alergico 
         + ", atencionEspecial=" + atencionEspecial + ", nombreDuenio=" + nombreDuenio
         + ", celularDuenio=" + celularDuenio + ", observaciones=" + observaciones + '}';
    }
   

}
