package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q2902_KMP_Algorithm {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split("-");
        StringBuffer sb = new StringBuffer();
        for(String st : s){
            sb.append(st.charAt(0));
        }
        System.out.println(sb);
    }
}



