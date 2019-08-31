class Demo2{
    public static void main(String[] args) {
        String z = new String("Hello").intern();
        String y = "Hello";
        String m = "Hello";
        //String y = "Hello".intern();
        //String m = "Hello".intern();
        System.out.println(z==y);
        System.out.println(z.equals(y));

    }
}