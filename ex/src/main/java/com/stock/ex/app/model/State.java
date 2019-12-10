package com.stock.ex.app.model;

import lombok.Data;

import javax.persistence.*;
import java.util.UUID;

@Data
@Entity
public class State {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    private String linkStat;


    private String name;
}
