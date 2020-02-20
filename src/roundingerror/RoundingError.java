/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package roundingerror;

/**
 *
 * @author aamir7110
 */

import static java.lang.Math.sqrt;
import javax.swing.*;

public class RoundingError {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String finalOutput;
        String input;
        
        input = JOptionPane.showInputDialog("Enter Number to be Squared Squared");
        SquareOne(input);
        
    }
    
    public static double SquareOne(String input){
        
        double square;
        double squareRoot;
        double roundErr;
        
        squareRoot = Math.sqrt(Double.parseDouble(input));
        System.out.println("Square Root: "+squareRoot);
        
        square = squareRoot*squareRoot;
        System.out.println("Square of The Square Root: "+square);
        
        roundErr = square - Double.parseDouble(input);
        
        System.out.println("Round off error: "+roundErr);
        
        
        return squareRoot;
    }
}
