class x {
    public static void main(String args []) {
        for (int com=1; com <= 5; com++)
            {
                for (int jakkapat=5; jakkapat >= com; jakkapat--)
                {
                    System.out.print (" ");
                }	
                System.out.print (com);
                for (int jakkapat=2; jakkapat <= com; jakkapat++)
                {
                    System.out.print (" ");
                }
                System.out.print (com);
            System.out.println();
        }
    }
}