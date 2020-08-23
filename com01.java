class x {
    public static void main(String args []) {
        for(int com=1; com <=4; com++)
            {
                for(int jakkapat=1;jakkapat<=com;jakkapat++)
                {
                    System.out.print (" ");
                }
                System.out.print (com);
                for(int jakkapat=3;jakkapat>=com;jakkapat--)
                {
                    System.out.print ("**");
                }
                System.out.print (com);
                System.out.println();               
            }
    }
}