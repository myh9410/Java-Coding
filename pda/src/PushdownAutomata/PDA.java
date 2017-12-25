//클래스 PushDownAutomata
package PushdownAutomata;
import java.util.Scanner;
public class PDA {
	public static void main(String[] args) {
		Stack stack = new Stack();//스택을 만들어줌.
		System.out.println("L = {(a^nb^n : n≥0) ∪ (a)}을 accept하는 Pushdown Automata를 만드시오.");
		System.out.println("Language를 입력해주세요.");
		Scanner sc = new Scanner(System.in);
		String pda = sc.nextLine();
		String temp = "";//abab와 같은 a^nb^n꼴이 아닌 경우를 확인하기 위한 변수
		String temp2 = "";//abab와 같은 a^nb^n꼴이 아닌 경우를 확인하기 위한 변수
		String ar = "";//accept 또는 reject를 설정해주기 위한 변수
		int count = 0;
		boolean result = false;//true와 false를 판별해주는 boolean 변수
			if (pda.startsWith("a")){//입력받은 Language가 a로 시작하는 경우만 생각
				if (pda.equals("a")) {//입력받은 Language가 a 하나만 있을 때
					result = true;
					ar = "accept";
					System.out.println(result+"	입력하신 Language : "+ pda +" 를"+ar+"합니다.");
				} else {//입력받은 Language가 a^nb^n 형태일 때
					//입력받은 Language를 for문을 사용해서 매index마다 하나씩 검사
					for (int i = 0; i < pda.length(); i++) {
						temp = pda.substring(i, i + 1);//temp에 각각 index에 해당하는 문자를 저장함.
						if(temp2.equals("b") && temp.equals("a")){//abab와 같은 경우를 입력했을 때	
							result = false;
							ar = "reject";
							System.out.println("a^nb^n꼴이 맞는지 확인해주세요.");
							break;
						}
						if (temp.equals("a")) {// index에 해당하는 문자가 a일 경우에는 스택에 push
							stack.push(1);
							count++;
						} else if (temp.equals("b")) {// index에 해당하는 문자가 b일 경우에는 스택에서 pop
							stack.pop();
							count--;
						}
						temp2 = temp;
						if (stack.isEmpty() && pda.length()%2 == 0 && count==0){	//스택이 비어있고 a,b가 짝이 맞을 때						
							result = true;
							ar = "accept";
						}else{// 그 외의 경우
							result = false;
							ar = "reject";
						}
					}
					System.out.println(result + "	입력하신 Language : "+pda+"를 "+ ar +" 합니다");
				}
			}else{//Language가 a로 시작하지 않는 경우 ex) 숫자 입력, b로 시작 등
				System.out.println("a^nb^n꼴이 맞는지 확인해주세요.");
			}
	}
}
