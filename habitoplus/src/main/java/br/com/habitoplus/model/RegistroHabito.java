package br.com.habitoplus.model;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "registro_habito")
public class RegistroHabito {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String colaboradorId;
    private String tipoAtividade;
    private String descricao;
    private Integer minutosDuracao;
    private Integer pontosGerados;
    private LocalDateTime dataRegistro;
}