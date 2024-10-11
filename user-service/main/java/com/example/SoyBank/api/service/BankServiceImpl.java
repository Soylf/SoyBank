package com.example.SoyBank.api.service;

import com.example.SoyBank.api.mapper.CardMapper;
import com.example.SoyBank.api.model.Card;
import com.example.SoyBank.api.model.Dto.CardDto;
import com.example.SoyBank.api.model.User;
import com.example.SoyBank.api.repository.CardRepository;
import com.example.SoyBank.api.repository.UserRepository;
import lombok.RequiredArgsConstructor;
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
