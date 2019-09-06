package junit.lesson10;

public enum LoggingLevel
{
    PENDING(1,""), PROCESSING(2,""), PROCESSED(3,"");

    private int p;
    private String s;

    LoggingLevel(int p,String s)
    {
        this.p=p;
        this.s=s;
    }
    public int code()
    {
        return p;
    }
}
