package com.riwi.WorkShop_01.mapper;

import com.riwi.WorkShop_01.api.dto.BookDto;
import com.riwi.WorkShop_01.domain.entities.Book;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BookMapper {
    BookMapper INSTANCE = Mappers.getMapper(BookMapper.class);
    BookDto bookToBookDto(Book book);
    Book bookDtoToBook(BookDto bookDto);
}
