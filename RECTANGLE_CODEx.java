/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rectangle_code1;
import javax.swing.JOptionPane;
//import java.util.Scanner;

/**
 *
 * @author User
 */
public class RECTANGLE_CODEx {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String inputWidth = JOptionPane.showInputDialog(null, "enter Width plss: ");
        double width = Double.parseDouble(inputWidth);
        
        String inputHeight = JOptionPane.showInputDialog(null, "enter Height plss: ");
        double height = Double.parseDouble(inputHeight);
        
        RECTEANGLE_solving wrecktangle = new RECTEANGLE_solving(width,height);
        double area = wrecktangle.getArea();
        
        JOptionPane.showMessageDialog(null,"AREA of RECTANGLE: " + area);
        
        JOptionPane.showMessageDialog(null,"Thanks!!");
        
        
    }
}
