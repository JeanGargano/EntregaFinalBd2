package com.Neo4j.RestApi.Repository;
import com.Neo4j.RestApi.Model.TutorModel;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface ITutorRepository extends Neo4jRepository<TutorModel, Long> {
}
