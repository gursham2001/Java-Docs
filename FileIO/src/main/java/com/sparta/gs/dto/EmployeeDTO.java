package com.sparta.gs.dto;

// DTO is a date transfer object

// Emp ID, name, Prefix, First Name, Middle initial, Last Name, gender, email, date of birth, date of joining, salary
// The things above are the fields we need in our csv

// Read as String - convert getter
// Read correct type = convert constructor

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class EmployeeDTO {
    private String empID;
    private String namePrefix;
    private String firstName;
    private String middleInitial;
    private String lastName;
    private String gender; // using Character so we can use the methods with it
    private String email;
    private LocalDate dateOfBirth;
    private LocalDate dateOfJoining;
    private Float salary;

    public EmployeeDTO(String empID, String namePrefix, String firstName, String middleInitial,
                       String lastName, String gender, String email, String dateOfBirth,
                       String dateOfJoining, String salary) {
        this.empID = empID;
        this.namePrefix = namePrefix;
        this.firstName = firstName;
        this.middleInitial = middleInitial;
        this.lastName = lastName;
        this.gender = gender;
        this.email = email;
        // we convert what will come in as a string to the correct format
        this.dateOfBirth = LocalDate.parse(dateOfBirth , DateTimeFormatter.ofPattern("M/d/uuuu"));
        this.dateOfJoining = LocalDate.parse(dateOfJoining , DateTimeFormatter.ofPattern("M/d/uuuu"));
        this.salary = Float.valueOf(salary);
    }

    public String getEmpID() {
        return empID;
    }
    public String getNamePrefix() {
        return namePrefix;
    }
    public static String getFirstName() {
        return firstName;
    }
    public String getMiddleInitial() {
        return middleInitial;
    }
    public String getLastName() {
        return lastName;
    }
    public String getGender() {
        return gender;
    }
    public String getEmail() {
        return email;
    }
    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }
    public LocalDate getDateOfJoining() {
        return dateOfJoining;
    }
    public Float getSalary() {
        return salary;
    }

}
