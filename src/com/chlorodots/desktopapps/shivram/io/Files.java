/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.chlorodots.desktopapps.shivram.io;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
 
/**
 *
 * @author kdere
 */
public class Files {
     public static void main(String[] args) {
       try {
 	File file = new File("setting.xml");
 	DocumentBuilder dBuilder = DocumentBuilderFactory.newInstance()
                             .newDocumentBuilder();
 	Document doc = dBuilder.parse(file);
 	System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
 	if (doc.hasChildNodes()) {
 	}
 
    } catch (Exception e) {
	System.out.println(e.getMessage());
    }
    }
     
     public void createFile(String filename){
           File file = new File(filename);
         try {
             if (file.createNewFile()){
               System.out.println("File is created!");
             }else{
               System.out.println("File already exists.");
             }
         } catch (IOException ex) {
             Logger.getLogger(Files.class.getName()).log(Level.SEVERE, null, ex);
         }
     }
     public static boolean isExists(String filename){
          File file = new File(filename);
         if (file.exists())
            return true;    
         else 
             return false;
        }
     
     public void createDirectory(String filename){
         File file = new File(filename);
         if (file.mkdir()) 
            System.out.println("Directory is created!");
         else 
            System.out.println("Failed to create directory!");    
     }
     
}
