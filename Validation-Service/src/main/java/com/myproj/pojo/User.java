package com.myproj.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
	 private String firstName;
	    private String lastName;
	    private String email;
	    private String phone;

}
