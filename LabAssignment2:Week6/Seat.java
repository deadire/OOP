class Seat{
	private int seatNumber;
	private int rowNumber;
	private SeatType type;
	private double price;
	private boolean isBooked;

	Seat(int sn, int rn, SeatType st, double p){
		this.seatNumber = sn;
		this.rowNumber = rn;
		this.type = st;
		this.price = p;
		this.isBooked = false;
	}
	
    	public boolean bookSeat() {
        	if (!isBooked) {
           	isBooked = true;
            	return true;
        	}
        	return false;
    	}
	
	public void Display(){
		System.out.println("Seat Number: " + seatNumber);
		System.out.println("Row Number: " + rowNumber);
		System.out.println("Seat Type: " + type);
		System.out.println("Seat Price: " + type);
		if (isBooked) {
			System.out.println("Seat is Booked");
		} else {
			System.out.println("Seat is NOT Booked");
		}	
	}		
}