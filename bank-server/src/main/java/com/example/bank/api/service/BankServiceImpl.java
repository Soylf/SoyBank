package com.example.bank.api.service;

import com.example.bank.api.mapper.CardMapper;
import com.example.bank.api.model.Card;
import com.example.bank.api.model.User;
import com.example.bank.api.repository.CardRepository;

import com.example.bank.api.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import com.example.bank.api.model.CardDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BankServiceImpl implements BankService {
    private CardRepository cardRepository;
    private UserRepository userRepository;

    @Autowired
    public BankServiceImpl(CardRepository cardRepository, UserRepository userRepository) {
        this.cardRepository = cardRepository;
        this.userRepository = userRepository;
    }

    @Override
    public void createUser(User user) {
        userRepository.save(user);
    }

    @Override
    public void create(CardDto cardDto) {
        cardRepository.save(CardMapper.MAPPER.fromDto(cardDto));
    }

    @Override
    public CardDto getCard(String cardId) {
        Card card = getCardByCardId(cardId);
        return CardMapper.MAPPER.toDto(card);
    }

    private Card getCardByCardId(String kode) {
        return cardRepository.findByCardId(kode);
    }
}
