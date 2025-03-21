package com.backend.franchise.application;

import java.util.List;
import java.util.Optional;

import com.backend.franchise.domain.Franchise;
import com.backend.franchise.domain.FranchiseDto;

public interface FranchiseService {
    List<Franchise> findAll();
    Optional<Franchise> findById(Long id);
    Optional<Franchise> update(Long id, FranchiseDto franchise);
    Franchise save(FranchiseDto franchise);
    Optional<Franchise> delete(Long id);
}
