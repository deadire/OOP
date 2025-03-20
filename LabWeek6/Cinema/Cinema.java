class Cinema {
    	private String name;
    	private String location;
    	private Screen[] screens;
    
    	public Cinema(String name, String location, int total) {
        	this.name = name;
        	this.location = location;
        	this.screens = new Screen[total];
    	}
    
    	public void addScreen(int index, Screen screen) {
        	if (index >= 0 && index < screens.length) {
            	screens[index] = screen;
        	}
    	}
    
    	public void displayCinema() {
        	System.out.println("Cinema: " + name + " at " + location);
        	for (Screen screen : screens) {
            	if (screen != null) {screen.displayScreen();}
        	}
    	}
}