class Main1 {
    public static void main(String[] rk) {
        int n = 5;
        outer: for (int a = 0; a < n; a++) {
            int i = 0, j = 0;
            System.out.println();
            space: while (true) {
                System.out.println(" ");
                i++;
                if (i == n - a)
                    break space;
            }
            star: while (true) {
                System.out.println("*");
                j++ ;
                if (j == a)
                    continue outer;
            }
        }
    }

}
