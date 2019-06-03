/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Kira
 */
public class LAB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Integer[] n= {10,25,100,78,2,36,1};
      ArrayList<Integer> al = new ArrayList<Integer>();
      al.addAll(Arrays.asList(n));
      al.add(al.size()/2,100);
      al.remove((Integer)25);
      al.set(al.indexOf(78), 40);
      al.addAll(al.size()/4,al.subList(al.size()/2,al.size()));
      System.out.printf(al+",");
      
    
    }
    
}
