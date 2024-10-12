package com.example.main.api.service;

import main.User;
import main.dto.CardDto;

public interface BankService {
     void create(CardDto cardDto);

     CardDto getCard(String cardId);

    void createUser(User user);
}
