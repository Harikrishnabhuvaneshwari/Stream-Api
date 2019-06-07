package com.stream.functionalinterfaces.consumer;

public class Movie {
	String name;
	String actor;
	String actress;
	public Movie(String name, String actor, String actress) {
		super();
		this.name = name;
		this.actor = actor;
		this.actress = actress;
	}
	@Override
	public String toString() {
		return "Movie [name=" + name + ", actor=" + actor + ", actress=" + actress + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getActor() {
		return actor;
	}
	public void setActor(String actor) {
		this.actor = actor;
	}
	public String getActress() {
		return actress;
	}
	public void setActress(String actress) {
		this.actress = actress;
	}
}
