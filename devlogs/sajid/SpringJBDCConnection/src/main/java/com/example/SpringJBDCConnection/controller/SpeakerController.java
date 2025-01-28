package com.example.SpringJBDCConnection.controller;

import com.example.SpringJBDCConnection.model.Speaker;
import com.example.SpringJBDCConnection.service.SpeakerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SpeakerController {

    private SpeakerService speakerService;

    public SpeakerController(SpeakerService speakerService) {
        this.speakerService = speakerService;
    }
    @PutMapping("/speakers")
    public Speaker createSpeaker(@RequestBody Speaker speaker) {
        System.out.println("Name: " + speaker.getName());
        return speakerService.create(speaker);
    }
    @GetMapping("/speakers")
    public List<Speaker> getSpeakers() {
        return speakerService.findAll();
    }
}
