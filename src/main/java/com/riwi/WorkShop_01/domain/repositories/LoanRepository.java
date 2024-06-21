package com.riwi.WorkShop_01.domain.repositories;

import com.riwi.WorkShop_01.domain.entities.Loan;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoanRepository extends JpaRepository<Loan, Long> {
}
