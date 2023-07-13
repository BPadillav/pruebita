package ec.edu.ups.ppw.prueba;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Personas {
	
	@Id
	@GeneratedValue

    int id_persona;
    String cedula;
    String nombre;
    String apellido; 
    String direccion;
    
    public Personas() {
    	super();
    }
    
    
    
	public int getId_persona() {
		return id_persona;
	}
	public void setId_persona(int id_persona) {
		this.id_persona = id_persona;
	}
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	@Override
	public String toString() {
		return "Personas [id_persona=" + id_persona + ", cedula=" + cedula + ", nombre=" + nombre + ", apellido="
				+ apellido + ", direccion=" + direccion + "]";
	}
   
}
