class x {
    public static void main(String args []) {
        for (int com=1; com <= 5; com++)
            {
                for (int jakkapat=5; jakkapat >= com; jakkapat--)
                {
                    System.out.print (" ");
                }
                 for (int jakkapat=1; jakkapat <= com; jakkapat++)
                {
                    System.out.print (jakkapat);
                }
                System.out.print (6-com);
                for (int jakkapat=com; jakkapat >= 1; jakkapat--)
                {
                    System.out.print (jakkapat);
                }
            System.out.println();
        }
    }
}