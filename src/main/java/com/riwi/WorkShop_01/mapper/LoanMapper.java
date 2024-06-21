package com.riwi.WorkShop_01.mapper;

import com.riwi.WorkShop_01.api.dto.LoanDto;
import com.riwi.WorkShop_01.domain.entities.Loan;
import org.mapstruct.factory.Mappers;

public interface LoanMapper {
    LoanMapper INSTANCE = Mappers.getMapper(LoanMapper.class);
    LoanDto loanToLoanDto(Loan loan);
    Loan loanDtoToLoan(LoanDto loanDto);
}
