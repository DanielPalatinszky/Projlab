package application;

public class Portal extends Tile
{
	private ColorType color;
	private Portal otherPortal;
	private Tile floor;
	
	public Portal(ColorType color, Tile up, Tile down, Tile left, Tile right)
	{
		super(up, down, left, right);
	}
	
	public void setOther()
	{
		
	}
	
	public ColorType getColor()
	{
		return color;
	}
	
	public Tile getFloor()
	{
		return floor;
	}
	
	public void setFloor(Tile tile)
	{
		
	}
}
