package com.repositary;


import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.entity.grade;

@Repository
public interface reposatary extends JpaRepository<grade,Long>{

}
