package com.Neo4j.RestApi.Model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;

import java.lang.reflect.Type;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Node("Usuario")

public class UsuarioModel {

    @Id
    @GeneratedValue
    private Long idUsuario;
    private String nombre;
    private String carrera;
    private String semestre;

    @Relationship(type="toma")
    List<CursoModel> cursos;

    @Relationship(type="calificaCurso")
    List<CursoModel> calificaciones;
}
