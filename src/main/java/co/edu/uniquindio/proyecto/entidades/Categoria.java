package co.edu.uniquindio.proyecto.entidades;


import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;


import java.io.Serializable;
@Entity
@Getter
@Setter
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private int id;

    private String nombre;

    @ManyToOne
    Producto producto;


}
