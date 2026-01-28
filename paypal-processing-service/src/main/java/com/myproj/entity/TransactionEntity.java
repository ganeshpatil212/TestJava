package com.myproj.entity;


import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TransactionEntity {

    private Long id;
    private Long userId;

    private Long paymentMethodId;
    private Long providerId;
    private Long paymentTypeId;

    private Double amount;
    private String currency;

    private Long txnStatus;

    private String merchantTransactionReference;
    private String txnReference;

    private String providerCode;
    private String providerMessage;
    private String providerReference;

//    private LocalDateTime createdDate;
//    private LocalDateTime updatedDate;

    private Integer retryCount;
}

