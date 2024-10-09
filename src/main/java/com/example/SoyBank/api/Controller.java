package com.example.SoyBank.api;


import com.example.SoyBank.api.model.Dto.CardDto;
import com.example.SoyBank.api.model.User;
import com.example.SoyBank.api.service.BankService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/map")
public class Controller {
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
    public CardDto getCard (@RequestHeader String cardId) {
        return service.getCard(cardId);
    }
}
