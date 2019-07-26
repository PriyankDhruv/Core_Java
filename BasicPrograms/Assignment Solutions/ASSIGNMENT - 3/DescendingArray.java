class DescendingArray{

        public static void main(String args[]){

                int len = args.length;                                       // Taking size of Number of Arguments
				int a[] = new int[len];                                      // Taking Array of Size = (Length of Arguments)
				int tmp;                                                     // 3rd Varaible for Swapping Purpose


                for(int i=0; i<len; i++){
 
                        a[i] = Integer.parseInt(args[i]);                    // Conversion of (String Argument) into (Integer Argument)   

                } 			
                

                for(int i=0; i<len; i++){

                        for(int j=i+1; j<len; j++){

                                if(a[i] < a[j]){

                                    	tmp = a[i];
                                        a[i] = a[j];                         // Swapping Elements Of an Array 
                                        a[j] = tmp;

                                }

                        }

                }

                for(int i=0; i<len; i++){

                     	System.out.println(a[i]);                            // Print the ArrayElements in the Descending Order                           

                }

        }

    }		