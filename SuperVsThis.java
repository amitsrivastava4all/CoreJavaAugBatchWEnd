class Foo{
	int x= 100;
}
class E extends Foo{
	int x=300;
}
class Bar extends E{
	int x=200;
	Bar(int x){
		int z =((Foo)this).x +((E)this).x + this.x + x;
		System.out.println(z);
	}
}
public class SuperVsThis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Bar(300);

	}

}
