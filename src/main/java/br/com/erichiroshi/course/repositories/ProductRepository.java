package br.com.erichiroshi.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.erichiroshi.course.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
