package com.HotelReservation;

public class Hotel {
	public String hotelName;
	public int rateForRegularCustomer;
	public int weekDayRate;
	public int weekEndRate;
	public int rating;
	public int rateForRewardCustomer;
	//Default Constructor
	public Hotel() {

	}
	//Parameterized Constructor
//	public Hotel(String name,int rateForRegularCustomer) {
//
//		this.hotelName = name;
//		this.rateForRegularCustomer=rateForRegularCustomer;
//	}
	public Hotel(String name,int weekDayRate, int weekEndRate) {

		this.hotelName = name;
		this.weekDayRate = weekDayRate;
		this.weekEndRate = weekEndRate;
	}
//	public Hotel(String name,int weekDayRate, int weekEndRate,int rating) {
//
//		this.hotelName = name;
//		this.weekDayRate = weekDayRate;
//		this.weekEndRate = weekEndRate;
//		this.rating=rating;
//	}
//	public Hotel(String name,int rateForRewardCustomer) {
//
//		this.hotelName = name;
//		this.rateForRewardCustomer=rateForRewardCustomer;
//	}

	public String getName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public int getRateForRegularCustomer() {
		return rateForRegularCustomer;
	}

	public void setRateForRegularCustomer(int rateForRegularCustomer) {
		this.rateForRegularCustomer = rateForRegularCustomer;
	}
	public int getWeekDayRate() {
		return weekDayRate;
	}	
	public void setWeekDayRate(int weekDayRate) {
		this.weekDayRate = weekDayRate;
	}
	public int getWeekEndRate() {
		return weekEndRate;
	}
	public void setWeekEndRate(int weekEndRate) {
		this.weekEndRate = weekEndRate;
	}
	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	

	@Override
	public String toString() {
		return " HotelName = " + hotelName +  ", WeekDayRate = "
				+ weekDayRate + ", WeekEndRate = " + weekEndRate+", Rating = "+rating ;
	}
	
}
