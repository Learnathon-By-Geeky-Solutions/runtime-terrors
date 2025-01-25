package org.pluralsight;

import com.pluralsight.Service.SpeakerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.pluralsight.config.AppConfig;
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        SpeakerService speakerService = context.getBean("speakerService", SpeakerService.class);
        System.out.println(speakerService);
        SpeakerService speakerServiceB = context.getBean("speakerService", SpeakerService.class);
        System.out.println(speakerServiceB);
        System.out.println(speakerService.findAll().get(0).getFirstName());
    }
}