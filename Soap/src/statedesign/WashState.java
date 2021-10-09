package statedesign;

public class WashState implements State{
	
	Soap soap;
	WashState(Soap soap){
		this.soap = soap;
	}
	@Override
	public void buySoap() {
		System.out.println("Soap already brought");		
		soap.setState(soap.getBuyState());
		
	}
	@Override
	public void useSoap() {
		System.out.println("soap is used to take bath");
		soap.setState(soap.getUseState());
		
	}
	@Override
	public void breakSoap() {
		System.out.println("Soap broke");
		soap.setState(soap.getBreakstate());
		
	}
	@Override
	public void washSoap() {
		System.out.println("Soap broken, We can not use it");	
	}

	public String toString() {
		return "soap cleaning";
	}
}
