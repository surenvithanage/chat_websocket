package com.ulpatha.web.chat.dto;

public class ChatMessageDto {
  private String contents;

  private long fromUserId;

  private long toUserId;

  private long postId;

  private String timesent;

  public ChatMessageDto(){}

  public ChatMessageDto(String contents, long fromUserId, long toUserId, long postId, String timesent) {
    this.contents = contents;
    this.fromUserId = fromUserId;
    this.toUserId = toUserId;
    this.postId = postId;
    this.timesent = timesent;
  }

  public String getContents() {
    return this.contents;
  }

  public void setToUserId(long toUserId) {
    this.toUserId = toUserId;
  }

  public long getToUserId() {
    return this.toUserId;
  }

  public void setContents(String contents) {
    this.contents = contents;
  }

  public void setFromUserId(long userId) {
    this.fromUserId = userId;
  }

  public long getFromUserId() {
    return this.fromUserId;
  }

  public long getPostId() {
    return postId;
  }

  public void setPostId(long postId) {
    this.postId = postId;
  }

  public String getTimesent() {
    return timesent;
  }

  public void setTimesent(String timesent) {
    this.timesent = timesent;
  }
}
