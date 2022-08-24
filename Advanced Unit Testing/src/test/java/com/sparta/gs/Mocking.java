package com.sparta.gs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InOrder;
import org.mockito.Mockito;

import java.time.LocalDate;

public class Mocking {

    private static Spartan mockSpartan;

    @BeforeAll
    static void init() {
        mockSpartan = Mockito.mock(Spartan.class);
    }

    @Test
    @DisplayName("Testing spartan repo print method")
    void testingSpartanPrintMethod() {
        // creating fake spartan object
        SpartanRepository.addSpartan(mockSpartan);
        Mockito.when(mockSpartan.toString()).thenReturn("Found Mock Spartan"); // when someone calls mockSpartans to string method then return
        // Mockito.doReturn("Found Mock Spartan").when(mockSpartan.toString()); // similar to using .when But more used for spys than for mocks
        // Mockito.doThrow(NullPointerException.class).when(mockSpartan).setId(Mockito.anyInt()); // if anoyone throws setId with any int we throw this error
        System.out.println(SpartanRepository.getAllSpartans());
        Assertions.assertEquals("Found Mock Spartan" + "\n", SpartanRepository.getAllSpartans());
        Mockito.verify(mockSpartan, Mockito.times(1)).toString(); // to use .verify we call the thing we want to verify and then a verification mode
    }

    @Test
    @DisplayName("Testing Method Order")
    void testingMethodOrder() {
        Mockito.when(mockSpartan.getStartDate())
                .thenReturn(LocalDate.now())
                .thenReturn(LocalDate.MAX);

        System.out.println(mockSpartan.getStartDate());
        System.out.println(mockSpartan.getStartDate());
    }

    @Test
    @DisplayName("CheckThatGetIDMethodIsCalledOnOurMock")
    void CheckThatGetIDMethodIsCalledOnOurMock() {
        SpartanRepository.addSpartan(mockSpartan);
        String spartanName = SpartanRepository.findSpartan(1).get().getName();
        Mockito.verify(mockSpartan, Mockito.times(1)).getId();
        // .times allows us to see if the method is called the number of times we want to
        // verifying the mock is treated as we want it to be treated
    }

    @Test
    @DisplayName("Check spartan method are called in the right order")
    void CheckSpartanMethodAreCalledInTheRightOrder() {
        mockSpartan.setName("Manish");
        mockSpartan.setCourse("c#");
        System.out.println(mockSpartan.getName() + " " + mockSpartan.getCourse());

        // verifying is a Assertions method so if we are verifying we dont use Assertions
        InOrder inOrder = Mockito.inOrder(mockSpartan);
        inOrder.verify(mockSpartan).setCourse("c#");
        inOrder.verify(mockSpartan).setName("Manish");
        inOrder.verify(mockSpartan).getCourse();
        inOrder.verify(mockSpartan).getName();
    }

}
