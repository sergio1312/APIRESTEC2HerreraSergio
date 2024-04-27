package pe.edu.cibertec.APIRESTEC2HerreraSergio.service;

import pe.edu.cibertec.APIRESTEC2HerreraSergio.model.bd.Cuenta;

import java.util.List;

public interface ICuentaService {
    List<Cuenta> listarCuentas();
    void registrarCuenta(Cuenta cuenta);
    void actualizarCuenta(Cuenta cuenta);
    void eliminarCuenta(int idCuenta);
    Cuenta obtenerCuentaPorId(int idCuenta);
}
