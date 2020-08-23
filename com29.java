class x {
    public static void main(String args []) {
        for (int com=1; com <= 5; com++)
            {
                System.out.print (com);
                System.out.print ("*");
                System.out.print (com+2);
                for (int jakkapat=1; jakkapat <= com+2; jakkapat++)
                {
                    System.out.print ("*");
                }  
            System.out.println();
        }
    }
}