package evm;

import java.util.ArrayList;
import java.util.Scanner;

public class BallotingUnitsss {//rename refactoring

	int totalpoll=0;
	int can1=0, can2=0, can3=0;
	ArrayList <Candidates> candidates = new ArrayList<Candidates>();
	
	public int machineready(){
		System.out.println("Machine is ready to vote");
		return 0;
	}

	
	public String castVote(){
		Scanner s = new Scanner(System.in);
		System.out.println("Select the appropriate button to cast the vote");
		System.out.println("Enter 1- Candidate One Mayu");
		System.out.println("Enter 2- Candidate Two Sid");
		System.out.println("Enter 3- Candidate Three Ash");
		System.out.println("================================================");
		System.out.println("FOR OTHER INQUIRY");
		System.out.println("Enter 4- Total Votes so far");
		System.out.println("Enter 5- Total votes for each candidate");
		System.out.println("Enter 6- Close the poll");
		System.out.println("Enter 7- Reset Votes");
		System.out.println("================================================");
		int selectedCandidate = s.nextInt();

		
		System.out.println("---"+selectedCandidate);
		
		System.out.println("================================================");
	
		return yourChoice(selectedCandidate);//Method Extract
	}


	private String yourChoice(int selectedCandidate) {
		if(selectedCandidate==1) {
			can1++;
			totalpoll=totalpoll+1;
			System.out.println("Total : "+can1);
			System.out.println("================================================");
		}
		else if(selectedCandidate==2) {
			can2++;
			totalpoll=totalpoll+1;
			System.out.println("Total : "+can2);
			System.out.println("================================================");
		}
		else if(selectedCandidate==3) {
			can3++;
			totalpoll=totalpoll+1;
			System.out.println("Total : "+can3);
			System.out.println("================================================");
		}
		else if(selectedCandidate==4) {
			System.out.println("Total votes so far : "+totalpoll);
			System.out.println("================================================");
		}
		else if(selectedCandidate==6) {
			exit(1);
		}
		else if(selectedCandidate==5) {
			
			System.out.println("Total votes for various candidate : ");
			System.out.println("Candidate 1 Mayu : "+can1);
			System.out.println("Candidate 2 Sid: "+can2);
			System.out.println("Candidate 3 Ash: "+can3);
			System.out.println("==================================");
		}
		else if(selectedCandidate==7) {
			resetCounter();//Extract Method
		}
		
		
		return "true";
	}


	private void resetCounter() {
		can1=0;
		can2=0;
		can3=0;
		totalpoll=0;
		System.out.println("Reset Counter : "+can1+" "+can2+" "+can3+" "+totalpoll);
		System.out.println("========================================================");
	}


	private void exit(int i) {
		// TODO Auto-generated method stub
		if(i==1) {
			System.out.println("closed");
			System.exit(0);
		}
	}


	public void sendoutput(ControlUnit cu) {
		// TODO Auto-generated method stub
		cu.receiveInput(totalpoll);
	}
	
	
}

