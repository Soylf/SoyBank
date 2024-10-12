package com.example.main.api.service;

import com.example.main.api.mapper.CardMapper;
import main.Card;
import main.User;
import com.example.main.api.repository.CardRepository;
import com.example.main.api.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import main.dto.CardDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BankServiceImpl implements BankService {
    private CardRepository cardRepository;
    private UserRepository userRepository;

    @Autowired
    public BankServiceImpl(UserRepository userRepository, CardRepository cardRepository) {
        this.userRepository = userRepository;
        this.cardRepository = cardRepository;
    }

    @Override
    public void create(CardDto cardDto) {
        cardRepository.save(CardMapper.MAPPER.fromDto(cardDto));
    }
    @Override
    public void createUser(User user) {
        userRepository.save(user);
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
