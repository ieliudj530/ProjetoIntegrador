package com.ecommerce.projeto.repository;

import com.ecommerce.projeto.model.Sale;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SaleRepository extends JpaRepository<Sale, Integer> {

    // (Aquí podríamos añadir métodos para los reportes,
    // como "findByRegion", ¡pero lo veremos después!)

}