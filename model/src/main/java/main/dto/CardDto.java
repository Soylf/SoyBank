package main.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import main.User;

@Data
@AllArgsConstructor
@Builder
public class CardDto {
    private long id;
    private int pinKod;
    private String textKod;
    private String cardId;
    private User user;
}
