package org.pluralsight;

import com.pluralsight.Service.SpeakerService;
import com.pluralsight.Service.SpeakerServiceImpl;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        SpeakerService speakerService=new SpeakerServiceImpl();
        System.out.println(speakerService.findAll().get(0).getFirstName());
    }
}