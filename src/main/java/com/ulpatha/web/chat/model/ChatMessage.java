package com.ulpatha.web.chat.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Table(name="chatMessage")
public class ChatMessage {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;

  @OneToOne
  @JoinColumn(name = "authorUserId")
  private User authorUser;

  @OneToOne
  @JoinColumn(name = "recipientUserId")
  private User recipientUser;

  @NotNull
  private Date timeSent;

  @NotNull
  private String contents;

  @NotNull
  private long postId;


  public ChatMessage() {}

  public ChatMessage(User authorUser, User recipientUser, String contents, long postId) {
    this.authorUser = authorUser;
    this.recipientUser = recipientUser;
    this.contents = contents;
    this.timeSent = new Date();
    this.postId = postId;
  }

  public long getId() {
    return this.id;
  }

  public User getAuthorUser() {
    return this.authorUser;
  }

  public User getRecipientUser() {
    return this.recipientUser;
  }

  public void setAuthorUser(User user) {
    this.recipientUser = user;
  }

  public void setRecipientUser(User user) {
    this.authorUser = user;
  }

  public Date getTimeSent() {
    return this.timeSent;
  }

  public String getContents() {
    return this.contents;
  }

  public long getPostId() {
    return postId;
  }

  public void setPostId(long postId) {
    this.postId = postId;
  }
}
