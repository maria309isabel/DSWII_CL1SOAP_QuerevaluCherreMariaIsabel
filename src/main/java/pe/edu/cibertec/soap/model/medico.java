package pe.edu.cibertec.soap.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "Medico")
public class medico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idmedico;
    @Column(name="nommedico")
    private String nommedico;
    @Column(name="apemedico")
    private String apeme;
    @Column(name="fechnacmedico")
    private Date fechnac;
}
