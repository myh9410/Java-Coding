package hepc;

import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;

public class b_lock {
    public static void main(String []args){
        
        int hit = 1;
        
        while (true) {
        	int health = 4;
        	int max = health;
        	int min = health;
            while (health>=0){
                health -= hit;
                max = health - hit;
                min = health - 2*hit;
            }
            if (min<=health && health<=max) {
                hit += 1;
            }else {
                System.out.println("hit : "+hit);
                break;
            }
        } 
        
     }
}

