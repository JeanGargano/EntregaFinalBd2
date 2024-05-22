package com.Neo4j.RestApi.Service;

import com.Neo4j.RestApi.Model.CursoModel;
import com.Neo4j.RestApi.Model.TutorModel;

import java.util.List;

public interface ITutorService {

    String crearTutor(TutorModel tutor);

    List<TutorModel> listarTutores();

    String actualizarTutoresPorId(TutorModel tutor, Long idTutor);

    String eliminarTutorPorId(Long idTutor);
}
