package com.example.javaseeker;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class User {

@Id	
int id;

@Column
String name;

@Column
int age;

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
} 

}
