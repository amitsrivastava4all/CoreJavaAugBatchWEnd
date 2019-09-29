import java.util.ResourceBundle;

public class CarFactory {
	static ResourceBundle rb = ResourceBundle.getBundle("config");
	static Car getCar(){
		String className = rb.getString("classname");
		Object object = null;
		try {
		
			object = Class.forName(className).newInstance();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		//Car obj = new Maruti800();
		return (Car)object;
	}

}
