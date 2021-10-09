package statedesign;

public class UseState implements State{
	
	Soap soap;
	UseState(Soap soap){
		this.soap = soap;
	}
	@Override
	public void buySoap() {
		System.out.println("Soap already brought");	
		soap.setState(soap.getBuyState());		
	}
	@Override
	public void useSoap() {
		System.out.println("Taking bath with soap");		
	}
	@Override
	public void breakSoap() {
		System.out.println("Soap broke");
		soap.setState(soap.getBreakstate());
		
	}
	@Override
	public void washSoap() {
		System.out.println("Bath finished with soap, cleaning Soap");
		soap.setState(soap.getWashState());
	}
	
	public String toString()
	{
		return "Taking Bath";
	}

}
