package studio8;

import java.util.HashSet;
import java.util.Objects;

public class Calendar {
	private HashSet<Appointment> appointments; 
	
	/**
	 * @param appointments
	 */
	public Calendar(HashSet<Appointment> appointments) {
		super();
		this.appointments = appointments;
	}


	@Override
	public String toString() {
		return "Calendar [appointments=" + appointments + "]";
	}
	

	@Override
	public int hashCode() {
		return Objects.hash(appointments);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Calendar other = (Calendar) obj;
		return Objects.equals(appointments, other.appointments);
	}

	public void addAppoint(Appointment apointment) {
		this.appointments.add(apointment);
	}
	
	public void removeAppoint(Appointment apointment) {
		this.appointments.remove(apointment);
	}
	
	public int numOfAppointments() {
		return this.appointments.size();
	}
	
	public void combineCalendar(Calendar other) {
		this.appointments.addAll(other.appointments);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Appointment a1 = new Appointment(new Date(8, 23, 2023, false), 
										new Time(12, 12, false));
		Appointment a2 = new Appointment(new Date(8, 23, 2023, true), 
										new Time(12, 12, true));
		Appointment a3 = new Appointment(new Date(7, 14, 1999, false), 
										new Time(23, 42, true));
		Appointment a4 = new Appointment(new Date(3, 8, 2021, true), 
										new Time(2, 12, true));
		HashSet<Appointment> set = new HashSet<Appointment>();
		set.add(a1);
		set.add(a2);
		set.add(a3);
		set.add(a4);
		
		Calendar c1 = new Calendar(set);
		System.out.println(c1);
		
		for (Appointment aa : c1.getAppointments()) {
			System.out.println(aa);
		}
		
		System.out.println(c1.numOfAppointments());
		
		
		c1.addAppoint(new Appointment(new Date(4, 18, 2012, true), 
										new Time(6, 12, true)));
		for (Appointment aa : c1.getAppointments()) {
			System.out.println(aa);
		}
		System.out.println(c1.numOfAppointments());
		
		c1.removeAppoint(a3);
		for (Appointment aa : c1.getAppointments()) {
			System.out.println(aa);
		}
		System.out.println(c1.numOfAppointments());
		
		HashSet<Appointment> set2 = new HashSet<Appointment>();
		set2.add(a1);
		set2.add(a2);
		set2.add(a3);
		set2.add(a4);
		Calendar c2 = new Calendar(set2);
//		for (Appointment aa : c2.getAppointments()) {
//			System.out.println(aa);
//		}
		System.out.println(c2.numOfAppointments());
		System.out.println(c1.equals(c2));
		
		c1.combineCalendar(c2);
		for (Appointment aa : c1.getAppointments()) {
			System.out.println(aa);
		}
		System.out.println(c1.numOfAppointments());
		
		for (Appointment aa : set) {
			System.out.println(aa);
		}
	}


	/**
	 * @return the appointments
	 */
	public HashSet<Appointment> getAppointments() {
		return appointments;
	}

	/**
	 * @param appointments the appointments to set
	 */
	public void setAppointments(HashSet<Appointment> appointments) {
		this.appointments = appointments;
	}





}
