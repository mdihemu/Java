/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contest2;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class XCubic {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        
        int number;
        
        number=obj.nextInt();
        
        number = number*number*number;
        
        System.out.println(+number);
    }
}
