package com.HotelReservation;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class HotelReservation {
	public static void findChepestBestRatedHotel(ArrayList<Hotel> hotelList) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the starting date in this format 'YYYY-MM-DD'");
		String localDate1 = sc.nextLine();
		System.out.println("Enter the ending date in this format 'YYYY-MM-DD'");
		String localDate2 = sc.nextLine();
		LocalDate startingDate = LocalDate.parse(localDate1);
		LocalDate endingDates = LocalDate.parse(localDate2);
		long noOfDaysBetween = ChronoUnit.DAYS.between(startingDate, endingDates);

		Hotel hotel = hotelList.stream().min(Comparator.comparing(Hotel::getWeekDayRate)).get();
		int TotalRate = (int) (hotel.getWeekDayRate() * noOfDaysBetween);
		System.out.println("The cheapest best rated Hotel name is " + hotel.getName()+" And it's rating is"+hotel.getRating());
		System.out.println("Total Rate for " + noOfDaysBetween + " days is = " + TotalRate);

	}

	public static void main(String[] args) {
		System.out.println("Welcome to the Hotel Reservation Program..");
		ArrayList<Hotel> hotelList = new ArrayList<Hotel>();
		// Adding HotelNames, weekDayRate, weekEndRate and Rating
		// Rates are in Dollar($)
		hotelList.add(new Hotel("LakeWood", 110, 90,3));
		hotelList.add(new Hotel("BridgeWood", 150, 50,4));
		hotelList.add(new Hotel("RidgeWood", 220, 150,5));
		int n = 1;
		System.out.println("Hotel details are :-");
		for (Hotel hotels : hotelList) {
			System.out.println(n + ")" + hotels);
			n++;
		}
		findChepestBestRatedHotel(hotelList);
		
	}
}
