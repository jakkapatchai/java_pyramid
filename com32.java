class x {
    public static void main(String args []) {
        for (int com=1; com <= 5; com++)
            {
                for (int jakkapat=7; jakkapat >= com; jakkapat--)
                {
                    System.out.print (8-jakkapat);
                }
                for (int jakkapat=1; jakkapat <= com+2; jakkapat++)
                {
                    System.out.print ("*");
                }
                System.out.print (com+2) ; 
            System.out.println();
        }
    }
}