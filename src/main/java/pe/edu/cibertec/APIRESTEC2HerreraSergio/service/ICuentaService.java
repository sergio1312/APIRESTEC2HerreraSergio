package pe.edu.cibertec.WAEC2HerreraSergio.service;

import pe.edu.cibertec.WAEC2HerreraSergio.model.bd.Cuenta;
import java.util.List;

public interface ICuentaService {
    List<Cuenta> listarCuentas();
    void registrarCuenta(Cuenta cuenta);
    void actualizarCuenta(Cuenta cuenta);
    void eliminarCuenta(int idCuenta);
    Cuenta obtenerCuentaPorId(int idCuenta);
}
