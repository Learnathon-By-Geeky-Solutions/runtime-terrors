package org.Learnathon.SetterInjection;

import java.util.Map;

public class Question {
    private int id;
    private String name;
//    private List<Answer> answers;
    private Map<String,String> answers;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
//This is for the Setter Injection with Non-String Collection (having Dependent Object) Example
//    public List<Answer> getAnswers() {
//        return answers;
//    }
//
//    public void setAnswers(List<Answer> answers) {
//        this.answers = answers;
//    }

    public Map<String, String> getAnswers() {
        return answers;
    }

    public void setAnswers(Map<String, String> answers) {
        this.answers = answers;
    }

    public void displayInfo()
    {
        System.out.println("Question id: "+id);
        System.out.println("Question name: "+name);
        System.out.println("Answers....");
        for(Map.Entry<String,String> entry:answers.entrySet())
        {
            System.out.println("Answer: "+entry.getKey()+" Posted By: "+entry.getValue());
        }
//        for(Answer ans:answers)
//        {
//            System.out.println(ans);
//        }
    }


}
