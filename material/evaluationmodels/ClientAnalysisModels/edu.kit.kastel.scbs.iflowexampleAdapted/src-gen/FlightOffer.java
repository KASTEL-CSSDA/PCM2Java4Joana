package generated.code;

import edu.kit.joana.ui.annotations.*;
import generated.code.AirlineSpec;
public class FlightOffer { 
private Integer id;

public Integer getid() {
	return this.id;
}
public void setid(Integer id) {
	this.id = id;
}
private AirlineSpec airline;

public AirlineSpec getairline() {
	return this.airline;
}
public void setairline(AirlineSpec airline) {
	this.airline = airline;
}
public FlightOffer(Integer id, AirlineSpec airline) {
	// TODO: Implement me!
	this.id = id;
	this.airline = airline;
}
		}