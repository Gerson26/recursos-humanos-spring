package gm.rh.servicio;

import gm.rh.modelo.Empleado;

import java.util.List;

public interface IEmpleadoServicio {

    public List<Empleado> listarEmpleados();

    public Empleado buscarEmpleadoPorId(Integer idEmpleado);

    //funciona como metodo de guardado y de actualizar dependiendo si el id viene nulo
    public Empleado guardarEmpleado(Empleado empleado);

    public  void eliminarEmpleado(Empleado empleado);


}
