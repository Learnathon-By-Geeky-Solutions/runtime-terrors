package com.pluralsight.repository;

import com.pluralsight.model.Speaker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
@Repository("speakerRepository")
public class StubSpeakerRepositoryImpl implements SpeakerRepository {
    private Calendar cal;
    @Autowired
    public void setCal(Calendar cal)
    {
        this.cal=cal;
    }
    @Override
    public List<Speaker>findAll(){
        List<Speaker> speakers = new ArrayList<Speaker>();
        Speaker speaker=new Speaker();
        speaker.setFirstName("John");
        speaker.setLastName("Smith");
        speakers.add(speaker);
        System.out.println("cal: "+cal.getTime());
        return speakers;
    }
}
