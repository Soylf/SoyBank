package com.example.bank.api.service;

import com.example.bank.api.model.CardDto;
import com.example.bank.api.model.User;

public interface BankService {
    void createUser(User user);

    void create(CardDto cardDto);

     CardDto getCard(String cardId);
}
