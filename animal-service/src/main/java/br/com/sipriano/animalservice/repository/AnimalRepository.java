package br.com.sipriano.animalservice.repository;

import br.com.sipriano.animalservice.controller.dto.FuncionarioResgateDTO;
import br.com.sipriano.animalservice.entity.Animal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.sql.Date;
import java.util.List;

public interface AnimalRepository extends JpaRepository<Animal, Integer> {

    @Query("SELECT a FROM Animal a WHERE a.dataAdocao IS NULL ORDER BY a.dataEntrada ASC")
    List<Animal> findNotAdopted();

    @Query("SELECT a FROM Animal a WHERE a.dataAdocao IS NOT NULL")
    List<Animal> findAdopted();

    @Query("""
                SELECT new br.com.sipriano.animalservice.controller.dto.FuncionarioResgateDTO(
                    a.nomeRecebedor,
                    COUNT(a)
                )
                FROM Animal a
                WHERE a.dataEntrada BETWEEN :dataInicio AND :dataFim
                GROUP BY a.nomeRecebedor
            """)
    List<FuncionarioResgateDTO> contarAnimaisPorFuncionario(
            @Param("dataInicio") Date dataInicio,
            @Param("dataFim") Date dataFim
    );

}
