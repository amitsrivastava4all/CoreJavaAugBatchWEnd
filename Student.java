// 100 Instance Var
public class Student {
	private int id;  // Instance Var
	private String name;
	private String course;
	private int duration;
	private String email;
	private String phone;
	private byte age;
	private String address;
	
	private static String collegeName;
	static {
		collegeName = getCollegeName();
		System.out.println("I Will Call When Class is Loaded.");
	}
	
	
	
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public byte getAge() {
		return age;
	}
	public void setAge(byte age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public static void setCollegeName(String collegeName) {
		Student.collegeName = collegeName;
	}
	static String getCollegeName(){
		// fetch from DB
		return "SRCC";
	}
	{
		
		System.out.println("I am Init Block (Pre Cons)");
		System.out.println(id+ name+ course + duration);
	}
	{
		System.out.println("Init 2");
	}
	void Student() {
		System.out.println("I am a Method Not a Cons"); 
	
	}
	Student(){
		//collegeName = "SRCC";
		System.out.println("Student Default Cons call");
	}
	Student(int id, String name , String course , int duration){
		this();
		this.id = id;
		this.name = name;
		this.course = course;
		this.duration = duration;
	}
	
//	public void takeInput(int i , String n , String c, int d) {
//		if(i<=0) {
//			System.out.println("Invalid Id");
//			return ;
//		}
//		if(d<=0) {
//			System.out.println("Invalid Duration ");
//			return ;
//		}
//		id =i;
//		name =n;
//		course = c;
//		duration = d;
//	}
	public void print() {
		System.out.println("********************");
		System.out.println(collegeName);
		System.out.println(this.id);
		System.out.println(name);
		System.out.println(course);
		System.out.println(duration);
		System.out.println("*******************");
	}


}
