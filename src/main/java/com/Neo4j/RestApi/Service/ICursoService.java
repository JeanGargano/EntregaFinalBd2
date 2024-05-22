package com.Neo4j.RestApi.Service;

import com.Neo4j.RestApi.Model.CursoModel;

import java.util.List;

public interface ICursoService {


    String crearCurso(CursoModel curso);

    List<CursoModel> listarCursos();

    String actualizarCursoPorId(CursoModel curso, Long id);

    String eliminarCursoPorId(Long id);

}
