package com.stream.api;


class Address{
	private String zipcode;
	
	@Override
	public boolean equals(Object obj) {
		return this.getZipcode().equals(((Address)obj).getZipcode());
	}

	public Address(String zipcode) {
		this.zipcode = zipcode;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
}
