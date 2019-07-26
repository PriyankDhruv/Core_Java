class PrimeNo{

      public static void main(String args[]){

            int x = Integer.parseInt(args[0]);
            boolean flag = false;

            for(int i=2; i<x/2; i++){
           
           		    if(x%i == 0){  			     // Condition for Non-Prime Number

                    flag = true;
                    break;

                    }

            }

            if(!flag){

                System.out.println(x + " is a prime number !!");

            }

            else{
			
			    System.out.println(x + " is not a prime number !!");
				
			}

        }

    }		
 			