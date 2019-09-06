package junit;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersonTest
{
    @Test
    public void shouldReturnWorld ()
    {
        Person p= new Person();
        assertEquals("Hello World",p.helloWorld());
    }

    @Test
    public void shouldReturnHelloParag ()
    {
        Person person=new Person();

        assertEquals("Hello Parag",person.hello("Parag"));
    }

    @Test
    public void shouldReturnNumberOfPersons()
    {
        Person person1=new Person();
        Person person2=new Person();
        Person person3=new Person();
        Person person4=new Person();


        assertEquals(4,Person.numberOfPersons());

    }
}