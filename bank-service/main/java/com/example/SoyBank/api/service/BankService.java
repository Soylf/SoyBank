package com.example.SoyBank.api.service;

import com.example.SoyBank.api.model.Dto.CardDto;
import com.example.SoyBank.api.model.User;

public interface BankService {
     void create(CardDto cardDto);

     CardDto getCard(String cardId);

    void createUser(User user);
}
