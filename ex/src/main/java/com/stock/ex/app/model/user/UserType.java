package com.stock.ex.app.model.user;


import lombok.Data;

import javax.persistence.*;
import java.util.UUID;

@Data
@Entity
public class UserType {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    private String type;
    private String description;


}
