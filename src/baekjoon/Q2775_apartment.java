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
	     
	    int input = sc.nextInt();            // �׽�Ʈ ���̽��� ��
	    int result[] = new int[input];
	        
	    for(int i=0; i<input; i++){
	        int floor = sc.nextInt();        // �� ��
	        int room_num = sc.nextInt();    // �� ȣ��
	        int quan[] = new int[room_num];    // 1~nȣ���� ��� ��
	            
	        for(int j=0; j<room_num; j++){    // 1���� ȣ�� �� �ο� ��
	            quan[j] = j+1;
	        }
	            
	        while(floor != 0){                // �� ����ŭ �ݺ�
	            for(int j=1; j<room_num; j++){    // 1ȣ�� �׻� 1��
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