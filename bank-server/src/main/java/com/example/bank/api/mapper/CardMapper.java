package com.example.bank.api.mapper;

import com.example.bank.api.model.Card;
import com.example.bank.api.model.CardDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CardMapper {
    CardMapper MAPPER = Mappers.getMapper(CardMapper.class);
    CardDto toDto(Card card);
    Card fromDto(CardDto cardDto);
}
