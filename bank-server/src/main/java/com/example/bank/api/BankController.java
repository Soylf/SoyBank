package com.example.bank.api;

import com.example.bank.api.model.User;
import com.example.bank.api.service.BankService;
import lombok.RequiredArgsConstructor;
import com.example.bank.api.model.CardDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/map")
public class BankController {
    @Autowired
    private BankService service;

    @PostMapping("/card")
    public ResponseEntity<Void> createCard(@RequestBody CardDto cardDto) {
        service.create(cardDto);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/user")
    public ResponseEntity<Void> createUser(@RequestBody User user) {
        service.createUser(user);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/card")
    public CardDto getCard(@RequestHeader String cardId) {
        return service.getCard(cardId);
    }
}
