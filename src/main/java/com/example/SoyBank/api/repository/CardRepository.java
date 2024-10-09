package com.example.SoyBank.api.repository;

import com.example.SoyBank.api.model.Card;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CardRepository extends JpaRepository<Card, Long> {
    Card findByCardId(String kode);
}
