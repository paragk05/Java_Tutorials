package junit;

import junit.lesson3.Name;

public class Person
{
    private Name personName;

    public Person()
    {
        /*Empty on purpose- default constructor*/
    }

    public Person(Name personName)
    {
        this.personName=personName;
    }

    public String helloWorld()
    {
        return "Hello World";
    }

    public String hello(String name) {

        return "Hello "+name;
    }
}
