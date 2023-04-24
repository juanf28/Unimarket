package co.edu.uniquindio.proyecto.dto;

import co.edu.uniquindio.proyecto.entidades.MetodoPago;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@ToString

public class CompraDTO {

    private int codigoUsuario;
    private MetodoPago metodoPago;
    private List<DetalleCompraDTO> detalleCompraDTO;

    private LocalDate fechaCompra;
    private float valorTotal;

    public int getCedulaUsuario() {
        return 0;
    }
}
