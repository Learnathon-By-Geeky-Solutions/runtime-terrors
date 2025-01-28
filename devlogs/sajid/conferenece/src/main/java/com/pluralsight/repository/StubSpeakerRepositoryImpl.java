package com.pluralsight.repository;

import com.pluralsight.model.Speaker;

import java.util.ArrayList;
import java.util.List;

public class StubSpeakerRepositoryImpl implements SpeakerRepository {

    @Override
    public List<Speaker>findAll(){
        List<Speaker> speakers = new ArrayList<Speaker>();
        Speaker speaker=new Speaker();
        speaker.setFirstName("John");
        speaker.setLastName("Smith");
        speakers.add(speaker);
        return speakers;
    }
}
