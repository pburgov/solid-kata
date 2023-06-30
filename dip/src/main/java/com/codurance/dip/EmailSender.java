package com.codurance.dip;

public class EmailSender implements Sender{
    @Override
    public void send(Employee employee) {
        String message = String.format("To:%1s, Subject: Happy birthday!, Message: Happy birthday, dear %2s!",
                employee.getEmail(), employee.getFirstName());


        System.out.println(message);
    }
}
