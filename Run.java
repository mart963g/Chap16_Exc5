package Exc_5;

public class Run
{
    public static void main(String[] args)
    {
        LinkedIntList list = new LinkedIntList();
        list.add(3);
        list.add(7);
        list.add(12);
        list.add(13);
        list.set(0,7);
        list.add(13);
        System.out.println(list.countDuplicates());
        System.out.println(list);
    }
}
