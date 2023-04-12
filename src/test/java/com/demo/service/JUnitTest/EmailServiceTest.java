package com.demo.service.JUnitTest;

import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

//@RunWith(MockitoJUnitRunner.class)
public class EmailServiceTest {

    Order o = new Order(2, "Pizza", 150);

    EmailService emailService = new EmailService();

    @Test
    public void testSendEmail_ThrowException()
    {
        try
        {
            emailService.sendEmail(o);
        }
        catch(RuntimeException e)
        {
            System.out.println("RunTime Exception occured : " + e.toString());
        }
    }

    @Test
    public void testSendEmail_ReturnTrue()
    {
        assertTrue("Customer Set Notified", emailService.sendEmail(o, "Sending Order Object"));
    }

}