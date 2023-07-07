package gm.rh.repositorio;

import gm.rh.modelo.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;

//se extiende la entidad y el tipo de dato de la llave primaria
public interface EmpleadoRepositorio extends JpaRepository<Empleado,Integer> {

}
