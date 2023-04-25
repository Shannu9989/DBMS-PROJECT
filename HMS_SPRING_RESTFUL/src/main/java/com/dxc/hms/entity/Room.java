package com.dxc.hms.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;


@Component
@Entity
public class Room implements Serializable {
	
	@Id
	private int rno;
	private String roomtype;
	private double price;
	
	public String getRoomtype() {
		return roomtype;
	}
	public void setRoomtype(String roomtype) {
		this.roomtype = roomtype;
	}
	public int getRno() {
		return rno;
	}
	public void setRno(int rno) {
		this.rno = rno;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Room [rno=" + rno + ", roomtype=" + roomtype + ", price=" + price + "]";
	}
	
	
	
	
	 
	
	
	

}
