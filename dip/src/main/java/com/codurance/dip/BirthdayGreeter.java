package com.codurance.dip;

import java.time.MonthDay;

public class BirthdayGreeter {
    private final EmployeeRepository employeeRepository;
    private final TimeTable clock;
    private final Sender sender;

    public BirthdayGreeter(EmployeeRepository employeeRepository, TimeTable clock, Sender sender) {
        this.employeeRepository = employeeRepository;
        this.clock = clock;
        this.sender = sender;
    }

    public void sendGreetings() {
        MonthDay today = clock.monthDay();
        employeeRepository.findEmployeesBornOn(today)
        .forEach(sender::send);
    }

}