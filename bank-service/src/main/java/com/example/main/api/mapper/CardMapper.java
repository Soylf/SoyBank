package com.example.main.api.mapper;

import main.Card;
import main.dto.CardDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CardMapper {
    CardMapper MAPPER = Mappers.getMapper(CardMapper.class);
    CardDto toDto(Card card);
    Card fromDto(CardDto cardDto);
}
