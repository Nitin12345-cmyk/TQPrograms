package com.day10;

public class Movie {
	int yearOfRelease;
	float profit;
	String producerName, actorName;

	void acceptDetails(int y,float p,String pr,String a) {
		yearOfRelease = y;
		profit = p;
		producerName = pr;
		actorName = a;

	}

	void showDetails() {
		System.out.println("profit" + profit);
		System.out.println("producerName" + producerName);
		System.out.println("actorName" + actorName);
		System.out.println("yearOfRelease" + yearOfRelease);

	}

	public static void main(String[] args) {
		Movie titanic = new Movie();
		titanic.showDetails();
		titanic.acceptDetails(1997,120000.00f,"Mr.James","Leonardo");
		System.out.println("After calling acceptDetails");
		titanic.showDetails();

		Movie uri = new Movie();
		uri.acceptDetails(2019,10000000.00f,"Vidhu","Vicky Kaushal");
		System.out.println("Details of uri object");
		uri.showDetails();
	}

}