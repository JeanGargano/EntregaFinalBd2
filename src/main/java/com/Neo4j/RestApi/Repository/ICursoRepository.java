package com.Neo4j.RestApi.Repository;
import com.Neo4j.RestApi.Model.CursoModel;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface ICursoRepository extends Neo4jRepository<CursoModel, Long> {
}
