package com.HotelReservation;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class HotelReservation {

	public static void findChepestBestRatedHotel(ArrayList<Hotel> hotelList) {
		System.out.println("Enter the CustomerType");
		System.out.println("Press 1 - Reward Customer");
		System.out.println("Press 2 - Regular Customer");
		Scanner sc = new Scanner(System.in);
		int option = sc.nextInt();
		switch (option) {
		case 1:
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter the starting date in this format 'YYYY-MM-DD'");
			String localDate1 = scan.nextLine();
			System.out.println("Enter the ending date in this format 'YYYY-MM-DD'");
			String localDate2 = scan.nextLine();
			LocalDate startingDate = LocalDate.parse(localDate1);
			LocalDate endingDate = LocalDate.parse(localDate2);
			long noOfDaysBetween = ChronoUnit.DAYS.between(startingDate, endingDate);

			Hotel hotel = hotelList.stream().min(Comparator.comparing(Hotel::getRateForRewardCustomer)).get();
			int TotalRate = (int) (hotel.getRateForRewardCustomer() * noOfDaysBetween);
			System.out.println("The cheapest best rated Hotel name is " + hotel.getName() + " And it's rating is "
					+ hotel.getRating());
			System.out.println("Total Rate for " + noOfDaysBetween + " days is = " + TotalRate);
			break;
		case 2:
			Scanner sca = new Scanner(System.in);
			System.out.println("Enter the starting date in this format 'YYYY-MM-DD'");
			String localDate3 = sca.nextLine();
			System.out.println("Enter the ending date in this format 'YYYY-MM-DD'");
			String localDate4 = sca.nextLine();
			LocalDate startingDates = LocalDate.parse(localDate3);
			LocalDate endingDates = LocalDate.parse(localDate4);
			long noOfDays = ChronoUnit.DAYS.between(startingDates, endingDates);

			Hotel hotel1 = hotelList.stream().min(Comparator.comparing(Hotel::getRateForRegularCustomer)).get();
			int TotalRates = (int) (hotel1.getRateForRegularCustomer() * noOfDays);
			System.out.println("The cheapest best rated Hotel name is " + hotel1.getName() + " And it's rating is "
					+ hotel1.getRating());
			System.out.println("Total Rate for " + noOfDays + " days is = " + TotalRates);
			break;
		}
	}

	public static void main(String[] args) {
		System.out.println("Welcome to the Hotel Reservation Program..");
		ArrayList<Hotel> hotelList = new ArrayList<Hotel>();
		// Adding HotelNames, weekDayRate, weekEndRate, Rating,
		// rateForRegularCustomer,and rateForRewardCustomer
		// Rates are in Dollar($)
		hotelList.add(new Hotel("LakeWood", 110, 90, 3, 80, 80));
		hotelList.add(new Hotel("BridgeWood", 150, 50, 4, 110, 50));
		hotelList.add(new Hotel("RidgeWood", 220, 150, 5, 100, 40));
		int n = 1;
		System.out.println("Hotel details are :-");
		for (Hotel hotels : hotelList) {
			System.out.println(n + ")" + hotels);
			n++;
		}
		findChepestBestRatedHotel(hotelList);
	}
}
