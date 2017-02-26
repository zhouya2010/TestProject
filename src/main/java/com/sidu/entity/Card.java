package com.sidu.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by junjun on 2017/2/26.
 */
@Entity
@Table(name = "t_card")
public class Card implements Serializable{
    private int id;
    private String card;
    private User user;

    @Id
    @GeneratedValue
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "card")
    public String getCard() {
        return card;
    }

    public void setCard(String card) {
        this.card = card;
    }

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "user_name")
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
