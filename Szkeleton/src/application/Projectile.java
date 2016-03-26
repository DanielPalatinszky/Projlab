package application;

public class Projectile extends Tile
{
	private ColorType color;
	private Tile next;
	
	public Projectile(ColorType color, Tile up, Tile down, Tile left, Tile right)
	{
		super(up, down, left, right);
	}
	
	public Portal spawnPortal(ColorType color, Portal other)
	{
		return null;
	}
	
	public void move()
	{
		
	}
}
