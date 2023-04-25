package com.dxc.hms.entity;
import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Component
@Entity

public class GuestInfo {

	    @Id
	    private int id;
	    private String name;
	    private String email;
	    private String phoneNo;
	    
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
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getPhoneNo() {
			return phoneNo;
		}
		public void setPhoneNo(String phoneNo) {
			this.phoneNo = phoneNo;
		}
		@Override
		public String toString() {
			return "GuestInfo [id=" + id + ", name=" + name + ", email=" + email + ", phoneNo=" + phoneNo + "]";
		}
	    
		
	    
}
