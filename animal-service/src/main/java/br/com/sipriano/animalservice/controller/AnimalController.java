package br.com.sipriano.animalservice.controller;

import br.com.sipriano.animalservice.controller.dto.AnimalRequestDTO;
import br.com.sipriano.animalservice.entity.Animal;
import br.com.sipriano.animalservice.repository.AnimalRepository;
import br.com.sipriano.animalservice.service.AnimalService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/animais")
public class AnimalController {

    private final AnimalService animalService;
    private final AnimalRepository animalRepository;

    public AnimalController(AnimalService animalService, AnimalRepository animalRepository) {
        this.animalService = animalService;
        this.animalRepository = animalRepository;
    }


    @GetMapping
    public List<Animal> listarTodos() {
        return animalRepository.findAll();
    }

    @PostMapping
    public Animal cadastrar(@RequestBody AnimalRequestDTO animalDTO) {
        return animalService.cadastrar(animalDTO);
    }

    @GetMapping("/not-adopted")
    private List<Animal> listarNaoAdotados() {
        return animalRepository.findNotAdopted();
    }

    @GetMapping("/adopted")
    private List<Animal> listarAdotados() {
        return animalRepository.findAdopted();
    }

}
