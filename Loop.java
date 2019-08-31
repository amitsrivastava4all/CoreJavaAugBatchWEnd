class Loop{
    public static void main(String[] args) {
        /*final int SUNDAY = 1;
        final int MONDAY = 2;
        int choice = SUNDAY;
       */
      int ch = 1;
      do{
          System.out.println("1. Pizza");
          System.out.println("2. Burger");
          System.out.println("Exit Menu Press 0 ");
      }while(ch==0);
      String choice = "Sunday";
        switch(choice){
            default:
            System.out.println("Default");
            break;
            case "Sunday":
            System.out.println("Pizza");
            case "Monday":
            System.out.println("Soft Drink");
            case 3:
            System.out.println("Ice Cream");

        }

        int i = 1;
        while(i<=10){
            if(i==6){
            i++;
            }
            else{
                i+=2;
            }
        }
        for(int j = 1; j<=10 ; j++){

        }
    }
}