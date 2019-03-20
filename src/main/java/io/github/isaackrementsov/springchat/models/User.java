package io.github.isaackrementsov.springchat.models;

import javax.persistence.*;
import java.util.Set;
import java.util.HashSet;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String username;
    private String password;
    @ManyToMany(mappedBy="users")
    private Set<Chat> chats = new HashSet<>();
    public User(String username, String password, Set<Chat> chats){
        this.username = username;
        this.password = password;
        this.chats = chats;
    }
    public Long getId(){
        return id;
    }
    public String getUsername(){
        return username;
    }
    public String getPassword(){
        return password;
    }
    public Set<Chat> getChats(){
        return chats;
    }
    public void setId(Long id){
        this.id = id;
    }
    public void setUsername(String username){
        this.username = username;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public void setChats(Set<Chat> chats){
        this.chats = chats;
    }
}