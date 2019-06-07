package com.stream.api;

class MobileNumber{
	private String number;
	
	public MobileNumber(String number) {
		this.number = number;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return this.getNumber().equals(((MobileNumber)obj).getNumber());
	}
	
	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}
}
