//클래스 스택
package PushdownAutomata;
public class Stack {
    private Node head;
    private int size = 0;
    private class Node{
        // 데이터가 저장될 필드 노드의 object가 저장되는 것
        private Object data;
        // 다음 노드를 가리키는 필드 노드의 다음 노드를 가리키는 것(pointer)
        private Node next;
        public Node(Object input) {
            this.data = input;
            this.next = null;
        }
    }
    public void push(Object input){
        // 노드를 생성.
        Node newNode = new Node(input);
        // 새로운 노드의 다음 노드로 해드를 지정.
        newNode.next = head;
        // 헤드로 새로운 노드를 지정.
        head = newNode;
        StackContents();
        size++;
    }
    public void StackContents() {//스택의 내용을 보여줌.
        if(head == null){
        	System.out.println("스택 : ()");
        }else{
        Node temp = head;
        String str = "(";
        while(temp.next != null){
            str += temp.data + ", ";
            temp = temp.next;
        }
        str += temp.data;
        System.out.println("스택 : "+str+")");
        }
    }
    public Object pop(){
    	if (size==0){
    		System.out.println("더 이상 pop할 수 없습니다.");
    		return null;
    	}else{
        Node temp = head;
        head = temp.next;
        // 데이터를 삭제하기 전에 리턴할 값을 임시 변수에 담음. 
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
    public boolean isEmpty() {//스택이 비었는지 아닌지 판별해주는 메서드
    	if (checksize()==0)
		return true;
        else
        return false;
    }
}