package com.class23;

public class Test {

	public static void main(String[] args) {
		
	System.out.println("------Creating Employee Object-------");
	Employee emp = new Employee();
	System.out.println(Employee.department);
	Employee.work();
	//emp.work(); not proffered way.
	emp.salary = 90000;
	emp.getPaid();
	
	System.out.println("------Creating ScrumTeam Object-------");
	ScrumTeam st = new ScrumTeam();
	ScrumTeam.work();
	st.salary = 100000;
	st.getPaid();
	st.artifacts = "Product Backlog, Sprint Backlog, BurnDown Chart";
	st.ceremonies = "Sprint grooming, Sprint Planning, Daily StandUp,  Sprint Demo, Sprint Retro, ";
	st.attendScrumMeetings();
	st.workOnArtifacts();
	
	System.out.println("------Creating Developer Object-------");
	Developer dev = new Developer();
	Developer.work();
	dev.salary = 120000;
	dev.getPaid();
	dev.artifacts = "Sprint Backlog";
	dev.ceremonies = "Sprint grooming, Sprint Planning, Daily StandUp,  Sprint Demo, Sprint Retro, ";
	dev.workOnArtifacts();
	dev.attendScrumMeetings();
	dev.code();
	
	System.out.println("------Creating Tester Object-------");
	Tester qa = new Tester();
	Tester.work();
	qa.salary = 100000;
	qa.getPaid();
	qa.artifacts = "Sprint Backlog";
	qa.ceremonies = "Sprint grooming, Sprint Planning, Sprint Demo, Sprint Retro, ";
	qa.workOnArtifacts();
	qa.attendScrumMeetings();
	qa.test();
	
	System.out.println("------Creating Business Analyst Object-------");
	BusinessAnalyst ba = new BusinessAnalyst();
	BusinessAnalyst.work();
	ba.salary = 85000;
	ba.getPaid();
	ba.artifacts = "Sprint Backlog";
	ba.ceremonies = "Sprint grooming, Sprint Planning, Daily StandUp,  Sprint Demo, Sprint Retro, ";
	ba.workOnArtifacts();
	ba.attendScrumMeetings();
	ba.canWriteUserStories();
	
	System.out.println("------Creating Scrum Master Object-------");
	ScrumMaster sm = new ScrumMaster();
	ScrumMaster.work();
	sm.salary = 85000;
	sm.getPaid();
	sm.artifacts = "Burn Down Chart";
	sm.ceremonies = "Sprint grooming, Sprint Planning, Daily StandUp,  Sprint Demo, Sprint Retro, ";
	sm.workOnArtifacts();
	sm.attendScrumMeetings();
	sm.drivesScrumMeetings();
	
	System.out.println("------Creating Product Owner Object-------");
	ProductOwner po = new ProductOwner();
	ProductOwner.work();
	po.salary = 150000;
	po.getPaid();
	po.artifacts = "Sprint Backlog, Product Backlog";
	po.ceremonies = "Sprint grooming, Sprint Planning, Daily StandUp,  Sprint Demo, Sprint Retro, ";
	po.workOnArtifacts();
	po.attendScrumMeetings();
	po.talkToTheClient();
	
	System.out.println("------Creating Front End Developers Object-------");
	FrontEndDeveloper fed = new FrontEndDeveloper();
	FrontEndDeveloper.work();
	fed.salary = 95000;
	fed.getPaid();
	fed.artifacts = "Sprint planning, Sprint grooming";
	fed.ceremonies = "Sprint grooming, Sprint Planning, Daily StandUp,  Sprint Demo, Sprint Retro,";
	fed.workOnArtifacts();
	fed.attendScrumMeetings();
	fed.dohtml();
	
	System.out.println("------Creating Back End Developer Object-------");
	BackEndDeveloper bed = new BackEndDeveloper();
	BackEndDeveloper.work();
	bed.salary = 95000;
	bed.getPaid();
	bed.artifacts = "Sprint planning, Sprint grooming";
	bed.ceremonies = "Sprint grooming, Sprint Planning, Daily StandUp,  Sprint Demo, Sprint Retro,";
	bed.workOnArtifacts();
	bed.attendScrumMeetings();
	bed.doSQLcoding();
	
	System.out.println("------Creating Manual Tester Object-------");
	ManualTester mt = new ManualTester();
	ManualTester.work();
	mt.salary = 65000;
	mt.getPaid();
	mt.artifacts = "Test planning, Sprint Testing";
	mt.ceremonies = "Sprint grooming, Sprint Planning, Daily StandUp,  Sprint Demo, Sprint Retro,";
	mt.workOnArtifacts();
	mt.attendScrumMeetings();
	mt.testManually();
	
	System.out.println("------Creating Automation Tester Object-------");
	AutomationTester at = new AutomationTester();
	AutomationTester.work();
	at.salary = 65000;
	at.getPaid();
	at.artifacts = "Test planning, Sprint Testing";
	at.ceremonies = "Sprint grooming, Sprint Planning, Daily StandUp,  Sprint Demo, Sprint Retro,";
	at.workOnArtifacts();
	at.attendScrumMeetings();
	at.codeInJava();
	
	}
}
