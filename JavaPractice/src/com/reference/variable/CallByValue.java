package com.reference.variable;

public class CallByValue {
	int a = 10;
    void call(int sd) {
        a = sd+10;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CallByValue c = new CallByValue();
		System.out.println("Before call-by-value: " + c.a);
        
        /*
         * Passing an integer 50510 to the call() method. The value of 
         * 'a' will still be unchanged since the passing parameter is a 
         * primitive type. 
         */
        c.call(50510);
        System.out.println("After call-by-value: " + c.a);
		
	}

}
