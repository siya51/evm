package evm;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class fnsTest {
	int count=0;
	BallotingUnitsss bu = new BallotingUnitsss();
	ControlUnit cu = new fns();

	@Before
	public void setUp() throws Exception {
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

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	

}
