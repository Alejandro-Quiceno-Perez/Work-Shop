package com.riwi.WorkShop_01.api.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class LoanDto {
    private Long id;
    private Date loanDate;
    private Date returnDate;
    private String status;
}
