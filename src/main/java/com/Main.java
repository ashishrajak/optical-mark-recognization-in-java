/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com;

import com.mcakir.scanner.Scanner;
import static com.mcakir.scanner.Util.getSource;
import static com.mcakir.scanner.Util.sout;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Base64;
import java.util.List;

import javax.imageio.ImageIO;

import org.apache.tomcat.util.http.fileupload.FileUtils;
import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.imgcodecs.Imgcodecs;
import org.springframework.stereotype.Service;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;

import javax.swing.*;
import java.awt.*;
/**
 *
 * @author Hp
 */
@Service
public class Main {
    
        public String imageString;
    public void imgstr(String sss) throws IOException{
      imageString=sss;
      
      byte[] imageBytes2 = Base64.getDecoder().decode(imageString);
      //Convert byte array to BufferedImage
      BufferedImage image22 = ImageIO.read(new ByteArrayInputStream(imageBytes2));
      int width = image22.getWidth();
      int height = image22.getHeight();
      Image image2 = image22.getScaledInstance(width, height, Image.SCALE_SMOOTH);
      BufferedImage bufferedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
      bufferedImage.createGraphics().drawImage(image2, 0, 0, null);
      String userDir = System.getProperty("user.dir");
      File outputFile = new File(userDir + "/sources/image2.jpg");
      ImageIO.write(bufferedImage, "jpg", outputFile);

               
      
        // Create a JLabel with the image as the icon
       
    }

    

    public   void fun() throws Exception {
                System.loadLibrary(Core.NATIVE_LIBRARY_NAME);

        sout("...started");
        String imsourse= getSource("image2.jpg");


     
      



        Mat source = Imgcodecs.imread(imsourse);
          sout("sheet1");

        Scanner scanner = new Scanner(source, 20);
         sout("solved");
        scanner.setLogging(true);
         sout("true");
        scanner.scan();

        sout("...finished");
        String userDir = System.getProperty("user.dir");
                  File outputFile = new File(userDir + "/sources/image2.jpg");
          if(outputFile.exists()) {
              outputFile.delete();
          }
    }
  
    public StringBuffer getans(){
      return Scanner.getAns();
    }
}
