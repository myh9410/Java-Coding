package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

import javax.swing.JOptionPane;

public class Q2775_apartment {
	public static void main (String args[]) {
	    Scanner sc = new Scanner(System.in);
	     
	    int input = sc.nextInt();            // 테스트 케이스의 수
	    int result[] = new int[input];
	        
	    for(int i=0; i<input; i++){
	        int floor = sc.nextInt();        // 층 수
	        int room_num = sc.nextInt();    // 방 호수
	        int quan[] = new int[room_num];    // 1~n호수의 사람 수
	            
	        for(int j=0; j<room_num; j++){    // 1층의 호수 별 인원 수
	            quan[j] = j+1;
	        }
	            
	        while(floor != 0){                // 층 수만큼 반복
	            for(int j=1; j<room_num; j++){    // 1호는 항상 1명
	                quan[j] = quan[j] + quan[j-1];
	            }
	                
	            floor--;
	        }
	            
	        result[i] = quan[room_num-1];
	    }
	        
	    for(int i=0; i<input; i++)
	        System.out.println(result[i]);
	}
}