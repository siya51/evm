package evm;

import java.util.*;

public interface ControlUnit {
	
	public int ballotbutton();
	
	public int addcandidate();
	
	public void success();

	public void receiveInput(int totalpoll);
	
	public void totalpoll();

}
