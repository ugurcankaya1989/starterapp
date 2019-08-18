package com.galatasaray.starterapp.controller;

import com.galatasaray.starterapp.model.Entry;
import com.galatasaray.starterapp.service.EntryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/entry")
public class EntryController {

    private EntryService entryService;

    @Autowired
    public EntryController(EntryService entryService) {
        this.entryService = entryService;
    }

    @RequestMapping(path = "/{id}", method=RequestMethod.GET)
    public Entry getEntry(@PathVariable("id")Long id){
        return entryService.findById(id);
    }
}
