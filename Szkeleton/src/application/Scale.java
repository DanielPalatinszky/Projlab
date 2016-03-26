package application;

public class Scale extends Tile
{
	private Door door;
	private Crate crate;
	private MaterialType color;
	private boolean isPressed;
	
	public Scale(Door door, MaterialType color, Tile up, Tile down , Tile left, Tile right)
	{
		super(up, down, left, right);
	}
	
	public void activate(Crate playerCrate)
	{
		
	}
	
	public Crate deactivate()
	{
		return crate;
	}
}
