class ValidGTuEnRoll{

        public static void main(String args[]){
            
            int len = args[0].length(); 			
			int EnrollYear = Integer.parseInt(args[0].substring(0,2));
			int CollegeCode = Integer.parseInt(args[0].substring(3,5));
			int StudentType = Integer.parseInt(args[0].substring(5,7));
			String DeptId = args[0].substring(7,9);
			int SerialNo = Integer.parseInt(args[0].substring(9,12));

			if(len != 12){
			        System.out.println("Invalid Enrollment Number !!");                     // Checking Number Of Digits in Enrollment Number
			        System.exit(0);
			}
			                                                                   

            if(EnrollYear < 10 && EnrollYear > 17){

					System.out.println("Invalid Enrollment Number !!");                     // Checking The Valid Year Of The Student 
                    System.exit(0);
			}

			
            if(CollegeCode != 47){

                    System.out.println("Invalid Enrollment Number !!");                     // Checking CollegeCode Of The Student  
                    System.exit(0);
            }					

        	
			if(StudentType != 01){                                                          // Student Should Be Either Regular Or D2D
			        System.out.println("Authenticating...please wait...");
                    System.out.println("\n\n\n");					
			}
			else if(StudentType != 03){
			        System.out.println("Authenticating...please wait...");
                    System.out.println("\n\n\n");					
			}
			else{
			        System.out.println("Invalid Enrollment Number !!");                     
                    System.exit(0);
            }					
             			
             
            if(DeptId.equals("07")){
			       	System.out.println("Still processing...");
					System.out.println("\n\n\n");
			}
            else{
                    System.out.println("Invalid Enrollment Number !!");
            }					
			
            
			if(SerialNo < 001 && SerialNo > 300){                                           // Verifying StudentId For The Given Range
			
			        System.out.println("Invalid Enrollment Number !!");

            }					
			           

            System.out.println("Valid Enrollment Number !!");

        }

    }		