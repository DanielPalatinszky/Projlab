package application;

public class Crate extends Tile
{
	private MaterialType color;
	
	public Crate(MaterialType color, Tile up, Tile down, Tile left, Tile right)
	{
		super(up, down, left, right);
		this.color = color;
		System.out.println("->[Crate].Crate(MaterialType color, Tile up, Tile down, Tile left, Tile right)");
	}
	
	public MaterialType getColor()
	{
		return color;
	}

	@Override
	public Tile pickedUp()
	{
		System.out.println("->[:Crate].pickedUp()");
		System.out.println("<-[:Crate].pickedUp()");
		return this;
	}

	@Override
	public Tile putDown(Crate crate)
	{
		System.out.println("->[:Crate].putDown()");
		System.out.println("<-[:Crate].putDown()");
		return null;
	}
}
