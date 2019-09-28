import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowListener;

class T11{
	void show() {
		
	}
}
class T21 extends T11{
	@Override
	protected void show() {
		
	}
}

class A11{
	int x; // default
	public int y;
	private int z;
	protected int m;
}
interface StarPlayer{
	public abstract void hide();
	int MAX_POWER = 50;
	public default void kick() {
		System.out.println("Star Player Kick");
		
	}
}

// what to do
interface Player{
	//public static final int MAX_POWER = 100;
	int MAX_POWER = 100;
	int MIN_POWER = 10;
	void attack();  // public abstract void attack();
	void defense();
	public default void kick() {
		System.out.println("Player Kick");
	}
	void punch();
}
interface HybridPlayer extends Player, StarPlayer{
	@Override
default void kick() {
	Player.super.kick();
	StarPlayer.super.kick();
}
}
class Honda implements Player, StarPlayer{
	void print() {
		
	}

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void defense() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void kick() {
		// TODO Auto-generated method stub
		System.out.println();
		
	}

	@Override
	public void punch() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hide() {
		// TODO Auto-generated method stub
		
	}
	
}
// How to do
class Ryu implements Player{


	@Override
	public void defense() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void kick() {
		// TODO Auto-generated method stub
		System.out.println("High Kick");
		
	}

	@Override
	public void punch() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		
	}
	
}
public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Ryu ryu = new Ryu();
		//KeyListener
		//WindowListener
		//WindowAdapter
		Player ryu = new Ryu();
		ryu.attack();

	}

}
