package com.guide.TourismGuid.entity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.guide.TourismGuid.entity.Plage;
@Repository
public interface PlageRepo extends JpaRepository<Plage, Long> {

}
