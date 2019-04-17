package com.class23;

public class ScrumTeam extends Employee {// ScrumTeam is our parent class and we will use extends to inherit info.
	
public String artifacts;
public String ceremonies;


public void workOnArtifacts() {
	
	System.out.println("Scrum team work on " + artifacts);
}
public void attendScrumMeetings() {
	System.out.println("Scrum team attend " +ceremonies);
}
}
