package com.controller;

import java.lang.ProcessBuilder.Redirect;
import java.util.Base64;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.Main;
import com.entity.ans;
import com.entity.grade;
import com.model.user;
import com.repositary.ans_repo;
import com.repositary.reposatary;
import com.service.readclass;
import com.service.readinter;

import io.micrometer.common.lang.NonNull;



@RestController
@ComponentScan
public class controller1 {
   String imageans;
   String username;
    
    @Autowired
    private readclass r;
    
    @Autowired
    private Main main;
 
    @PostMapping("/run")
    public ModelAndView check(@RequestParam( "name") String name,
                    @RequestParam("image") MultipartFile image) throws Exception{
        // do something with the form data
        if(image != null && !image.isEmpty()){
            // convert image to string
            byte[] imageBytes = image.getBytes();
            String imageString = new String(Base64.getEncoder().encode(imageBytes), "UTF-8");
            // do something with the form data
            main.imgstr(imageString);
            main.fun();
            imageans=main.getans().toString();
            r.check(imageans, name);
        } else {
            System.out.println("No image was provided.");
        }
        username=name;
        return new ModelAndView("cloud") ;
    }
  
    
 @GetMapping({"/","/home"})
 public ModelAndView home(){
   return new ModelAndView("home");
 }

 @GetMapping("/run")
 public ModelAndView cloud(){
   ModelAndView mv = new ModelAndView("cloud");
   mv.addObject("imageans", imageans);
   mv.addObject("username", username);
   return mv;
 }

  
}
