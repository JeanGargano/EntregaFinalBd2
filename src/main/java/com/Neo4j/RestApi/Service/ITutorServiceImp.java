package com.Neo4j.RestApi.Service;

import com.Neo4j.RestApi.Model.TutorModel;
import com.Neo4j.RestApi.Repository.ITutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ITutorServiceImp implements ITutorService{

    @Autowired
    ITutorRepository tutorRepository;

    @Override
    public String crearTutor(TutorModel tutor) {
        this.tutorRepository.save(tutor);
        return "El tutor se ha creado correctamente";
    }

    @Override
    public List<TutorModel> listarTutores() {
        return this.tutorRepository.findAll();
    }

    @Override
    public String actualizarTutoresPorId(TutorModel tutor, Long id) {
        Optional<TutorModel> tutorEncontrado=  tutorRepository.findById(tutor.getId());
        if(tutorEncontrado.isPresent()){
            TutorModel nuevoTutor = tutorEncontrado.get();
            nuevoTutor.setNombre(tutor.getNombre());
            nuevoTutor.setCarrera(tutor.getCarrera());
            tutorRepository.save(nuevoTutor);
            return "El tutor se ha actualizado con correctamente";
        }else{
            return "Tutor no encontrado";
        }
    }


    @Override
    public String eliminarTutorPorId(Long id) {
        this.tutorRepository.deleteById(id);
        return "El tutor se ha eliminado con correctamente";
    }
}
