class EnumDemo {
    public enum Season {SUMMER , WINTER,RAINY,SPRING}
    public static void main(String shr[])
    {
    for(Season s: Season.values())
    System.out.println(s);
    }
}
