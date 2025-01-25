package org.pluralsight;

@Configuration
public class SpringConfigFile{
    @Bean
 public Student stdId(){
     Student std=new Student();
     std.setName("Sazid");
        std.setRollno(123);
        std.setEmail("Sazid@gmail.com");
     return std;
 }
}