class StringDemo{
    public static void main(String[] args) {
        String name3 = new String("Amit"); // 2 or 1
        String name = "Amit"; // 1 or 0 
        // Local Var
        String name2="Amit";
       // String name3 = new String("Amit"); // 2 or 1
        System.out.println(name==name2); // true
        System.out.println(name==name3); //false
        System.out.println(name.equals(name3)); // true
        name="ram";
        System.out.println("After Modification");
        System.out.println(name==name2); // false


        

    }
}