package com.prienc;

public class DeskPhone implements ITelephone {
	private int myNumber;
	private boolean isRinging;

	public DeskPhone(int myNumber) {
		super();
		this.myNumber = myNumber;
	}

	@Override
	public void powerOn() {

		System.out.println("No need to take action deskphone does not have power button ");
		// TODO Auto-generated method stub

	}

	@Override
	public void dail(int phoneNumber) {
		System.out.println("Now ringing "+ phoneNumber+" on deskphone");
		// TODO Auto-generated method stub

	}

	

	}


