package calculator;

public class Stack {
   String x;
   private int count =0;
   private Node top;
   private class Node{
      private String data;
      private Node nextNode;
      Node (String data){
         
         this.data = data;
      }
   }
   

   void push(String data){
      Node new_node = new Node(data);
      if (count ==0){
         top = new_node;
      }else{
         new_node.nextNode = top;
         top = new_node;
      }
      count++;
   }
   String top1(){
      if (top == null){
         
         return null;
      }else {
         
         x=top.data;
         
         return x;
      }
      
   }
   String top2(){
         
      if (top.nextNode == null){
         
         return null;
      }else {
         
         x=top.nextNode.data;
         
         return x;
      }
      
      
      
   }
   String pop(){
      if (top == null){
         
         return null;
      }else {
         
         x=top.data;
         Node tmp = top;
         top = tmp.nextNode;
         tmp = null;
         count--;
         return x;
      }
   }

   int size(){
      
      return count;
   }
   void isEmpty(){
      if (top==null){
          System.out.println(true);
      }else {
         System.out.println(false);
      }
   }
   void printStack(){
      Node node = top;
      System.out.print('(');
      for (int i=0;i<count;i++){
         if(i==(count-1)){
            System.out.print(node.data+")");
         }
         else{
            System.out.print(node.data+", ");
         }
         node = node.nextNode;
      }
      System.out.println();
   }
}
   
