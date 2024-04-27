package pe.edu.cibertec.WAEC2HerreraSergio.model.bd;

import lombok.Data;
import jakarta.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "Persona")
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdPersona")
    private Integer IdPersona;

    @Column(name = "NomPersona")
    private String NomPersona;

    @Column(name = "ApePersona")
    private String ApePersona;

    @Column(name = "FechNacPersona")
    private Date FechNacPersona;
}
