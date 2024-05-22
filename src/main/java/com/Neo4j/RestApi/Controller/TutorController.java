package com.Neo4j.RestApi.Controller;


import com.Neo4j.RestApi.Model.TutorModel;
import com.Neo4j.RestApi.Service.ITutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Tutor")

public class TutorController {

    @Autowired
    ITutorService tutorService;

    @PostMapping("/save")
    public ResponseEntity<String> crearTutor(@RequestBody TutorModel tutor) {
        String resultadoHttp = tutorService.crearTutor(tutor);
        return new ResponseEntity<String>(resultadoHttp, HttpStatus.OK);
    }


    @GetMapping("/get/all")
    public ResponseEntity<List<TutorModel>> listaTutores(){
        List<TutorModel> tutores = tutorService.listarTutores();
        return new ResponseEntity<>(tutores,HttpStatus.OK);
    }


    @PutMapping ("/put/{idTutor}")
    public ResponseEntity<String> actualizarCursoPorId(@RequestBody TutorModel tutor, @PathVariable Long id) {
        String resultado = this.tutorService.actualizarTutoresPorId(tutor, id);
        return ResponseEntity.ok(resultado);
    }

    @DeleteMapping("/delete/{idTutor}")
    public ResponseEntity<String> eliminarTutorPorId(@PathVariable Long id) {
        String resultado = this.tutorService.eliminarTutorPorId(id);
        return ResponseEntity.ok(resultado);
    }
}
