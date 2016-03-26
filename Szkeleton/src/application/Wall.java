package application;

public class Wall extends Tile
{
	private boolean isSpecial;
	
	public Wall(boolean isSpecial, Tile up, Tile down, Tile left, Tile right)
	{
		super(up, down, left, right);
	}
	
	public boolean getSpecial()
	{
		return isSpecial;
	}
}
