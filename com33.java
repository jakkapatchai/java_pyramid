class x {
    public static void main(String args []) {
        for (int com=1; com <= 3; com++)
            {
                for (int jakkapat=3; jakkapat >= com; jakkapat--)
                {
                    System.out.print (" ");
                }
                for (int jakkapat=1; jakkapat <= com; jakkapat++)
                {
                    System.out.print ("*");
                }
                for (int jakkapat=2; jakkapat <= com; jakkapat++)
                {
                    System.out.print ("*");
                }
                
            System.out.println();
            }
            for (int com=1; com <= 2; com++)
            {
                for (int jakkapat=1; jakkapat <= com+1; jakkapat++)
                {
                    System.out.print (" ");
                }
                for (int jakkapat=com; jakkapat <= 2; jakkapat++)
                {
                    System.out.print ("*");
                }
                for (int jakkapat=com; jakkapat <= 1; jakkapat++)
                {
                    System.out.print ("*");
                }
            System.out.println();
        }
    }
}