interface P{

        int pVar = 5;
        void methodP();                                 // Declaring Method Of P

    }		
	
interface P1 extends P{

        int p1Var = 10;
        void methodP1();                                // Declaring Method Of P1
		
	}	

interface P2 extends P{
 
        int p2Var = 15;
        void methodP2();                                // Declaring Method Of P2

    }

interface P12 extends P1,P2{

        int p12Var = 20;
        void methodP12();                               // Declaring Method Of P12

    }

class Invoke implements P12{

        public void methodP(){                          // Defination Of Method P

                System.out.println(P.pVar);            
        }

        public void methodP1(){                         // Defination Of Method P1

                System.out.println(P1.p1Var);
        }

        public void methodP2(){                         // Defination Of Method P2 

                System.out.println(P2.p2Var);
        }

        public void methodP12(){                        // Defination Of Method P12
 
                System.out.println(P12.p12Var);

        }

   
	public static void main(String args[]){

        int qVar = 30;
		
		Invoke Obj = new Invoke();                      // Creating Object Of Class Invoke
		Obj.methodP();                                  // Calling Method P
	    Obj.methodP1();                                 // Calling Method P1
		Obj.methodP2();                                 // Calling Method P2
		Obj.methodP12();                                // Calling Method P12
        System.out.println(qVar);

	}	
	
}	