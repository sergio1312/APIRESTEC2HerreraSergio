package pe.edu.cibertec.WAEC2HerreraSergio.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.WAEC2HerreraSergio.model.bd.Cuenta;
import pe.edu.cibertec.WAEC2HerreraSergio.repository.CuentaRepository;

import java.util.List;

@Service
public class CuentaService implements ICuentaService{
    @Autowired
    private CuentaRepository cuentaRepository;

    @Override
    public List<Cuenta> listarCuentas() {
        return cuentaRepository.findAll();
    }

    @Override
    public void registrarCuenta(Cuenta cuenta) {
        cuentaRepository.save(cuenta);
    }

    @Override
    public void actualizarCuenta(Cuenta cuenta) {
        cuentaRepository.save(cuenta);
    }

    @Override
    public void eliminarCuenta(int idCuenta) {
        cuentaRepository.deleteById(idCuenta);
    }

    @Override
    public Cuenta obtenerCuentaPorId(int idCuenta) {
        return cuentaRepository.findById(idCuenta).orElse(null);
    }
}
