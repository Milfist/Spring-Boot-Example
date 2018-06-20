package com.milfist.poc.controller;

import com.milfist.poc.service.MyService;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.verify;

public class ControllerTest {

    private MyController controller;

    private MyService service;

    @Before
    public void init(){
        service = mock(MyService.class);
        controller = new MyController(service);
    }

    @Test
    public void sampleControllerShouldCallService() {
        String userName = "username";
        String expectedMessage = "message";

        when(service.Welcome(userName)).thenReturn(expectedMessage);

        String message = controller.Welcome(userName);

        verify(service).Welcome(userName);
        assertTrue(message.equals(expectedMessage));
    }
}
