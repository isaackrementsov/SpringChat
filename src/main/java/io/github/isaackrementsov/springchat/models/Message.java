package io.github.isaackrementsov.springchat.models;

import javax.persistence.*;
import java.util.Set;
import java.util.HashSet;

@Entity
public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String data;
    @ManyToOne
    @JoinColumn(name="cart_id", nullable=false)
    private Chat chat;
    public Message(String data, Chat chat){
        this.data = data;
        this.chat = chat;
    }
    public Long getId(){
        return id;
    }
    public String getData(){
        return data;
    }
    public Chat getChat(){
        return chat;
    }
    public void setId(Long id){
        this.id = id;
    }
    public void setData(String data){
        this.data = data;
    }
    public void setChat(Chat chat){
        this.chat = chat;
    }
}
