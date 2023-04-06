package studio8;

import java.util.Objects;

public class Appointment {
	private Date date;
	private Time time;
	
	/**
	 * @param date
	 * @param time
	 */
	public Appointment(Date date, Time time) {
		super();
		this.date = date;
		this.time = time;
	}


	@Override
	public String toString() {
		return "Appointment [date=" + date + ", time=" + time + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(date, time);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Appointment other = (Appointment) obj;
		return Objects.equals(date, other.date) && Objects.equals(time, other.time);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Appointment a1 = new Appointment(new Date(8, 23, 2023, false), 
										new Time(12, 12, false));
		Appointment a2 = new Appointment(new Date(8, 23, 2023, true), 
				new Time(12, 12, true));
		System.out.println(a1.equals(a2));
		System.out.println(a1 == a2);
	}




	/**
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}


	/**
	 * @param date the date to set
	 */
	public void setDate(Date date) {
		this.date = date;
	}


	/**
	 * @return the time
	 */
	public Time getTime() {
		return time;
	}


	/**
	 * @param time the time to set
	 */
	public void setTime(Time time) {
		this.time = time;
	}


}
