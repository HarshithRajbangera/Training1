package placement;

import java.util.LinkedList;

class Compartment{
	int number;
	int seats;
	boolean isAC;
	Compartment(int number,int seats,boolean isAC){
		this.number=number;
		this.seats=seats;
		this.isAC=isAC;
	}
	 @Override
	    public String toString() {
	        return "Compartment " + number + ": " + seats + " seats, " + (isAC ? "AC" : "Non-AC");
	    }
}
class Train{
	
	LinkedList<Compartment> compartment=new LinkedList<>();
	
	void addCompartment(int number,int seats,boolean isAC) {
		Compartment newCompartment=new Compartment(number,seats,isAC);
		
		
		int i=0;
		while(i<compartment.size() && compartment.get(i).number < number) {
			i++;
			
		}
		compartment.add(i,newCompartment);
	}
	 void removeCompartment(int number) {
	        compartment.removeIf(compart -> compart.number == number);
	    }
	 
	 Compartment getCompartmentDetails(int number) {
	        for (Compartment c : compartment) {
	            if (c.number == number) {
	                return c;
	            }
	        }
	        return null;
	    }
	 
	 void displayTrain() {
	        if (compartment.isEmpty()) {
	            System.out.println("No compartments in the train.");
	        } else {
	            for (Compartment c : compartment) {
	                System.out.println(c);
	            }
	        }
	    }
}
public class TrainCompartment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Train train = new Train();
		
		train.addCompartment(3, 50, true);
        train.addCompartment(1, 30, false);
        train.addCompartment(2, 40, true);
        train.displayTrain();
        System.out.println(train.getCompartmentDetails(2));
        train.removeCompartment(1);
        train.displayTrain();
	}

}
