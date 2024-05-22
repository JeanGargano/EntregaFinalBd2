package com.Neo4j.RestApi.Service;
import com.Neo4j.RestApi.Repository.ICursoRepository;
import com.Neo4j.RestApi.Model.CursoModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ICursoServiceImp implements ICursoService {

    @Autowired
    ICursoRepository cursoRepository;

    @Override
    public String crearCurso(CursoModel curso) {
        this.cursoRepository.save(curso);
        return "Se creo el curso con exito";
    }

    @Override
    public List<CursoModel> listarCursos() {
        return this.cursoRepository.findAll();
    }

    @Override
    public String actualizarCursoPorId(CursoModel curso, Long id) {
        Optional<CursoModel> cursoEncontrado=  cursoRepository.findById(curso.getId());
        if(cursoEncontrado.isPresent()){
            CursoModel nuevoCurso = cursoEncontrado.get();
            nuevoCurso.setCategoria(curso.getCategoria());
            nuevoCurso.setNombre(curso.getNombre());
            cursoRepository.save(nuevoCurso);
            return "Curso actualizado con exito";
        }else{
            return "Curso no encontrado";
        }
    }

    @Override
    public String eliminarCursoPorId(Long id) {
        this.cursoRepository.deleteById(id);
        return "Curso eliminado con exito";
    }
}
