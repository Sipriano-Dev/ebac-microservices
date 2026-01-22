package br.com.sipriano.animalservice.service;

import br.com.sipriano.animalservice.controller.dto.AnimalRequestDTO;
import br.com.sipriano.animalservice.controller.dto.FuncionarioResgateDTO;
import br.com.sipriano.animalservice.entity.Animal;
import br.com.sipriano.animalservice.entity.Raca;
import br.com.sipriano.animalservice.repository.AnimalRepository;
import br.com.sipriano.animalservice.repository.RacaRepository;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.List;

@Service
public class AnimalService {

    private final AnimalRepository animalRepository;
    private final RacaRepository racaRepository;


    public AnimalService(AnimalRepository animalRepository, RacaRepository racaRepository) {
        this.animalRepository = animalRepository;
        this.racaRepository = racaRepository;
    }

    public Animal cadastrar(AnimalRequestDTO dto) {
        Raca raca = racaRepository
                .findByNome(dto.getRaca())
                .orElseThrow(() -> new RuntimeException("Raça não encontrada"));

        Animal animal = new Animal();
        animal.setNomeProvisorio(dto.getNomeProvisorio());
        animal.setIdadeEstimada(dto.getIdadeEstimada());
        animal.setDataEntrada(dto.getDataEntrada());
        animal.setDataAdocao(dto.getDataAdocao());
        animal.setDataObito(dto.getDataObito());
        animal.setCondicoesChegada(dto.getCondicoesChegada());
        animal.setNomeRecebedor(dto.getNomeRecebedor());
        animal.setPorte(dto.getPorte());
        animal.setRaca(raca);

        return animalRepository.save(animal);
    }

    public List<FuncionarioResgateDTO> buscarResgatesPorFuncionario(
            LocalDate inicio,
            LocalDate fim
    ) {
        validarPeriodo(inicio, fim);

        return animalRepository.contarAnimaisPorFuncionario(
                java.sql.Date.valueOf(inicio),
                java.sql.Date.valueOf(fim)
        );
    }

    private void validarPeriodo(LocalDate inicio, LocalDate fim) {
        if (inicio == null || fim == null || inicio.isAfter(fim)) {
            throw new IllegalArgumentException("Período inválido");
        }

        if (inicio.plusYears(1).isBefore(fim)) {
            throw new IllegalArgumentException("Intervalo máximo permitido é de 1 ano");
        }
    }




}
