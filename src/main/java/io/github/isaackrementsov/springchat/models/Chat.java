package io.github.isaackrementsov.springchat.models;

import javax.persistence.*;
import java.util.Set;
import java.util.HashSet;

@Entity
public class Chat {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    @ManyToMany
    @JoinTable(
        name="chat_user",
        joinColumns=@JoinColumn(name="user_id"),
        inverseJoinColumns=@JoinColumn(name="chat_id")
    )
    private Set<User> members = new HashSet<>();
    @OneToMany(mappedBy="chat")
    private Set<Message> messages = new HashSet<>();
    public Chat(String name, Set<User> members){
        this.name = name;
        this.members = members;
    }
    public Long getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public Set<User> getMembers(){
        return members;
    }
    public Set<Message> getMessages(){
        return messages;
    }
    public void setId(Long id){
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setMembers(Set<User> members){
        this.members = members;
    }
    public void setMessages(Set<Message> messages){
        this.messages = messages;
    }
}
