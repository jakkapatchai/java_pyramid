class x {
    public static void main(String args []) {
        for (int com=1; com <= 5; com++)
            {
                System.out.print (com);
                for (int jakkapat=1; jakkapat <= com; jakkapat++)
                {
                    System.out.print ("*");
                }
                System.out.print (com);
                 for (int jakkapat=5; jakkapat >= com; jakkapat--)
                {
                    System.out.print ("*");
                }
                System.out.print (10-com);
            System.out.println();
        }
    }
}