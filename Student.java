
public class Student {
	private int id;
	private String name;
	private String course;
	private int duration;
	public void takeInput(int i , String n , String c, int d) {
		if(i<=0) {
			System.out.println("Invalid Id");
			return ;
		}
		if(d<=0) {
			System.out.println("Invalid Duration ");
			return ;
		}
		id =i;
		name =n;
		course = c;
		duration = d;
	}
	public void print() {
		System.out.println("********************");
		System.out.println(this.id);
		System.out.println(name);
		System.out.println(course);
		System.out.println(duration);
		System.out.println("*******************");
	}


}
