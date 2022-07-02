package com.br.carstore.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.carstore.models.CarstoreModels;

public interface CarstoreRepository extends JpaRepository<CarstoreModels, Long>{

}
