package statedesign;

public class Soap 
{
	State state;
	BuyState buy;
	UseState use;
	BreakState bstate;
	WashState wash;
	
	Soap()
	{
		buy = new BuyState(this);
		use = new UseState(this);
		bstate = new BreakState(this);
		wash = new WashState(this);
		state = buy;		
	}
	
	public void setState(State s) {
		state = s;
	}
	
	public State getStae() {
		return state;
	}

	public BuyState getBuyState() {
		return buy;
	}

	public UseState getUseState() {
		return use;
	}

	public BreakState getBreakstate() {
		return bstate;
	}

	public WashState getWashState() {
		return wash;
	}
	
	public void buySoap() {
		state.buySoap();
	}
	
	public void useSoap() {
		state.useSoap();
	}
	
	public void breakSoap() {
		state.breakSoap();
	}
	
	public void washSoap() {
		state.washSoap();
	}
	
	public String toString()
	{
		StringBuffer sb=new StringBuffer();
		sb.append("\nSoap State  \nSoap "+state);
		return sb.toString();
	}
}
