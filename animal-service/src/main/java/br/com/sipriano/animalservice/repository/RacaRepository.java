package br.com.sipriano.animalservice.repository;

import br.com.sipriano.animalservice.entity.Raca;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RacaRepository extends JpaRepository<Raca, Integer> {

    Optional<Raca> findByNome(String nome);

}
