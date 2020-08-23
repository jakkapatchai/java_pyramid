class x {
    public static void main(String args []) {
        for (int com=1; com <= 7; com++)
            {
                 for (int jakkapat=1; jakkapat <= com; jakkapat++)
                {
                    System.out.print (" ");
                }
                for (int jakkapat=0; jakkapat < 3; jakkapat++)
                {
                    System.out.print (jakkapat+com);
                }
                for (int jakkapat=0; jakkapat <= com; jakkapat++)
                {
                    System.out.print ("*");
                }
            System.out.println();
        }
    }
}