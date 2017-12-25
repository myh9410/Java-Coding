//Ŭ���� ����
package PushdownAutomata;
public class Stack {
    private Node head;
    private int size = 0;
    private class Node{
        // �����Ͱ� ����� �ʵ� ����� object�� ����Ǵ� ��
        private Object data;
        // ���� ��带 ����Ű�� �ʵ� ����� ���� ��带 ����Ű�� ��(pointer)
        private Node next;
        public Node(Object input) {
            this.data = input;
            this.next = null;
        }
    }
    public void push(Object input){
        // ��带 ����.
        Node newNode = new Node(input);
        // ���ο� ����� ���� ���� �ص带 ����.
        newNode.next = head;
        // ���� ���ο� ��带 ����.
        head = newNode;
        StackContents();
        size++;
    }
    public void StackContents() {//������ ������ ������.
        if(head == null){
        	System.out.println("���� : ()");
        }else{
        Node temp = head;
        String str = "(";
        while(temp.next != null){
            str += temp.data + ", ";
            temp = temp.next;
        }
        str += temp.data;
        System.out.println("���� : "+str+")");
        }
    }
    public Object pop(){
    	if (size==0){
    		System.out.println("�� �̻� pop�� �� �����ϴ�.");
    		return null;
    	}else{
        Node temp = head;
        head = temp.next;
        // �����͸� �����ϱ� ���� ������ ���� �ӽ� ������ ����. 
        Object returnData = temp.data;
        temp = null;
        size--;
        StackContents();
        return returnData;
    	}
    }
    public int checksize(){
        return size;
    }
    public boolean isEmpty() {//������ ������� �ƴ��� �Ǻ����ִ� �޼���
    	if (checksize()==0)
		return true;
        else
        return false;
    }
}