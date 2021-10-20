package travelplannerpcm.components;


import travelplannerpcm.datatypes.CreditCardDetails;
import travelplannerpcm.datatypes.FlightOffer;
import travelplannerpcm.datatypes.RequestData;
import travelplannerpcm.interfaces.Booking;
import travelplannerpcm.interfaces.BookingConfirmation;
import travelplannerpcm.interfaces.BookingSelection;
import travelplannerpcm.interfaces.Declassification;
import travelplannerpcm.interfaces.DeclassificationReceiver;
import travelplannerpcm.interfaces.FlightOffers;
import travelplannerpcm.interfaces.Input;

public class TravelPlanner implements BookingSelection, DeclassificationReceiver {
	
	private FlightOffers flightOffers;
	private Booking booking;
	private Declassification declassification;
	private Input input;
	private FlightOffer currentOffer; 
	private BookingConfirmation receiver;
	
	public TravelPlanner(FlightOffers flightOffers, Booking booking, Declassification declassification, Input input, BookingConfirmation bookingConfirmationReceive) {
		// TODO: implement and verify auto-generated constructor.
	    this.flightOffers = flightOffers;
	    this.booking = booking;
	    this.declassification = declassification;
	    this.input = input;
	    this.receiver = bookingConfirmationReceive;
	}
	
	public void bookSelected(FlightOffer flightOffer){
		this.currentOffer = flightOffer;
		declassification.releaseCCD(currentOffer.getAirline());
	}
	
	
	public void startScenario() {
		this.input.getInput();
	}

	@Override
	public void declassifiedCCD(CreditCardDetails details) {
		if(booking.bookFlightOffer(currentOffer.getId(), details)) {
			receiver.ok();
		}
	}

	@Override
	public void getFlightOffers(RequestData requestData) {
		Iterable<FlightOffer> flightOffers = this.flightOffers.getFlightOffers(requestData);
		input.getSingleSelection(flightOffers);
	}
	
}