package gestorreservasaulas.entidades;

import gestorreservasaulas.enums.Estado;
import jakarta.persistence.*;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;


@Entity
@Table(name = "laboratorios")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Laboratorio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String nombre;

    private int piso;
    private int capacidad;

    @OneToMany(mappedBy = "laboratorio", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Reserva> listaReserva;

    @OneToMany(mappedBy = "laboratorio", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Horario> listaHorario;

    @Enumerated(value = EnumType.STRING)
    private Estado estado;

    @ManyToOne
    @JoinColumn(name = "id_bloque")
    private Bloque bloque;
}