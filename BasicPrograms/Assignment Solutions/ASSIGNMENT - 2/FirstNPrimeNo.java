class FirstNPrimeNo{

        public static void main(String args[]){

                int N = Integer.parseInt(args[0]);
				int Num = 0;
				
				String primeNumbers = " ";

                for(int i=0; i<=N; i++){

                        int counter = 0;

                        for(Num=i; Num>=1; Num--){	

                                if(i%Num == 0){

                                    counter = counter + 1;  								
									
								}

						}

						if(counter == 2){
						
						    primeNumbers = primeNumbers + i + " ";        // Appending PrimeNumbers At The End Of The String

                        }							
						
				}	
				
				System.out.println("Prime Numbers Upto N are as Follow : ");
				System.out.println(primeNumbers);
				
			}

    }			