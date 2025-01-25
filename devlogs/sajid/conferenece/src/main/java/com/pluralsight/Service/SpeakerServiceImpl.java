package com.pluralsight.Service;

import com.pluralsight.model.Speaker;
import com.pluralsight.repository.SpeakerRepository;
import com.pluralsight.repository.StubSpeakerRepositoryImpl;
import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {

    private SpeakerRepository speakerRepository=new StubSpeakerRepositoryImpl();
    @Override
    public List<Speaker> findAll()
    {
        return speakerRepository.findAll();
    }
}
