package com.galatasaray.starterapp.service.impl;

import com.galatasaray.starterapp.model.Topic;
import com.galatasaray.starterapp.repository.TopicRepository;
import com.galatasaray.starterapp.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicServiceImpl implements TopicService {

    private TopicRepository topicRepository;

    @Autowired
    public TopicServiceImpl(TopicRepository topicRepository) {
        this.topicRepository = topicRepository;
    }

    @Override
    public Topic findById(Long id) {
        return topicRepository.findById(id).get();
    }

    @Override
    public void save(Topic topic) {
        topicRepository.save(topic);
    }

    @Override
    public Topic update(Topic topic) {
        return topicRepository.save(topic);
    }

    @Override
    public void deleteById(Long id) {
        topicRepository.deleteById(id);
    }
}
