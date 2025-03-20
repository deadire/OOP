class Screen{
	private int screenNumber;
	private String movieTitle;
	private Seat seats[][];
	
	public Screen(int screenNumber, String movieTitle, int rows, int cols) {
    		this.screenNumber = screenNumber;
    		this.movieTitle = movieTitle;
    		this.seats = new Seat[rows][cols];

    	for (int i = 0; i < rows; i++) {
        	for (int j = 0; j < cols; j++) {
            	seats[i][j] = new Seat((i * cols) + j + 1, i, SeatType.REGULAR, 10.0);
        		}
    		}
	}

	
    	public boolean bookSeat(int row, int col, Customer customer) {
        	if (row >= 0 && row < seats.length && col >= 0 && col < seats[0].length) {
            	return seats[row][col].bookSeat();
        	}
        	return false;
    	}
	
	public void displayScreen() {
        	System.out.println("Screen " + screenNumber + " - Movie: " + movieTitle);
    	}

} 