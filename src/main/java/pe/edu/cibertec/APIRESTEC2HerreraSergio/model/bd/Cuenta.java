package pe.edu.cibertec.APIRESTEC2HerreraSergio.model.bd;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name = "Cuenta")
public class Cuenta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdCuenta")
    private Integer IdCuenta;

    @Column(name = "NroCuenta")
    private String NroCuenta;

    @Column(name = "FechaRegistro")
    private Date FechaRegistro;

    @Column(name = "FechaVencimiento")
    private Date FechaVencimiento;

    @ManyToOne
    @JoinColumn(name = "IdPersona")
    private Persona persona;
}
