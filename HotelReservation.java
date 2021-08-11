package com.HotelReservation;

import java.util.ArrayList;

public class HotelReservation {

	public static void main(String[] args) {
		System.out.println("Welcome to the Hotel Reservation Program..");
		ArrayList<Hotel> hotelList = new ArrayList<Hotel>();
		// Adding HotelNames, weekDayRate and weekEndRate
		// Rates are in Dollar($)
		hotelList.add(new Hotel("LakeWood", 110, 90));
		hotelList.add(new Hotel("BridgeWood", 150, 50));
		hotelList.add(new Hotel("RidgeWood", 220, 150));
		int n = 1;
		System.out.println("Hotel details are :-");
		for (Hotel hotels : hotelList) {
			System.out.println(n + ")" + hotels);
			n++;
		}

	}
}
