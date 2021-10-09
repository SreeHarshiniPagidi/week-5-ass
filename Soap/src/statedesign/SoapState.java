package statedesign;

public class SoapState {

	public static void main(String[] args) {
		Soap s = new Soap();
		System.out.println(s);
		s.buySoap();
		s.breakSoap();
		s.washSoap();
		s.useSoap();
		s.buySoap();
		System.out.println(s);
		s.buySoap();
		s.washSoap();
		s.useSoap();
		s.breakSoap();		
		System.out.println(s);
		s.buySoap();
		s.useSoap();
		s.washSoap();
		s.breakSoap();		
	}
}
