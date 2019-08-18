package com.galatasaray.starterapp.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "topic")
public class Topic implements Serializable {

    @Id
    @Column(name = "topicId")
    private Long topicId;

    @Column(name = "topic_name")
    private String topicName;

    @Column(name = "url")
    private String url;

    public Long getTopicId() {
        return topicId;
    }

    public void setTopicId(Long topicId) {
        this.topicId = topicId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTopicName() {
        return topicName;
    }

    public void setTopicName(String topicName) {
        this.topicName = topicName;
    }
}
