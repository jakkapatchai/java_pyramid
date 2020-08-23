class x {
    public static void main(String args []) {
        for (int com=1; com <= 5; com++)
            {
                for (int c = 1; c <= 6-com; c++)
                System.out.print (com);
                for (int c = 1; c <= com; c++)
                System.out.print " ";
                for (int c = 2; c <= com; c++)
                System.out.print " ";
                for (int c = 1; c <= 6-com; c++)
                System.out.print (com);
                System.out.print ("\n");
            System.out.println();
        }
    }
}