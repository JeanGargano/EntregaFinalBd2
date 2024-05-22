package com.Neo4j.RestApi.Service;

import com.Neo4j.RestApi.Model.UsuarioModel;
import com.Neo4j.RestApi.Repository.IUsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class IUsuarioServiceImp implements IUsuarioService {


    @Autowired
    IUsuarioRepository usuarioRepository;

    @Override
    public String crearUsuario(UsuarioModel usuario) {
        this.usuarioRepository.save(usuario);
        return "El usuario se ha registrado correctamente";
    }

    @Override
    public List<UsuarioModel> listarUsuarios() {
        return this.usuarioRepository.findAll();
    }

    @Override
    public String actualizarUsuarioPorId(UsuarioModel usuario, Long id) {
        Optional<UsuarioModel> usuarioEncontrado=  usuarioRepository.findById(usuario.getId());
        if(usuarioEncontrado.isPresent()){
            UsuarioModel nuevoUsuario = usuarioEncontrado.get();
            nuevoUsuario.setNombre(usuario.getNombre());
            nuevoUsuario.setCarrera(usuario.getCarrera());
            usuarioRepository.save(nuevoUsuario);
            return "El usuario se ha actualizado con correctamente";
        }else{
            return "usuario no encontrado";
        }
    }

    @Override
    public String elimarUsuarioPorId(Long id) {
        this.usuarioRepository.deleteById(id);
        return "El usuario se ha eliminado correctamente";
    }
}
