package pe.edu.cibertec.APIRESTEC2HerreraSergio.service;

import pe.edu.cibertec.APIRESTEC2HerreraSergio.model.bd.Persona;

import java.util.List;

public interface IPersonaService {
    List<Persona> listarPersonas();
    void registrarPersona(Persona persona);
    void actualizarPersona(Persona persona);
    void eliminarPersona(int idPersona);
    Persona obtenerPersonaPorId(int idPersona);
}
