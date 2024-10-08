package dto;

public class Flight_Dto {
	private int flight_id;
	private String airlinename;
	private String destination;
	private int departure_time;
	private int arrival_time;
	Flight_Dto(int flight_id, String airlinename, String destination, int departure_time, int arrival_time) {
		this.flight_id = flight_id;
		this.airlinename = airlinename;
		this.destination = destination;
		this.departure_time = departure_time;
		this.arrival_time = arrival_time;
	}
	public int getFlight_id() {
		return flight_id;
	}
	public void setFlight_id(int flight_id) {
		this.flight_id = flight_id;
	}
	public String getAirlinename() {
		return airlinename;
	}
	public void setAirlinename(String airlinename) {
		this.airlinename = airlinename;
	}
	public String getDestination() {
		return destination;
	}
	public void setDetsination(String destination) {
		this.destination = destination;
	}
	public int getDeparture_time() {
		return departure_time;
	}
	public void setDeparture_time(int departure_time) {
		this.departure_time = departure_time;
	}
	public int getArrival_time() {
		return arrival_time;
	}
	public void setArrival_time(int arrival_time) {
		this.arrival_time = arrival_time;
	}
	@Override
	public String toString() {
		return "Flight_Dto [flight_id=" + flight_id + ", airlinename=" + airlinename + ", destination=" + destination
				+ ", departure_time=" + departure_time + ", arrival_time=" + arrival_time + "]";
	}
	
}
