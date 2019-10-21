/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.icc.week1assignment;
import edu.icc.week1assignment.CountryType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author SucramMedia
 */
public class CountryTypeImpl {
    
    
    public static void main(String args[]){
        CountryType obj[] = new CountryType[9];
       
        
        obj[0] = new CountryType();
        obj[0].setCapital("Buenos Aires");
        obj[0].setContinent("South America");
        obj[0].setCountry("Argentina");
        obj[0].setLanguage("Spanish");
        obj[0].setPopulation(2.89);
        
        
        obj[1] = new CountryType();
        obj[1].setCapital("Sucre La Paz");
        obj[1].setContinent("South America");
        obj[1].setCountry("Bolivia");
        obj[1].setLanguage("Spanish");
        obj[1].setPopulation(0.789);
        
        obj[2] = new CountryType();
        obj[2].setCapital("Brasilia");
        obj[2].setContinent("South America");
        obj[2].setCountry("Brazil");
        obj[2].setLanguage("Portuguese");
        obj[2].setPopulation(2.4);
        
       
        obj[3] = new CountryType();
        obj[3].setCapital("Santiago");
        obj[3].setContinent("South America");
        obj[3].setCountry("Chile");
        obj[3].setLanguage("Spanish");
        obj[3].setPopulation(5.6);
        
        obj[4] = new CountryType();
        obj[4].setCapital("Bogota");
        obj[4].setContinent("South America");
        obj[4].setCountry("Colombia");
        obj[4].setLanguage("Spanish");
        obj[4].setPopulation(7.2);
        
        obj[5] = new CountryType();
        obj[5].setCapital("Quito");
        obj[5].setContinent("South America");
        obj[5].setCountry("Ecuador");
        obj[5].setLanguage("Spanish");
        obj[5].setPopulation(1.6);
        
        obj[6] = new CountryType();
        obj[6].setCapital("Georgetown");
        obj[6].setContinent("South America");
        obj[6].setCountry("Guyana");
        obj[6].setLanguage("English");
        obj[6].setPopulation(0.8);
        
        obj[7] = new CountryType();
        obj[7].setCapital("Asunción");
        obj[7].setContinent("South America");
        obj[7].setCountry("Paraguay");
        obj[7].setLanguage("Spanish");
        obj[7].setPopulation(6.8);
        
        obj[8] = new CountryType();
        obj[8].setCapital("Lima");
        obj[8].setContinent("South America");
        obj[8].setCountry("Peru");
        obj[8].setLanguage("Dutch");
        obj[8].setPopulation(32.5);
        

     
     double tempArray[] = {obj[0].getPopulation(), obj[1].getPopulation(), obj[2].getPopulation(), obj[3].getPopulation(), obj[4].getPopulation()};
     int total = 5;
     double smallArray = getSmallest(tempArray, total);
     double largeArray = getLargest(tempArray, total);
     double temp;
     double largeTemp;
     
     
     for(int i=0; i< obj.length; i++){
         
         temp = smallArray;
         largeTemp = largeArray;
          
           if(temp == obj[i].getPopulation()){
             System.out.print("The Smallest Population is the country of  " + obj[i].getCountry()+ ", Continent of " 
                     + obj[i].getContinent() + ", Population of " + obj[i].getPopulation() + ", Language of " 
                             + obj[i].getLanguage() + "\n");
         
            }
           
           if(largeTemp == obj[i].getPopulation()){
                System.out.print("The Largest Population is the country of  " + obj[i].getCountry()+ ", Continent of " 
                     + obj[i].getContinent() + ", Population of " + obj[i].getPopulation() + ", Language of " 
                             + obj[i].getLanguage() + "\n");
         
           }
                   
                   
                   //System.out.println(obj[i].getCapital() +"\n");
             
               
               
           }
     
     
          
        
        }
    

    

    public static double getSmallest(double a[], int total){  
        double temp;  
            for (int i = 0; i < total; i++)   
            {  
                for (int j = i + 1; j < total; j++)   
                {  
                    if (a[i] > a[j])   
                    {  
                        temp = a[i];  
                        a[i] = a[j];  
                        a[j] = temp;  
                    }  
                }  
            }  
    return a[0];  
    }
    
    public static double getLargest(double a[], int total){  
        double temp;  
            for (int i = 0; i < total; i++)   
            {  
                for (int j = i + 1; j < total; j++)   
                {  
                    if (a[i] < a[j])   
                    {  
                        temp = a[i];  
                        a[i] = a[j];  
                        a[j] = temp;  
                    }  
                }  
            }  
    return a[0];  
    }  
}
