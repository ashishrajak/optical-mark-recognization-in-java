package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.Main;
import com.entity.ans;
import com.repositary.ans_repo;
import com.repositary.reposatary;



@Service

public class readclass  implements readinter{
    
    
    @Autowired(required = true)
    private ans_repo ans_repo;
    @Override
    public String check(String sb,String name) {
        ans ans= new ans();
        try {
           ans.setName(name);
           ans.setAnswer(sb);
            
            ans_repo.save(ans);
            
   

        } catch (Exception e) {
            
            
        }
       
        
        return " check completed";
    }
   
}
