package com.galatasaray.starterapp.controller;

import com.galatasaray.starterapp.model.Topic;
import com.galatasaray.starterapp.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/topic")
public class TopicController {

    private TopicService topicService;

    @Autowired
    public TopicController(TopicService topicService) {
        this.topicService = topicService;
    }

    @RequestMapping(path = "/{id}",method = RequestMethod.GET)
    public Topic getTopicById(@PathVariable("id") Long id){
        return topicService.findById(id);
    }
}
