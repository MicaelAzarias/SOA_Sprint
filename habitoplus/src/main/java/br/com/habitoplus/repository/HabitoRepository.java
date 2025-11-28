package br.com.habitoplus.repository;

import br.com.habitoplus.model.RegistroHabito;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HabitoRepository extends JpaRepository<RegistroHabito, Long> {
}