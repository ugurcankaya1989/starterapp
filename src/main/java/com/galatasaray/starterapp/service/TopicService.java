package com.galatasaray.starterapp.service;


import com.galatasaray.starterapp.model.Topic;

public interface TopicService {
    Topic findById(Long id);
    void save(Topic topic);
    Topic update(Topic topic);
    void deleteById(Long id);
}
