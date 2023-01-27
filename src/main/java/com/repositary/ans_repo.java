package com.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.entity.ans;
@Repository
public interface ans_repo extends JpaRepository<ans,Long>{
    
}
