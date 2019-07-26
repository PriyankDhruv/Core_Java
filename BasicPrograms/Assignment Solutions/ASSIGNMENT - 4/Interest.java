interface InputData{

      public  void I(int PA, int R, int N);                      // Declaring Method(I) Of Parent Class(InputData)
		

    }

class SimpleInterest implements InputData{

        double SI;

        public void I(int PA, int R, int N){             // Defination Of Method(I) In Derived Class(SimpleInterest)
		
		        SI = (PA * R * N)/100;  
			
		        System.out.println("SimpleInterest = " + SI); 	
		
		}
	
	}

class CompoundInterest implements InputData{              

        double I2,I3,I4,CI;

        public void I(int PA, int R, int N){             // Defination Of Method(I) In Derived Class(CompoundInterest)
			
				I2 = 1 + R;
				I3 = Math.pow(I2, N);
				I4 = I3 - 1;
				CI = PA * I4;
			
                System.out.println("CompoundInterest = " + CI);  
       		
		}
    
	}

class Interest{

    public static void main(String args[]){ 	
	
	    int PA = Integer.parseInt(args[0]);              // Gaining 3 Integer Arguments From User  
        int R = Integer.parseInt(args[1]);
        int N = Integer.parseInt(args[2]);

        SimpleInterest SXI = new SimpleInterest();       // Creating Object Of Class(SimpleInterest)
		CompoundInterest CXI = new CompoundInterest();   // Creating Object Of Class(CompoundInterest)
        
        SXI.I(PA, R, N);                                 // Calling Method(I) Of Class(SimpleInterest)
        CXI.I(PA, R, N);		                         // Calling Method(I) Of Class(CompoundInterest)
        
			
	}

}	

        		