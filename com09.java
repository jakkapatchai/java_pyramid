class x {
    public static void main(String args []) {
        for (int com=1; com <= 5; com++)
            {
                for (int jakkapat=1; jakkapat <= com; jakkapat++)
                {
                   System.out.print (" ");
                }
                 for (int jakkapat=4; jakkapat >= com; jakkapat--)
                {
                   System.out.print (com);
                }
               System.out.print (com);
                for (int jakkapat=4; jakkapat >= com; jakkapat--)
                {
                   System.out.print (com);
                }           
            System.out.println();
        }
    }
}