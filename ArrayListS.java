import java.util.*;
public class ArrayListS{
    
        static class Stack {
            static ArrayList<Integer> list= new ArrayList<>();

            public static boolean isempty(){
                return list.size()==0;

            }
            
            // push 
            public static void push(int data){
                list.add(data);
            }
        //pop
        public static int pop(){
            int top= list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;

        }
        //pop
        public static int peek(){
            return list.get(list.size()-1);
        }
            
        }

        public static void main(String[] args) {
            Stack s = new Stack();
            s.push(1);
            s.push(2);
            s.push(3);

            while(!s.isempty()){
                System.out.println(s.peek());
                s.pop();
            }

        }

}