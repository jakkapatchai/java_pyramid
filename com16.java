class x {
    public static void main(String args []) {
        for (int com=1; com <= 5; com++)
            {
                for (int jakkapat=com; jakkapat >= 1; jakkapat--)
                {
                    System.out.print (jakkapat);
                }
                for (int jakkapat=com; jakkapat <= 4; jakkapat++)
                {
                    System.out.print ("  ");
                }
                for (int jakkapat=com; jakkapat <= 4; jakkapat++)
                {
                    System.out.print ("  ");
                }
                for (int jakkapat=com; jakkapat >= 1; jakkapat--)
                {
                    System.out.print ("*");
                }
            System.out.println();
        }
    }
}