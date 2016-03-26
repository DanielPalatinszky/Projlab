package application;

public class Player extends Tile
{
	private OrientationType orientation;
	Crate crate;
	int health;
	int zpm;
	
	public Player(OrientationType orientation, Tile up, Tile down, Tile left, Tile right)
	{
		super(up, down, left, right);
	}
	
	public void step(OrientationType direction)
	{
		
	}
	
	public void pickup()
	{
		
	}
	
	public void putDown()
	{
		
	}
	
	public void fallIntoHole()
	{
		
	}
	
	public Portal shoot(OrientationType orientation, ColorType color, Portal other)
	{
		return null;
	}
	
	public void setOrientation(OrientationType orientation)
	{
		
	}
	
	public OrientationType getOrientation()
	{
		return orientation;
	}
	
	public void scaleActivated()
	{
		
	}
	
	public void scaleDeactivated(Crate crate)
	{
		
	}
	
	public void setZPM()
	{
		
	}
	
	public void GameOver(boolean win)
	{
		
	}
}
