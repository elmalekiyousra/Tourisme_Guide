package com.guide.TourismGuid.entity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.guide.TourismGuid.entity.Admin;

@Repository
public interface AdminRepo extends JpaRepository<Admin, Long> {

}
