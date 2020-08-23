class x {
    public static void main(String args []) {
        for (int com=1; com <= 7; com++)
            {
                 for (int jakkapat=1; jakkapat <= com; jakkapat++)
                {
                    System.out.print (" ");
                }
                for (int jakkapat=6; jakkapat >= com; jakkapat--)
                {
                    System.out.print ((jakkapat-1)%2);
                }
                System.out.print ((com)%2);
                
                for (int jakkapat=com; jakkapat <= 6; jakkapat++)
                {
                    System.out.print ((jakkapat-1)%2);
                }
            System.out.println();
        }
    }
}