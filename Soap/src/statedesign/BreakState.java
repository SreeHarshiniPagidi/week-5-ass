package statedesign;

public class BreakState implements State{
	
	Soap soap;
	BreakState(Soap soap){
		this.soap = soap;
	}
	@Override
	public void buySoap() {
		System.out.println("Buying soap");
		soap.setState(soap.getBuyState());
		
	}
	@Override
	public void useSoap() {
		System.out.println("Soap Broke, can not take bath");	
		
	}
	@Override
	public void breakSoap() {
		System.out.println("Soap broke");
		
	}
	@Override
	public void washSoap() {
		System.out.println("Soap broken, can not be cleaned");		
	}
	
	public String toString() {
		return "broke";
	}

}
