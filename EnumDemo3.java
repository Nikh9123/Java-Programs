enum MonthWithDays{
    January(31) , February(28),march(30);
    int days ;
    MonthWithDays(int a){days = a;}
}

class EnumDemo3 {
    public static void main(String month[])
    {
        for(MonthWithDays s: MonthWithDays.values())
        {
            System.out.println(s + " " + s.days);
            // System.out.print();
        }
    }
}
