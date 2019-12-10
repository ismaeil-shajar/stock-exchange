package com.stock.ex.app.model.user;

import lombok.Data;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.util.UUID;


@Data
@Entity
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
//
//    @OneToOne
//    @JoinColumn(name = "user_credential_id")
//    private UserCredential userCredential;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "user_type_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private UserType userType;




}
