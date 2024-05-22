package com.Neo4j.RestApi.Service;

import com.Neo4j.RestApi.Model.CursoModel;
import com.Neo4j.RestApi.Model.UsuarioModel;

import java.util.List;

public interface IUsuarioService {

    String crearUsuario(UsuarioModel usuario);

    List<CursoModel> listarCursos();

    String actualizarCursoPorId(UsuarioModel usuario, Long idUsuario);

    String elimarUsuarioPorId(Long idUsuario);
}
