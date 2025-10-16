package com.detodito.demo.repository;

import com.detodito.demo.model.productosElectronico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface productosElectronicoRepository extends JpaRepository<productosElectronico, Long> {
}

