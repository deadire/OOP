class PC{
	private int pcID;
	private String pcVersion;
	private int ramSize;
	private int diskSize;
	private PC pc[];

    	public PC(int pcId, String pcVersion, int ramSize, int diskSize) {
        	this.pcID = pcId;
        	this.pcVersion = pcVersion;
        	this.ramSize = ramSize;
        	this.diskSize = diskSize;
    	}

	public void displayDetails(){
		System.out.println("ID: " + pcID);
		System.out.println("Version: " + pcVersion);
		System.out.println("Ram Size: " + ramSize);
		System.out.println("Disk Size: " + diskSize);
	}
} 