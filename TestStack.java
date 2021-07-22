package Stack;

import java.util.Stack;

public class TestStack {
     public static void main(String []args) {
    	Stack<String>names=new Stack<>();
    	System.out.println(names.push("Andre"));
    	System.out.println(names.push("Grace"));
    	System.out.println(names.push("Jimmy"));
    	System.out.println(names.push("Sammy"));
    	System.out.println(names.push("Gogo"));
    	System.out.println(names.push("Soso"));
    	System.out.println("________________________");
    	System.out.println(names.pop());
    	System.out.println(names.pop());
    	System.out.println(names.pop());
    	System.out.println(names.pop());
    	System.out.println(names.pop());
    	System.out.println(names.pop());
    	
    	
     }
}