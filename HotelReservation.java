package com.HotelReservation;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class HotelReservation {

	

	static void display(ArrayList<Hotel> hotelList) {
		int n = 1;
		System.out.println("Hotel details are :-");
		for (Hotel hotels : hotelList) {
			System.out.println(n + ")" + hotels);
			n++;
		}
	}

	static void add(ArrayList<Hotel> hotelList) {
		// Adding HotelNames, weekDayRate,weekEndRate and Rating
		// Rates are in Dollar($)
		hotelList.add(new Hotel("LakeWood", 110, 90));
		hotelList.add(new Hotel("BridgeWood", 150, 50));
		hotelList.add(new Hotel("RidgeWood", 220, 150));
		}
	
		
	public static void findChepestHotel(ArrayList<Hotel> hotelList) {
		Scanner sca = new Scanner(System.in);
		System.out.println("Enter select the option for booking Hotel");
        System.out.println("Press 1 - WeekDay");
        System.out.println("Press 2 - WeekEnd");
        int option = sca.nextInt();
        switch(option) {
        case 1:
        	Scanner sc = new Scanner(System.in);
    		System.out.println("Enter the starting date in this format 'YYYY-MM-DD'");
    		String localDate1 = sc.nextLine();
    		System.out.println("Enter the ending date in this format 'YYYY-MM-DD'");
    		String localDate2 = sc.nextLine();
    		LocalDate startingDate = LocalDate.parse(localDate1);
    		LocalDate endingDate = LocalDate.parse(localDate2);
    		long noOfDaysBetween = ChronoUnit.DAYS.between(startingDate, endingDate);

    		Hotel hotel = hotelList.stream().min(Comparator.comparing(Hotel::getWeekDayRate)).get();
    		int TotalRate = (int) (hotel.getWeekDayRate() * noOfDaysBetween);
    		System.out.println("The ChepestWeekDay Hotel Name is " + hotel.getName());
    		System.out.println("Total Rate for Weekday " + noOfDaysBetween + " days is = " + TotalRate);
    		break;
        case 2:
        	Scanner scan = new Scanner(System.in);
    		System.out.println("Enter the starting date in this format 'YYYY-MM-DD'");
    		String loDate3 = scan.nextLine();
    		System.out.println("Enter the ending date in this format 'YYYY-MM-DD'");
    		String loDate4 = scan.nextLine();
    		LocalDate startingDates = LocalDate.parse(loDate3);
    		LocalDate endingDates = LocalDate.parse(loDate4);
    		long noOfDays = ChronoUnit.DAYS.between(startingDates, endingDates);

    		Hotel hotel1 = hotelList.stream().min(Comparator.comparing(Hotel::getWeekEndRate)).get();
    		int TotalRates = (int) (hotel1.getWeekEndRate() * noOfDays);
    		System.out.println("The ChepestWeekEnd Hotel Name is " + hotel1.getName());
    		System.out.println("Total Rate for Weekend " + noOfDays + " days is = " + TotalRates);
    		break;
        }
	
	}
	public static void main(String[] args) {
		System.out.println("Welcome to the Hotel Reservation Program..");
		ArrayList<Hotel> hotelList = new ArrayList<Hotel>();

		add(hotelList);
		display(hotelList);
		findChepestHotel(hotelList);
	
	}
}
