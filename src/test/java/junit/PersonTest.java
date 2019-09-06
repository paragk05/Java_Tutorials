package junit;

import junit.lesson10.LoggingLevel;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class PersonTest
{

    private static final String[] MY_STATE_VALUES={"PENDING","PROCESSING","PROCESSED"};



    public String []states()
    {
        return Arrays.copyOf(MY_STATE_VALUES,MY_STATE_VALUES.length);
    }



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

    @Test
    public void shouldReturnNumberOfPersonsInLoop()
    {
        int i=0;
        Person person1;

        /*
        while (i<4)
        {
            i++;
        }
        assertEquals(4,Person.numberOfPersons());

         */

        /*

        for (i=0;i<4;i++)
        {
            person1=new Person();
        }

        assertEquals(4,Person.numberOfPersons());

         */

    }

    @Test
    public void demonstrateArray(Person [] persons)
    {


        /*
        for (int i=0;i<persons.length ;i++)
        {
            persons[i] = new Person();
        }

        */
        for (Person person: persons)
        {
            person.helloWorld();
        }

        Person myPerson=new Person();
        Person myPerson2=null;

        final Person []persons2={persons[0],null,myPerson,myPerson2,persons[2],persons[3]};


        LoggingLevel states=LoggingLevel.PROCESSING;

        switch (states)
        {
            case PENDING:
            case PROCESSING:
                callMethod();
                break;
            default:
                break;


        }


        for (LoggingLevel state:LoggingLevel.values())
        {
            if (state == LoggingLevel.PENDING)
            {

            }

            if (state == LoggingLevel.PROCESSING)
            {

            }

            if (state == LoggingLevel.PROCESSED)
            {

            }
        }


    }
}