package com.example.SpringJBDCConnection.service;

import com.example.SpringJBDCConnection.model.Speaker;

import java.util.List;

public interface SpeakerService {
    List<Speaker> findAll();

    Speaker create(Speaker speaker);
}
