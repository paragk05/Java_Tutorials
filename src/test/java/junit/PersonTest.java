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

    @Test
    public void demonstrateBoolean()
    {
        /*
        boolean monday=false;
        boolean raining=true;
        boolean tuesday=true;
        boolean sunny=false;
        boolean friday=true;


        if ((monday && raining) || (tuesday && sunny))
        {
            drinkFizz();
        }
        else if(friday)
        {
          drinkWater();
        }
        else
        {
            drinkMilk();
        }
        */

        int i=4,j=3;
        boolean monday = true;

        if(i>j)
        {
            i=99;
        }
        else if(j>i)
        {
            i=9;
        }
        else if(monday==true)
        {
            j--;
        }
    }
}