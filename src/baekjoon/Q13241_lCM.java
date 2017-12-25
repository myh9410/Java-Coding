package baekjoon;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Q13241_lCM {

	public static void main(String[] args) {
		long temp1;
		long temp2;
		long a=1;
		long result;
		Scanner sc = new Scanner(System.in);
		temp1 = sc.nextInt();
		temp2 = sc.nextInt();
		long val1 = temp1;
		long val2 = temp2;
		if(temp1<temp2){
			val1 = temp2;
			val2 = temp1;
		}
		while (a>0){
			a = temp1%temp2;
			temp1 = temp2;
			temp2 = a;
		}
		result = val1*val2/temp1;
		//System.out.println(temp1);//최대공약수
		System.out.println(result);//최소공배수
	}
//public static int gcd(int val1, int val2){
//	int mod = val1%val2;
//	val1 = val2;
//	val2 = mod;
//	mod = val1%val2;
//	return val2;
//}
}
