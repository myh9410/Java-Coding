package calculator;
import javax.swing.*;

public class calculator {
   public static void main(String[] args) {
      Stack st1 = new Stack();
      Stack st2 = new Stack();
      String first;
      String second;
      double a,b,res;
      String tmp;
      
      String p="{x}";
      String oper="{0}";
      
      
      
      while(!oper.equals("=")){
         p="{t}";
         oper="{1}";
         while(!Character.isDigit(p.charAt(0))){
            p=JOptionPane.showInputDialog("���� �Է��ϼ���");
            st1.push(p);
            if(Character.isDigit(p.charAt(0))){
            System.out.print(p);
            }
         }
         while(!oper.equals("+") && !oper.equals("-")  && !oper.equals("=")  && !oper.equals("/") && !oper.equals("*") ){
            oper=JOptionPane.showInputDialog("�����ڸ� �Է��ϼ���");
            if(oper.equals("+") || oper.equals("-")  || oper.equals("=")  || oper.equals("/") || oper.equals("*") )
            System.out.print(oper);
            st2.push(oper);
         }
         
         if(st2.size()>=2){
            while(st2.size()!=1){
               first=st2.top1();
               second=st2.top2();
               a=Double.valueOf(st1.pop());
               b=Double.valueOf(st1.pop());
               if((first.equals("-") || first.equals("+")|| first.equals("=")) && (second.equals("*")||second.equals("/"))){
                  if(second.equals("*")){
                     res=b*a;
                     tmp=String.valueOf(res);
                     st1.push(tmp);
                     st2.pop();
                     st2.pop();
                     st2.push(first);
                  
                  }
                  else if(second.equals("/")){
                     res=b/a;
                     tmp=String.valueOf(res);
                     st1.push(tmp);
                     st2.pop();
                     st2.pop();
                     st2.push(first);
                  }
                  
               }
               else if((first.equals("-") || first.equals("+")||first.equals("=")) && (second.equals("+")||second.equals("-"))){
                  if(second.equals("-")){
                     res=b-a;
                     tmp=String.valueOf(res);
                     st1.push(tmp);
                     st2.pop();
                     st2.pop();
                     st2.push(first);
                  
                  }
                  else if(second.equals("+")){
                     res=b+a;
                     tmp=String.valueOf(res);
                     st1.push(tmp);
                     st2.pop();
                     st2.pop();
                     st2.push(first);
                  }
                  
                  
                  
                  
               }
               else if((first.equals("*") || first.equals("/")||first.equals("=")) && (second.equals("*")||second.equals("/"))){
                  if(second.equals("*")){
                     res=b*a;
                     tmp=String.valueOf(res);
                     st1.push(tmp);
                     st2.pop();
                     st2.pop();
                     st2.push(first);
                  
                  }
                  else if(second.equals("/")){
                     res=b/a;
                     tmp=String.valueOf(res);
                     st1.push(tmp);
                     st2.pop();
                     st2.pop();
                     st2.push(first);
                  }
                  
                  
                  
                  
               }
               else{
                  
                  st1.push(String.valueOf(b));
                  st1.push(String.valueOf(a));
                  break;
               }
            }
         }
      }      
   System.out.println(st1.pop());
   }
}
   
