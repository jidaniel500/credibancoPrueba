package tarjetas.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tarjetas.Repositorios.ITarjetasRepository;

@Service
public class TarjetaService implements ITarjeta {

    @Autowired
    ITarjetasRepository repository;



}
