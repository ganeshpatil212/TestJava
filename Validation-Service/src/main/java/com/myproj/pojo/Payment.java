package com.myproj.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment {

	  private String currency;
	    private String amount;
	    private String branchName;
	    private String locale;
	    private String returnUrl;
	    private String cancelUrl;
	    private int count;
	    private String merchantTxnReference;
	    private String paymentMethod;
	    private String providerId;
	    private String paymentType;
}
