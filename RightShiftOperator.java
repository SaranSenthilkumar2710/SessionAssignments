package session.assignments;

public class RightShiftOperator {
public static void main(String[] args) {
	
        byte num1 = -8;
        System.out.println("Given Number : "+num1);      
        
        //left shift operator
        System.out.println("num1<<2 :::" +(num1<<2)); 
        
        //right shift operator
        System.out.println("num1>>2 :::" +(num1>>2));   
        
        //unsigned right shift operator
        System.out.println("num1<<<2 :::" +(num1>>>2));    
    }

}
