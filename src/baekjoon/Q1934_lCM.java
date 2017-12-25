package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

import javax.swing.JOptionPane;

public class Q1934_lCM {

	public static void main(String[] args) throws Exception{
		int temp1;
		int temp2;
		BufferedReader sc1 = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(sc1.readLine());
		int[] result = new int[t];
		StringTokenizer s = null;
		for (int i = 0; i < t; i++) {
			s = new StringTokenizer(sc1.readLine());
			temp1 = Integer.parseInt(s.nextToken());
			temp2 = Integer.parseInt(s.nextToken());
			int mult12 = temp1*temp2;
			while (true) {
				if (temp2 == 0){					
					result[i] = mult12 / temp1;
					break;
				}
				int tmp = temp2;
				temp2 = temp1 % temp2;
				temp1 = tmp;
			}
		}
		sc1.close();
		StringBuilder sb = new StringBuilder();
		for (int res : result) {
			sb.append(res).append("\n");
		}
		System.out.println(sb.toString());// 최소공배수
	}
}
