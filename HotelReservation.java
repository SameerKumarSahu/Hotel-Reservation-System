package com.HotelReservation;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Comparator;

public class HotelReservation {

	public static void findCheapestHotel(ArrayList<Hotel> hotelList) {
		LocalDate startingDate = LocalDate.of(2021, Month.SEPTEMBER, 10);
		LocalDate endingDates = LocalDate.of(2021, Month.SEPTEMBER, 12);
		int noOfDaysBetween = (int) ChronoUnit.DAYS.between(startingDate, endingDates);
		Hotel hotel1 = hotelList.stream().min(Comparator.comparing(Hotel::getRateForRegularCustomer)).get();
		int TotalRates = (int) (hotel1.getRateForRegularCustomer() * noOfDaysBetween);
		System.out.println("The Cheapest " + hotel1);
		System.out.println("Total Rate for " + noOfDaysBetween + " days is = " + TotalRates);
	}

	public static void main(String[] args) {
		System.out.println("Welcome to the Hotel Reservation Program..");
		ArrayList<Hotel> hotelList = new ArrayList<Hotel>();
		// Adding HotelNames and Rate for the Regular customer
		// Rates are in Dollar($)
		hotelList.add(new Hotel("LakeWood", 110));
		hotelList.add(new Hotel("BridgeWood", 160));
		hotelList.add(new Hotel("RidgeWood", 220));
		int n = 1;
		System.out.println("Hotel details are :-");
		for (Hotel hotels : hotelList) {
			System.out.println(n + ")" + hotels);
			n++;
		}
		findCheapestHotel(hotelList);
	}
}
