package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

import javax.swing.JOptionPane;

public class Q10987_Num_of_vowel {
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		String stc = sc.nextLine();
		int count = 0;
		for (int i=0;i<stc.length();i++){
			String sstc = stc.substring(i, i+1);
			if (sstc.equals("a")||sstc.equals("e")||sstc.equals("i")||sstc.equals("o")||sstc.equals("u"))
				count++;
		}
		System.out.println(count);
	}
}
