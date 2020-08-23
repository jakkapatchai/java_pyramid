class x {
    public static void main(String args []) {
        for (int com=1; com <= 5; com++)
            {
                for (int jakkapat=com; jakkapat <= 5; jakkapat++)
                {
                    System.out.print (com);
                }
                for (int jakkapat=1; jakkapat <= com; jakkapat++)
                {
                    System.out.print ("*");
                }
            System.out.println();
        }
    }
}