class x {
    public static void main(String args []) {
        for (int com=1; com <= 3; com++)
        {
            for (int jakkapat=com; jakkapat <= 3; jakkapat++)
            {
                System.out.print (jakkapat);
            }
            for (int jakkapat=1; jakkapat <= com; jakkapat++)
            {
               System.out.print ("*");  
            }
            for (int jakkapat=2; jakkapat <= com; jakkapat++)
            {
                System.out.print ("*");
            }
            for (int jakkapat=3; jakkapat >= com; jakkapat--)
            {
                System.out.print (jakkapat);
            }
                
            System.out.println();
            }
        for (int com=2; com >= 1; com--)
        {
            for (int jakkapat=com; jakkapat <= 3; jakkapat++)
            {
                System.out.print (jakkapat);
            }
            for (int jakkapat=1; jakkapat <= com; jakkapat++)
            {
                System.out.print ("*");
            }
            for (int jakkapat=1; jakkapat <= com -1; jakkapat++)
            {
                System.out.print ("*");
            }
            for (int jakkapat=3; jakkapat >= com; jakkapat--)
            {
                System.out.print (jakkapat);
            }
            System.out.println();
        }
    }
}