package br.com.sipriano.animalservice.service;

import br.com.sipriano.animalservice.controller.dto.AnimalRequestDTO;
import br.com.sipriano.animalservice.entity.Animal;
import br.com.sipriano.animalservice.entity.Raca;
import br.com.sipriano.animalservice.repository.AnimalRepository;
import br.com.sipriano.animalservice.repository.RacaRepository;
import org.springframework.stereotype.Service;

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


}
