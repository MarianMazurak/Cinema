package com.mazurak.pojo;

public class CinemaHall {

	private int hallNum;

	public CinemaHall(int hallNum) {
		this.hallNum = hallNum;

	}

	public int getHallNum() {
		return hallNum;
	}

	public void setHallNum(int hallNum) {
		this.hallNum = hallNum;
	}

	@Override
	public String toString() {
		return "CinemaHall [hallNum=" + hallNum + "]";
	}

}
