abstract class Bike{                                                                               // Creating An Abstract Class Named Bike

        String Engine, Transmitter,BreakType;
        int Wheel, NoOfMirror;
		void Start(){                                                                              // Start Method Of Class Bike
		
		        System.out.println("Starting  a bike through various Methods : ");         
        }
		
    }
	
class Pulsar extends Bike{                                                                         // Creating SubClass Pulsar Of Bike       

        String EngineCapacity;
        String BodyType, Model;
        void Start(){                                                                              // Start Method Of SubClass Pulsar

                System.out.println("1.Kick Start");                                        
        }
		
    }
	
class Splender extends Bike{                                                                       // Creating SubClass Splender Of Bike

        String FuelTankCapacity, MaxTorque;
        int Mileage,NoOfCylinders;
        void Start(){                                                                              // Start Method Of SubClass Splender

                System.out.println("2.Auto Start");
       }
	   
    }

class RoyalEnfield extends Bike{                                                                   // Creating SubClass RoyalEnfield Of Bike

        String LoudSpeaker, SportySilencer;
		int NoOfGears, EngineDisplacement;
        void Start(){                                                                              // Start Method Of SubClass RoyalEnfield

                System.out.println("3.Biometric Start");
        }
		
    }		

class MethodOverriding{                                                                            // Creating Class For Children Overriding Its Parent  

        public static void main(String args[]){

                Pulsar Obj1 = new Pulsar();                                                        // Object Of SubClass Pulsar
		        Obj1.Start();                                                                      // Calling Start Method Of Pulsar

                Splender Obj2 = new Splender();                                                    // Object Of SubClass Splender
             	Obj2.Start();                                                                      // Calling Start Method Of Splender  

                RoyalEnfield Obj3 = new RoyalEnfield();                                            // Object Of SubClass RoyalEnField
                Obj3.Start();	                                                                   // Calling Start Method Of RoyalEnfield
				
	    }	 
	
    }	

         		 

                  	

	