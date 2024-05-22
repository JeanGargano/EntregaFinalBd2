package com.Neo4j.RestApi.Repository;
import com.Neo4j.RestApi.Model.UsuarioModel;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface IUsuarioRepository extends Neo4jRepository<UsuarioModel, Long> {
}
