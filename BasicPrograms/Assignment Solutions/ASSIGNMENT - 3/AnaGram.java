class AnaGram{

    public static void main(String args[]){
 
			int len,deadpoint;

			char[] x = args[0].toCharArray();                                        // Converting String into an Array Of Characters  
			char[] y = args[1].toCharArray();
			
            if(x.length == y.length){                                                // Comparing size of both Strings  
			
   				deadpoint=0;                                                         // Initialization of Number Of Search Elements found in both Strings
				
			    for(int i=0; i<x.length; i++){

                        for(int j=0; j<y.length; j++){

                                if(x[i] == y[j]){                                    // Characters found in both Strings are same 

                                        deadpoint = deadpoint + 1;

                                }

                        }

                }

                if(deadpoint == x.length){                                           // Total Number Of Searched Elements equals to size Of Any Given String 

                        System.out.println("Given Strings are Anagram !!");

                }

                else{

                        System.out.println("Given Strings are not Anagram !!");				
                
				}
				
            }
			
            else{
 
                System.out.println("Given Strings Should be of same size !!");

            }				
			
		}

    }		