package com.Neo4j.RestApi.Controller;


import com.Neo4j.RestApi.Model.UsuarioModel;
import com.Neo4j.RestApi.Service.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Usuario")

public class UsuarioController {

    @Autowired
    IUsuarioService usuarioService;

    @PostMapping("/save")
    public ResponseEntity<String> crearUsuario(@RequestBody UsuarioModel usuario) {
        String resultadoHttp = usuarioService.crearUsuario(usuario);
        return new ResponseEntity<String>(resultadoHttp, HttpStatus.OK);
    }


    @GetMapping("/get/all")
    public ResponseEntity<List<UsuarioModel>> listarUsuarios(){
        List<UsuarioModel> usuarios = usuarioService.listarUsuarios();
        return new ResponseEntity<>(usuarios,HttpStatus.OK);
    }


    @PutMapping ("/put/{idUsuario}")
    public ResponseEntity<String> actualizarUsuariosPorId(@RequestBody UsuarioModel usuario, @PathVariable Long id) {
        String resultado = this.usuarioService.actualizarUsuarioPorId(usuario, id);
        return ResponseEntity.ok(resultado);
    }

    @DeleteMapping("/delete/{idTutor}")
    public ResponseEntity<String> eliminarTutorPorId(@PathVariable Long id) {
        String resultado = this.usuarioService.elimarUsuarioPorId(id);
        return ResponseEntity.ok(resultado);
    }
}
