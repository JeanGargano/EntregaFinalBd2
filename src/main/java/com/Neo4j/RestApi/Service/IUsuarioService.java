package com.Neo4j.RestApi.Service;

import com.Neo4j.RestApi.Model.CursoModel;
import com.Neo4j.RestApi.Model.UsuarioModel;

import java.util.List;

public interface IUsuarioService {

    String crearUsuario(UsuarioModel usuario);

    List<UsuarioModel> listarUsuarios();

    String actualizarUsuarioPorId(UsuarioModel usuario, Long id);

    String elimarUsuarioPorId(Long id);
}
