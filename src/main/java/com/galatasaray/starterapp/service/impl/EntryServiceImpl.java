package com.galatasaray.starterapp.service.impl;

import com.galatasaray.starterapp.model.Entry;
import com.galatasaray.starterapp.repository.EntryRepository;
import com.galatasaray.starterapp.service.EntryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EntryServiceImpl implements EntryService {

    private EntryRepository entryRepository;

    @Autowired
    public EntryServiceImpl(EntryRepository entryRepository) {
        this.entryRepository = entryRepository;
    }

    @Override
    public Entry findById(Long id) {
        return entryRepository.findById(id).get();
    }
}
