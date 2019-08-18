package com.galatasaray.starterapp.model;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "entry")
public class Entry implements Serializable {

    @Id
    @Column(name = "entry_id",nullable = false)
    private Long id;
    @Column(name = "author")
    private String author;
    @Column(name = "comment",columnDefinition = "text")
    private String comment;
    @Column(name = "dic_entry_id")
    private Long entryId;
    @Column(name = "entry_date")
    private LocalDateTime entryDate;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "topic_id")
    private Topic topic;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Long getEntryId() {
        return entryId;
    }

    public void setEntryId(Long entryId) {
        this.entryId = entryId;
    }

    public LocalDateTime getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(LocalDateTime entryDate) {
        this.entryDate = entryDate;
    }

    public Topic getTopic() {
        return topic;
    }

    public void setTopic(Topic topic) {
        this.topic = topic;
    }


    @Override
    public String toString() {
        return getId().toString();
    }
}

