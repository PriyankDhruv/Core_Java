class MatrixMultiplication{

        public static void main(String args[]){
		
                int Matrix1[][] = new int[3][3];
				int Matrix2[][] = new int[3][3];
				int Matrix3[][] = new int[3][3];
                int i,j,x,k=0;
				int count = 0;
                int Entry1[] = { 2, 4, 8, 9, 5, 7, 8, 0, 1 };    
                int Entry2[] = { 5, 8, 9, 4, 1, 0, 5, 2, 6 };				
                int Entry3[] = { 0, 0, 0, 0, 0, 0, 0, 0, 0 };
				
				System.out.println("Matrix-1 is Displayed as Follow : ");                              // Displaying Each Entry Of Matrix-1
				for(i=0; i<1; i++){

				                for(k=0; k<=6; k=k+3){
                                   
								        for(j=0; j<3; j++){

                                            Matrix1[i][j] = Entry1[j + k]; 
                                            System.out.println(Matrix1[i][j]);
                                         										
                                        }
        
		                            System.out.println();
		                        } 
                
				}
				
				
				System.out.println("Matrix-2 is Displayed as Follow : ");                              // Displaying Each Entry Of Matrix-2
				for(i=0; i<1; i++){
				
				                for(k=0; k<=6; k=k+3){

                                        for(j=0; j<3; j++){

                                            Matrix2[i][j] = Entry2[j + k];
                                            System.out.println(Matrix2[i][j]);

                                        }

                                    System.out.println();
                                }

                }								
				
				// System.out.println("Matrix-3 is Displayed as Follow : ");                           // Set All The Entries Of Matrix-3 To Zero
				for(i=0; i<1; i++){
				
				                for(k=0; k<=6; k=k+3){

                                      	for(j=0; j<3; j++){

                                            Matrix3[i][j] = Entry3[j + k];
                                            
                                        }

                                    System.out.println();
                                }

                }								
						
				
				System.out.println("Multiplication Matrix is Displayed as Follow : ");                 // Performing Matrix Multiplication Of Both Matrices  
                for(i=0; i<1; i++){
 
						for(x=0; x<=6; x=x+3){
							
                                for(k=0; k<=6; k=k+3){

                                        int Sum=0;
										
                                        for(j=0; j<3; j++){

										    Sum = Sum + Entry1[x + j]*Entry2[j + k];
													
										}
										
                                    Matrix3[i][x/3] = Sum;
							        System.out.println(Matrix3[i][x/3]);
									
								}
								
                            System.out.println();
						}
							
				}			
							
							
    	}

    }		
	
					
                  		