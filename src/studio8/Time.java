package studio8;

import java.util.Objects;

public class Time {
	private int hour;
	private int minute;
	private boolean is12;
	
	/**
	 * @param hour
	 * @param minute
	 * @param is12Or24
	 */
	public Time(int hour, int minute, boolean is12) {
		super();
		if (hour >= 0 && hour <= 23) {
			this.hour = hour;
		}
		else {
			System.out.println("hour should be between 0 and 23 (inclusively)");
		}
		
		if (minute >= 0 && minute <= 59) {
			this.minute = minute;
		}
		else {
			System.out.println("minute should be between 0 and 59 (inclusively)");
		}
		
		this.is12 = is12;
	}


	@Override
	public String toString() {
		if (this.hour >= 12) {
			if (this.hour > 12 && this.is12) {
				return (this.hour - 12) + ":" + this.minute + "PM";
			}
			return this.hour + ":" + this.minute + "PM";
		}
		
		return this.hour + ":" + this.minute + "AM";
	}

	@Override
	public int hashCode() {
		return Objects.hash(hour, minute);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Time other = (Time) obj;
		return hour == other.hour && minute == other.minute;
	}
	

	public static void main(String[] args) {
		Time t1 = new Time(23, 55, true);
		Time t2 = new Time(23, 55, false);
		Time t3 = new Time(12, 45, true);
		Time t4 = new Time(9, 35, true);
		System.out.println(t1 == t2);
		System.out.println(t1.equals(t2));

    }



	/**
	 * @return the hour
	 */
	public int getHour() {
		return hour;
	}


	/**
	 * @param hour the hour to set
	 */
	public void setHour(int hour) {
		this.hour = hour;
	}


	/**
	 * @return the minute
	 */
	public int getMinute() {
		return minute;
	}


	/**
	 * @param minute the minute to set
	 */
	public void setMinute(int minute) {
		this.minute = minute;
	}


	/**
	 * @return the is12Or24
	 */
	public boolean getIs12() {
		return is12;
	}


	/**
	 * @param is12Or24 the is12Or24 to set
	 */
	public void setIs12(boolean is12) {
		this.is12 = is12;
	}












}