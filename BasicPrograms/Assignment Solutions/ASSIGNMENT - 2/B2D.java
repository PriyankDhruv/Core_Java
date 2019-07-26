class B2D{

        public static void main(String args[]){

            long N = Long.parseLong(args[0]);
            double decimel = ConvertBinaryToDecimel(N);
            System.out.println(decimel);	

        }

        public static double ConvertBinaryToDecimel(long N){

            double decimelNumber = 0;
            int i = 0;
			long remainder;

            while(N != 0){

                remainder = N % 10;
                N = N/10;
                decimelNumber = decimelNumber + remainder * Math.pow(2, i); 
                i++;

            }

            return decimelNumber;

        }

    }		
			