package tarjetas.Repositorios;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tarjetas.entidades.TarjetasEntity;

@Repository
public interface ITarjetasRepository extends CrudRepository<TarjetasEntity, Integer> {

    
}
