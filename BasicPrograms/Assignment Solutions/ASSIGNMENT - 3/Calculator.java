class Calculator{
	
	public static void main(String args[]){
		
		int x = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[2]);
		int Resault = 0;
		char operator = args[1].charAt(0);
		
		switch(operator){
			
			case '+' : System.out.println("Addition of two Operands is performed as Follow :");
			           Resault = x + y;
					   System.out.println(x + " + " + y +" = " + Resault);
					   break;
					   
			case '-' : System.out.println("Subtraction of two Operands is performed as Follow :");
			            if(x > y){
						   
			                Resault = x - y;
							System.out.println(x + " - " + y + " = " + Resault);
						
					    }else{
							
							Resault = y - x;
							System.out.println(y + " - " + x + " = " + Resault);
							
						}
					   break;   	
					   
			case '*' : System.out.println("Multiplication of two Operands is performed as Follow :");
			           Resault = x * y;
					   System.out.println(y + " * " + x + " = " + Resault);
					   break;
					   
			case '/' :  if(y == 0){
							
							System.out.println("Error !!, Infinite Number is generated.");
							
						}else{	
			           
					        System.out.println("Division of two Operands is performed as Follow :");
					        Resault = x / y;
					        System.out.println(x + " / " + y + " = " + Resault);
							
						}	
					   break;		 

			case '%' : System.out.println("Remainder of " + x + "is calculated as Follow :");		   
			           Resault = x % y;
					   System.out.println(x + " % " + y + " = " + Resault);
					   break;
					   
			default  : System.out.println("Invalid Operator !! try it Again.");
			           break;
					   
		}		

	}

}	