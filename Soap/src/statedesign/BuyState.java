package statedesign;

public class BuyState  implements State{
	
	Soap soap;
	
	BuyState(Soap soap){
		this.soap = soap;
	}

	@Override
	public void buySoap() {
		System.out.println("Buying Soap");		
	}

	@Override
	public void useSoap() {
		System.out.println("Bathing with Soap");
		soap.setState(soap.getUseState());
		
	}

	@Override
	public void breakSoap() {
		System.out.println("Soap broke");
		soap.setState(soap.getBreakstate());		
	}

	@Override
	public void washSoap() {
		System.out.println("cleaning soap");	
		soap.setState(soap.getWashState());
	}
	
	public String toString() {
		return "brought";
	}
}
