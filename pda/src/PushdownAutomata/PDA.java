//Ŭ���� PushDownAutomata
package PushdownAutomata;
import java.util.Scanner;
public class PDA {
	public static void main(String[] args) {
		Stack stack = new Stack();//������ �������.
		System.out.println("L = {(a^nb^n : n��0) �� (a)}�� accept�ϴ� Pushdown Automata�� ����ÿ�.");
		System.out.println("Language�� �Է����ּ���.");
		Scanner sc = new Scanner(System.in);
		String pda = sc.nextLine();
		String temp = "";//abab�� ���� a^nb^n���� �ƴ� ��츦 Ȯ���ϱ� ���� ����
		String temp2 = "";//abab�� ���� a^nb^n���� �ƴ� ��츦 Ȯ���ϱ� ���� ����
		String ar = "";//accept �Ǵ� reject�� �������ֱ� ���� ����
		int count = 0;
		boolean result = false;//true�� false�� �Ǻ����ִ� boolean ����
			if (pda.startsWith("a")){//�Է¹��� Language�� a�� �����ϴ� ��츸 ����
				if (pda.equals("a")) {//�Է¹��� Language�� a �ϳ��� ���� ��
					result = true;
					ar = "accept";
					System.out.println(result+"	�Է��Ͻ� Language : "+ pda +" ��"+ar+"�մϴ�.");
				} else {//�Է¹��� Language�� a^nb^n ������ ��
					//�Է¹��� Language�� for���� ����ؼ� ��index���� �ϳ��� �˻�
					for (int i = 0; i < pda.length(); i++) {
						temp = pda.substring(i, i + 1);//temp�� ���� index�� �ش��ϴ� ���ڸ� ������.
						if(temp2.equals("b") && temp.equals("a")){//abab�� ���� ��츦 �Է����� ��	
							result = false;
							ar = "reject";
							System.out.println("a^nb^n���� �´��� Ȯ�����ּ���.");
							break;
						}
						if (temp.equals("a")) {// index�� �ش��ϴ� ���ڰ� a�� ��쿡�� ���ÿ� push
							stack.push(1);
							count++;
						} else if (temp.equals("b")) {// index�� �ش��ϴ� ���ڰ� b�� ��쿡�� ���ÿ��� pop
							stack.pop();
							count--;
						}
						temp2 = temp;
						if (stack.isEmpty() && pda.length()%2 == 0 && count==0){	//������ ����ְ� a,b�� ¦�� ���� ��						
							result = true;
							ar = "accept";
						}else{// �� ���� ���
							result = false;
							ar = "reject";
						}
					}
					System.out.println(result + "	�Է��Ͻ� Language : "+pda+"�� "+ ar +" �մϴ�");
				}
			}else{//Language�� a�� �������� �ʴ� ��� ex) ���� �Է�, b�� ���� ��
				System.out.println("a^nb^n���� �´��� Ȯ�����ּ���.");
			}
	}
}
