
package modelo;
import java.sql.Date;
public class Orador {
       private int idOrador;
    private String nombre;
    private String apellido;
    private String tema;
    private Date fechaAlta;

    // Constructor
    public Orador() {
    }

    public Orador(int idOrador, String nombre, String apellido, String tema, Date fechaAlta) {
        this.idOrador = idOrador;
        this.nombre = nombre;
        this.apellido = apellido;
        this.tema = tema;
        this.fechaAlta = fechaAlta;
    }

    public int getIdOrador() {
        return idOrador;
    }

    public void setIdOrador(int idOrador) {
        this.idOrador = idOrador;
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

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }
}
