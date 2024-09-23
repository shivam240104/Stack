import java.util.*;
public class Question {

    public static void pushAtBottom(Stack<Integer>s,int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top= s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }
    // Question-2 Reverse a string 
    public static String reverseString(String str){
        Stack<Character>s= new Stack<>();
        int idx=0;
        while(idx<str.length()){
            s.push(str.charAt(idx));
            idx++;
        }
        StringBuilder result = new StringBuilder();
        while(!s.isEmpty()){
            char curr = s.pop();
            result.append(curr);
        }
        return result.toString();
    }

    // Question 3 reverse of a Stack
    public static void reverseStack(Stack<Integer>s){
        if(s.isEmpty()){
            return;
        }
        int top = s.pop();
        reverseStack(s);
        pushAtBottom(s, top);
    }
    public static void printStack(Stack<Integer>s){
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
       reverseStack(s);
       printStack(s);
        // pushAtBottom(s,5);
        // while(!s.isEmpty()){
        //     System.out.println(s.pop());
        // }
        // String str="Shivam";
        // System.out.println(reverseString(str));
    }
}
