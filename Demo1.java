class Demo1{
    public static void main(String[] args) {
        String a = "Hello";
        String b = "Hello";
        String c = "Hello";
        System.out.println ((a==b) + " "+ (a==c));
        a = "Hi";
        System.out.println ((a==b) + " "+ (a==c));
        System.out.println(a+" "+c+" "+b);
        String z = "Ok";
        Runtime r = Runtime.getRuntime();
        System.out.println ("Total "+r.totalMemory()+" Free "+r.freeMemory()+" Used "+(r.totalMemory()-r.freeMemory()));
        for(int i = 1; i<=100000; i++){
            z = new String("Ok"+i);
           // z = new String("Ok");
        }
        System.out.println("****************************");
        System.out.println ("Total "+r.totalMemory()+" Free "+r.freeMemory()+" Used "+(r.totalMemory()-r.freeMemory()));
    }
}