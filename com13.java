class x {
    public static void main(String args []) {
        for (int com=1; com <= 5; com++)
            {
                for (int jakkapat=2; jakkapat <= com; jakkapat++)
                {
                    System.out.print (" ");
                }for (int jakkapat=1; jakkapat <= com; jakkapat++)
                {
                    System.out.print (" ");
                }
                        
                for (int jakkapat=com; jakkapat <= 10-com; jakkapat++)
                {
                    System.out.print (11-jakkapat-com);
                }
            System.out.println();
        }
    }
}