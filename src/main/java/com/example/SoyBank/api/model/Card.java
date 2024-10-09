package com.example.SoyBank.api.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Setter
@Getter
@AllArgsConstructor
@Builder
@Entity
@Table(name = "card")
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private int pinKod;
    private String textKod;
    private String cardId;
    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)  // user_id будет внешним ключом
    private User user;
}
