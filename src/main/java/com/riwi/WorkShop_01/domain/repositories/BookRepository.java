package com.riwi.WorkShop_01.domain.repositories;

import com.riwi.WorkShop_01.domain.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
