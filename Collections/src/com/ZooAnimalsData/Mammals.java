package com.ZooAnimalsData;

public class Mammals implements ZooAnimals {

String name;
String color;
String food;


public Mammals(String name, String color, String food) {
	
	this.name = name;
	this.color = color;
	this.food = food;
}


public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public String getColor() {
	return color;
}


public void setColor(String color) {
	this.color = color;
}


public String getFood() {
	return food;
}


public void setFood(String food) {
	this.food = food;
}


@Override
public String toString() {
	return "Mammals [name=" + name + ", color=" + color + ", food=" + food + "]";
}






}
