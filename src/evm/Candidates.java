package evm;

public class Candidates {//Rename refactoring
	
	String Name;
	int candidateID;
	int myVotersCount;
	
	public Candidates(String name, int candidateID, int myVotersCount) {
		super();
		Name = name;
		this.candidateID = candidateID;
		this.myVotersCount = 0;
	}
	
}