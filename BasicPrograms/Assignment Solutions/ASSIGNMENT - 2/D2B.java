class D2B{

        public static void main(String args[]){

                int Num = Integer.parseInt(args[0]);
                double binary = ConvertDecimelToBinary(Num);
                System.out.println(binary);

        }

        public static double ConvertDecimelToBinary(int N){
		
		        long binaryNumber =0;
                int remainder;
                int i = 1;
				
				while(N != 0){
				
				        remainder = N % 2;
						N = N / 2;
						binaryNumber = binaryNumber + remainder * i;
						i = i * 10;
						
					}

				return binaryNumber;

        }

    }		
                				
		
	
                             				