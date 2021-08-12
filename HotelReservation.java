package com.HotelReservation;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class HotelReservation {
	
	public static void main(String[] args) {
		System.out.println("Welcome to the Hotel Reservation Program..");
		ArrayList<Hotel> hotelList = new ArrayList<Hotel>();
		// Adding HotelNames, weekDayRate, weekEndRate, Rating, rateForRegularCustomer,and rateForRewardCustomer
		// Rates are in Dollar($)
		hotelList.add(new Hotel("LakeWood", 110, 90,3,80,80));
		hotelList.add(new Hotel("BridgeWood", 150, 50,4,110,50));
		hotelList.add(new Hotel("RidgeWood", 220, 150,5,100,40));
		int n = 1;
		System.out.println("Hotel details are :-");
		for (Hotel hotels : hotelList) {
			System.out.println(n + ")" + hotels);
			n++;
		}
			
	}
}
