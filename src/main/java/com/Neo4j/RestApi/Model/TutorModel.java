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
@Node("Tutor")

public class TutorModel {

    @Id
    @GeneratedValue
    private Long id;
    private Integer idTutor;
    private String nombre;
    private String carrera;

}
