package lab_exercise_6_11;

import java.util.GregorianCalendar;

public class MyDate {
	private int year;
	private int month;
	private int day;
	
	MyDate(){
		this(System.currentTimeMillis());
	}
	
	MyDate(long elapsedTime){
		this.setDate(elapsedTime);
	}
	
	MyDate(int mo, int da, int yr){
		this.setMonth(mo);
		this.setDay(da);
		this.setYear(yr);
	}
	
	//Setters
	public void setYear(int newYear) {this.year=newYear;}
	public void setMonth(int newMonth) {this.month=newMonth;}
	public void setDay(int newDay) {this.day=newDay;}
	public void setDate(long elapsedTime) {
		GregorianCalendar gCal = new GregorianCalendar();
		gCal.setTimeInMillis(elapsedTime);
		this.setYear(gCal.get(GregorianCalendar.YEAR));
		this.setMonth(gCal.get(GregorianCalendar.MONTH)+1);
		this.setDay(gCal.get(GregorianCalendar.DAY_OF_MONTH));
	}
	
	//Getters
	public int getYear()	{return this.year;}
	public int getMonth()	{return this.month;}
	public int getDay()		{return this.day;}
	
	public String toString() {
		String m[] = {"January","February","March","April","May","June",
				"July","August","September","October","November","December"};
		return m[this.getMonth()-1]+" "+this.getDay()+", "+this.getYear();
	}
	
}
