package com.example.SoyBank.api.mapper;

import com.example.SoyBank.api.model.Card;
import com.example.SoyBank.api.model.Dto.CardDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CardMapper {
    CardMapper MAPPER = Mappers.getMapper(CardMapper.class);
    CardDto toDto(Card card);
    Card fromDto(CardDto cardDto);
}
