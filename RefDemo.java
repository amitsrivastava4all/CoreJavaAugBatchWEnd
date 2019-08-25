class RefDemo{
    public static void main(String[] args) {
        int x = 100;
        int y = 100;
        String email = "amit@yahoo.com";
       if( email.contains("@") && email.endsWith(".com")){
        System.out.println("Valid Email");
       }
       else{
        System.out.println("Invalid Email");
       }
        String phone = "011-987116651";
        String result = phone.startsWith("011")?"Delhi":"Mumbai";
        System.out.println(result);

    }
}