class EnumDemo {
    public enum Season {SUMMER , WINTER ,SPRING}
    public static void main(String rk[])
    {
    for(Season s: Season.values())
    System.out.println(s);
    }
}
