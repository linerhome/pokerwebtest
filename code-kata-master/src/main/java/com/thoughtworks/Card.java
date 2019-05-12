package com.thoughtworks;

public class Card {
	private char name;
	private int value;
	private char color;
	Card card;
	public char getName() {
		return name;
	}
	public void setName(char name) {
		this.name = name;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public char getColor() {
		return color;
	}
	public void setColor(char color) {
		this.color = color;
	}
	public Card() {
	}
	public Card(char name, int value, char color) {
		super();
		this.name = name;
		this.value = value;
		this.color = color;
	}
	
}
