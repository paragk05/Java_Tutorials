package junit;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersonTest
{
    @Test
    public void shouldReturnWorld()
    {
        Person p= new Person();
        assertEquals("Hello World",p.helloWorld());
    }

}