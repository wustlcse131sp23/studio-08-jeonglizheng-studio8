package studio8;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Objects;

public class Date {
	private int month;
	private int day;
	private int year;
	private boolean isHoliday;
	
	/**
	 * @param month
	 * @param day
	 * @param year
	 * @param isHoliday
	 */
	public Date(int month, int day, int year, boolean isHoliday) {
		super();
		if (month > 0 && month <= 12) {
			this.month = month;
		}
		else {
			System.out.println("month shoulbe be between 1 and 12 (inclusively)");
		}
		if (day > 0 && day <= 31) {
			this.day = day;
		}
		else {
			System.out.println("day shoulbe be between 1 and 31 (inclusively)");
		}
		this.year = year;
		this.isHoliday = isHoliday;
	}

	@Override
	public String toString() {
		return "Date [month=" + month + ", day=" + day + ", year=" + year + ", isHoliday=" + isHoliday + "]";
	}



	@Override
	public int hashCode() {
		return Objects.hash(day, month, year);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Date other = (Date) obj;
		return day == other.day && month == other.month && year == other.year;
	}

	
    public static void main(String[] args) {
    	Date d1 = new Date(12, 31, 2022, true);
    	Date d2 = new Date(12, 31, 2022, true);
    	Date d3 = new Date(4, 6, 2023, false);
    	Date d4 = new Date(6, 22, 2023, false);
    	
    	System.out.println(d1 == d2);
    	System.out.println(d1.equals(d2));
    	
    	LinkedList<Date> list = new LinkedList<Date>();
    	list.add(d1);
    	list.add(d2);
    	list.add(d1);
    	list.add(d3);
    	list.add(d4);
    	System.out.println(list);
    	
    	for (int i = 0; i < list.size(); i++) {
    		System.out.println(list.get(i));
    	}
    	
    	HashSet<Date> set = new HashSet<Date>();
    	set.add(d1);
    	set.add(d2);
    	set.add(d1);
    	set.add(d3);
    	set.add(d4);
    	System.out.println(set);
    	
    	for (Date dd : set) {
    		System.out.println(dd);
    	}

    }



	/**
	 * @return the month
	 */
	public int getMonth() {
		return month;
	}

	/**
	 * @param month the month to set
	 */
	public void setMonth(int month) {
		this.month = month;
	}

	/**
	 * @return the day
	 */
	public int getDay() {
		return day;
	}

	/**
	 * @param day the day to set
	 */
	public void setDay(int day) {
		this.day = day;
	}

	/**
	 * @return the year
	 */
	public int getYear() {
		return year;
	}

	/**
	 * @param year the year to set
	 */
	public void setYear(int year) {
		this.year = year;
	}

	/**
	 * @return the isHoliday
	 */
	public boolean isHoliday() {
		return isHoliday;
	}

	/**
	 * @param isHoliday the isHoliday to set
	 */
	public void setHoliday(boolean isHoliday) {
		this.isHoliday = isHoliday;
	}











}
