package com.example.bank.api.repository;

import com.example.bank.api.model.Card;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CardRepository extends JpaRepository<Card, Long> {
    Card findByCardId(String kode);
}
