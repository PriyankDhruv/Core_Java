class ValidEmailId{

        public static void main(String args[]){

                int FirstCharUnicode = args[0].codePointAt(0);
                int len = args[0].length();
                String[] EmailComponent = args[0].split("@");
                String Ename = EmailComponent[1];
				char[] x = args[0].toCharArray();
				int Count = 1;
				int flag = 0;
				int a = args[0].indexOf('@');
				int b = args[0].indexOf('.');
  				
                if(FirstCharUnicode <= 97 && FirstCharUnicode >= 122){                       // First Letter Should Always Be Alphbetic Character 

                        System.out.println("Invalid Email Address..!!");
                        System.exit(0);
                } 	

				
                if(args[0].indexOf('@') < 0){                                                // Email Address Must Contain Atleast One '@' Symbol  

                        System.out.println("Invalid Email Address..!!");
                        System.exit(0);
                }						
				
				
				for(int i=0; i<len; i++){
				
		                if(args[0].charAt(i) != '_'){                                        // Necessary Symbols Must Be Present While Verifying EmailId

                                break;
                        }

                        else if(args[0].charAt(i) != '.'){

                                break;
                        }

                        else{

                            System.out.println("Invalid Email Address..!!");
                            System.exit(0);
                        }

                }						

				
				for(int j=0; j<Ename.length(); j++){                                       // Checking Valid Domain Name
				
				        if(args[0].charAt(j) != '.'){

                                flag++;
                        }
						
						else{
						
						        break;
						}		

                }

                if(flag < 2){

                            System.out.println("Invalid Email Address..!!");
                            System.exit(0);
                }							
				
				
			 	for(int k=a; k<b; k++){                                                // Minimum Distance Between '@' & '.' Symbols Should Be Of 3 Letters
				
				         Count++;
                }

                if(Count < 3){

                        System.out.println("Invalid Email Address..!!");
                        System.exit(0);
                }		
				
				
				System.out.println("Valid Email Address..!!");
				
			}

    } 			