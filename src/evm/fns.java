package evm;

import java.util.ArrayList;

public class fns implements ControlUnit{
	
	int totalpoll;
	
	ArrayList <Candidates> candidates = new ArrayList<Candidates>();
	
	Candidates cd1 = new Candidates("Mayu",1,0);
	Candidates cd2 = new Candidates("Sid",2,0);
	Candidates cd3 = new Candidates("Ash",3,0);
	
	@Override
	public int ballotbutton() {
		// TODO Auto-generated method stub
		System.out.println("BLUE Button is Pressed");
		return 0;
	}
	
	public int addcandidate(){
		candidates.add(cd1);
		candidates.add(cd2);
		candidates.add(cd3);
		System.out.println("Candidates Added Successfully\n");
		return 0;
	}

	public void success(){
		System.out.println("You have successfully cast your vote");
	}

	@Override
	public void receiveInput(int totalpoll) {
		// TODO Auto-generated method stub
		this.totalpoll=totalpoll;
	}
	
	public void totalpoll() {
		// TODO Auto-generated method stub
		System.out.println("Total Votes cast " + totalpoll);
	}
}

