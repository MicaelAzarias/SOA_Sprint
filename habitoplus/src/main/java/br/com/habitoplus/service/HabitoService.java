package br.com.habitoplus.service;

import br.com.habitoplus.dto.HabitoRequest;
import br.com.habitoplus.model.RegistroHabito;
import br.com.habitoplus.repository.HabitoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;

@Service
public class HabitoService {

    @Autowired
    private HabitoRepository repository;

    public RegistroHabito registrarHabito(HabitoRequest request) {
        // Regra de Negócio: Calcular pontos (Milhas de saúde)
        int pontos = calcularPontos(request.getTipoAtividade(), request.getMinutosDuracao());

        RegistroHabito habito = new RegistroHabito();
        habito.setColaboradorId(request.getColaboradorId());
        habito.setTipoAtividade(request.getTipoAtividade());
        habito.setDescricao(request.getDescricao());
        habito.setMinutosDuracao(request.getMinutosDuracao());
        habito.setPontosGerados(pontos);
        habito.setDataRegistro(LocalDateTime.now());

        return repository.save(habito);
    }

    private int calcularPontos(String atividade, int minutos) {
        // Exemplo de lógica: Exercício intenso vale o dobro
        int multiplicador = atividade.equalsIgnoreCase("CORRIDA") ? 10 : 5;
        return minutos * multiplicador;
    }
}