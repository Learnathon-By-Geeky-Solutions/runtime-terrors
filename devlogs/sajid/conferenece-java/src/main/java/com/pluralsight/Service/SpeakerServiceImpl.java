package com.pluralsight.Service;

import com.pluralsight.model.Speaker;
import com.pluralsight.repository.SpeakerRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("speakerService")
@Scope(value = BeanDefinition.SCOPE_SINGLETON)
public class SpeakerServiceImpl implements SpeakerService {
    private SpeakerRepository speakerRepository;
    public SpeakerServiceImpl() {
        System.out.println("SpeakerServiceImpl no args constructor");
    }
    public SpeakerServiceImpl(SpeakerRepository speakerRepository) {
        System.out.println("SpeakerServiceImpl repository constructor");
        this.speakerRepository = speakerRepository;
    }
    @PostConstruct
    private void initialize()
    {
        System.out.println("We're called after the constructors");
    }

    @Override
    public List<Speaker> findAll()
    {
        return speakerRepository.findAll();
    }

    @Autowired
    public void setSpeakerRepository(SpeakerRepository speakerRepository) {
        System.out.println("SpeakerServiceImpl setter");
        this.speakerRepository = speakerRepository;
    }

}
