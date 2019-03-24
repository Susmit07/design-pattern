package com.sapient.abst.factory;



public class FactoryDemo {
	
	public static void main(String[] args) {
		Computer pc = ComputerFactory.getComputer(new PCFactory("500", "1", "intel"));
		Computer laptop = ComputerFactory.getComputer(new LaptopFactory("600", "2", "celleron"));
		System.out.println(pc);
		System.out.println(laptop);
	    
	    System.out.println(matchBrackets("())("));
	    System.out.println(matchBrackets("(((())))"));
	    System.out.println(matchBrackets("))))"));
	    
	}
	
	public static int matchBrackets(String brackets){

	      int open = 0;
	      int count =0;

	     for(int i=0;i<brackets.length();i++){
	        if(brackets.charAt(i)=='('){
	        open++;
	        }else if(brackets.charAt(i)==')'){
	         open--;
	        }
	        if(open<0){
	        count++;
	        open++;
	     }
	  }
	  return count+open;
	}
}
