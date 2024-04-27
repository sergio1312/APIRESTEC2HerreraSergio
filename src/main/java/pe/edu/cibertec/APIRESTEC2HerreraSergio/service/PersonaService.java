package pe.edu.cibertec.APIRESTEC2HerreraSergio.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.APIRESTEC2HerreraSergio.model.bd.Persona;
import pe.edu.cibertec.APIRESTEC2HerreraSergio.repository.PersonaRepository;
import java.util.List;

@Service
public class PersonaService implements IPersonaService{
    @Autowired
    private PersonaRepository personaRepository;

    @Override
    public List<Persona> listarPersonas() {
        return personaRepository.findAll();
    }

    @Override
    public void registrarPersona(Persona persona) {
        personaRepository.save(persona);
    }

    @Override
    public void actualizarPersona(Persona persona) {
        personaRepository.save(persona);
    }

    @Override
    public void eliminarPersona(int idPersona) {
        personaRepository.deleteById(idPersona);
    }

    @Override
    public Persona obtenerPersonaPorId(int idPersona) {
        return personaRepository.findById(idPersona).orElse(null);
    }
}
