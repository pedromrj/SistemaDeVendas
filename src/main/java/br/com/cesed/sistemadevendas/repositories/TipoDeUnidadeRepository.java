package br.com.cesed.sistemadevendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.cesed.sistemadevendas.domain.TipoDeUnidade;

@Repository
public interface TipoDeUnidadeRepository extends JpaRepository<TipoDeUnidade, Long>{

}
