package pe.edu.cibertec.soap.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.soap.model.medico;

import java.util.List;

@Service
public class medicoService {


    @Autowired
    private pe.edu.cibertec.soap.repository.medicoRepository medicoRepository;

    public List<medico> obtenerMedicos(){
        return medicoRepository.findAll();
    }

    public medico obtenerMedicoPorId(Integer id){
        return medicoRepository.findById(id).orElse(null);
    }

    public medico guardarMedico(medico medico){
        return medicoRepository.save(medico);
    }
}
