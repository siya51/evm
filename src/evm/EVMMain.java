package evm;

public class EVMMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		BallotingUnitsss bu = new BallotingUnitsss();
		ControlUnit cu = new fns();
		
		cu.addcandidate();
		cu.ballotbutton();
		while(count<100){
			bu.machineready();
			String a = bu.castVote();
			if(a=="true"){
				bu.sendoutput(cu);
				cu.success();
				cu.ballotbutton();
			}
			count++;
		}
		cu.totalpoll();	
	}
}


	