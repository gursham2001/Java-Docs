package com.sparta.gs;

import com.sparta.gs.dto.EmployeeDTO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

// Storing of employee data
// iteration - filtering

public class App {
    public static void main(String[] args) {
                ArrayList<EmployeeDTO> employees = new ArrayList<>();

                try {
                    var fileReader = new FileReader("src/main/resources/EmployeeRecords.csv");
                    var bufferedReader = new BufferedReader(fileReader);
                    bufferedReader.readLine();
                    for (String line = bufferedReader.readLine(); line != null; line = bufferedReader.readLine()) {
                        String[] records = line.split(",");
                        EmployeeDTO employeeDTO = new EmployeeDTO(
                                records[0],
                                records[1],
                                records[2],
                                records[3],
                                records[4],
                                records[5],
                                records[6],
                                records[7],
                                records[8],
                                records[9]
                        );
                        employees.add(employeeDTO);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
                System.out.println(EmployeeDTO.getFirstName());
            }
        }
