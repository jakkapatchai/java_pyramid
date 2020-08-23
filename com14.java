class x {
    public static void main(String args []) {
        for (int com=1; com <= 5; com++)
            {
                for (int jakkapat=1; jakkapat <= com; jakkapat++)
                {
                    System.out.print (" ");
                }
                 for (int jakkapat=0; jakkapat < 2 ; jakkapat++)
                {
                    System.out.print (jakkapat+com);
                }
                for (int jakkapat=4; jakkapat >= com; jakkapat--)
                {
                    System.out.print (" ");
                }
                for (int jakkapat=4; jakkapat >= com; jakkapat--)
                {
                    System.out.print (" ");
                }
                for (int jakkapat=1; jakkapat < 3; jakkapat++)
                {
                    System.out.print (((com+1)*2)-(jakkapat+com));
                }
            System.out.println();
        }
    }
}