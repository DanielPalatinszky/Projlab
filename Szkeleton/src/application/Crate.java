package application;

public class Crate extends Tile
{
	private MaterialType color;
	
	public Crate(MaterialType color, Tile up, Tile down, Tile left, Tile right)
	{
		super(up, down, left, right);
		this.color = color;
	}
	
	public MaterialType getColor()
	{
		return color;
	}
}
