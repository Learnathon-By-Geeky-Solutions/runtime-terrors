package com.example.SpringJBDCConnection.repository;

import com.example.SpringJBDCConnection.model.Speaker;

import java.util.List;

public interface SpeakerRepository {
    List<Speaker> findAll();

    Speaker create(Speaker speaker);
}
