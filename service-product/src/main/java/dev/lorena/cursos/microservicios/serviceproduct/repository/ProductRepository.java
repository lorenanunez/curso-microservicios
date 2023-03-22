package dev.lorena.cursos.microservicios.serviceproduct.repository;

import dev.lorena.cursos.microservicios.serviceproduct.entity.Category;
import dev.lorena.cursos.microservicios.serviceproduct.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {


    public List<Product> findByCategory(Category category);
}
