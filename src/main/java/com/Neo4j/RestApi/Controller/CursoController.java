package com.Neo4j.RestApi.Controller;

import com.Neo4j.RestApi.Model.CursoModel;
import com.Neo4j.RestApi.Service.ICursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Curso")

public class CursoController {

    @Autowired
    ICursoService cursoService;

    @PostMapping("/save")
    public ResponseEntity<String> crearCurso(@RequestBody CursoModel curso) {
        String resultadoHttp = cursoService.crearCurso(curso);
        return new ResponseEntity<String>(resultadoHttp, HttpStatus.OK);
    }


    @GetMapping("/get/all")
    public ResponseEntity<List<CursoModel>> listarCurso(){
        List<CursoModel> cursos = cursoService.listarCursos();
        return new ResponseEntity<>(cursos,HttpStatus.OK);
    }


    @PutMapping ("/put/{idCurso}")
    public ResponseEntity<String> actualizarCursoPorId(@RequestBody CursoModel curso, @PathVariable Long id) {
        String resultado = this.cursoService.actualizarCursoPorId(curso, id);
        return ResponseEntity.ok(resultado);
    }

    @DeleteMapping("/delete/{idCurso}")
    public ResponseEntity<String> eliminarCursoPorId(@PathVariable Long id) {
        String resultado = this.cursoService.eliminarCursoPorId(id);
        return ResponseEntity.ok(resultado);
    }


}
