/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rectangle_code1;



/**
 *
 * @author User
 */
public class RECTEANGLE_solving {
    
     private double width;
     private double height;
     
     public RECTEANGLE_solving(double width,double height){
         this.width = width;
         this.height = height;
     }
    
     public double  getArea(){
         return width*height;
     }
}
