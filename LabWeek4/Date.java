package LabWeek4;

public class Date{
	private int day;
	private int month;
	private int year;
	
	Date(){
		this.day = 01;
		this.month = 01;
		this.year = 2000;
	}
	
	Date (Date original){
		this.day = original.day;
		this.month = original.month;
		this.year = original.year;
	}

	Date(int day, int month, int year){
		this.day = day;
		this.month = month;
		this.year = year;
	}

	Boolean equals(Date original){
		if ((original.day == this.day) && (original.month == this.month) && (original.year == this.year)){ return true; } else { return false; }
	}
	
	public void showDate (){
		System.out.println("Day: " + day);
		System.out.println("Month: " + month);
		System.out.println("Year: " + year);
	}
	
	// Getters
	public int getDay(){
		return day;
	}
	public int getMonth(){
		return month;
	}
	public int getYear(){
		return year;
	}

	// Setters
	public void setDay(int day){
		this.day = day;
	}
	public void setMonth(int month){
		this.month = month;
	}
	public void setYear(int year){
		this.year = year;
	}

}