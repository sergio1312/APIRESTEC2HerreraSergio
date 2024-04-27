package pe.edu.cibertec.APIRESTEC2HerreraSergio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.cibertec.APIRESTEC2HerreraSergio.model.bd.Cuenta;
import pe.edu.cibertec.APIRESTEC2HerreraSergio.model.bd.Persona;
import pe.edu.cibertec.APIRESTEC2HerreraSergio.service.CuentaService;
import pe.edu.cibertec.APIRESTEC2HerreraSergio.service.ICuentaService;
import pe.edu.cibertec.APIRESTEC2HerreraSergio.service.IPersonaService;
import pe.edu.cibertec.APIRESTEC2HerreraSergio.service.PersonaService;

import java.util.List;

@RestController
@RequestMapping(path="/api/v1")
public class ListaController {
    @Autowired
    private CuentaService cuentaService;

    @Autowired
    private PersonaService personaService;

    @GetMapping("/cuentas")
    public List<Cuenta> obtenerCuentas() {
        return cuentaService.listarCuentas();
    }

    @GetMapping("/personas")
    public List<Persona> obtenerPersonas() {
        return personaService.listarPersonas();
    }

}
