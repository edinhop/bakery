package br.com.finder.bakery.material;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MaterialRepository extends JpaRepository<Material, Long> {
    boolean existsByName(String name);

    List<Material> findByName(String name);

    List<Material> findByUser(String user);
}
