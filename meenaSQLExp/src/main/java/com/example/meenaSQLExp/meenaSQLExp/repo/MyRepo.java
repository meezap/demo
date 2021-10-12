package com.example.meenaSQLExp.meenaSQLExp.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.meenaSQLExp.meenaSQLExp.DTO.myModel;

public interface MyRepo extends JpaRepository<myModel, Integer> {

}
