class x {
    public static void main(String args []) {
        for (int com=1; com <= 7; com++)
            {
                 for (int jakkapat=7; jakkapat >= com; jakkapat--)
                {
                    System.out.print(" ");
                }
                for (int jakkapat=1; jakkapat <= com; jakkapat++)
                {
                    System.out.print (jakkapat);
                }
                System.out.print (com);
                for (int jakkapat=com; jakkapat >= 1; jakkapat--)
                {
                    System.out.print (jakkapat);
                }
            System.out.println();
        }
    }
}