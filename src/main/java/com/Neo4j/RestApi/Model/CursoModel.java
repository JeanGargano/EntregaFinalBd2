package com.Neo4j.RestApi.Model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Node("Curso")
public class CursoModel {

    @Id
    @GeneratedValue
    private Long id;
    private Integer idCurso;
    private String nombre;
    private String categoria;


}
