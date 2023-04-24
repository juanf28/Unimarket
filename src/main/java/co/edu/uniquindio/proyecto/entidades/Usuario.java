package co.edu.uniquindio.proyecto.entidades;

import co.edu.uniquindio.proyecto.dto.UsuarioDTO;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

import java.io.Serializable;

@Entity
@Getter
@Setter
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Usuario extends Persona implements Serializable {
    @Id
    @EqualsAndHashCode.Include
    private int cedula;

    @Column(length = 100, nullable = false)
    private String nombreCompleto;

    @Column(length = 20, nullable = false)
    private String numTelefono;


    @Column(length = 50, nullable = false)
    private String email;

    @Column(length = 15, nullable = false)
    private String contrasenia;
    private String estado;

    @Column(length = 100, nullable = false)
    private String direccion;


    /*
    public Usuario(String nombreCompleto, String cedula, String numTelefono, String email, String contrasenia, String direccion){
        super(nombreCompleto, cedula, contrasenia);
        this.numTelefono=numTelefono;
        this.email=email;
        this.direccion=direccion;


    }

     */

}
