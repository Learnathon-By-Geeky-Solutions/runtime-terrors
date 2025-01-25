package org.Learnathon.BeanLifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class File {
    private String name;
    private double size;

    public File() {
        System.out.println("File Constructor called");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }
    @PostConstruct
    public void start(){
        System.out.println("Start method called for File");
    }
    @PreDestroy
    public void stop(){
        System.out.println("Stop method called for File");
    }
}
