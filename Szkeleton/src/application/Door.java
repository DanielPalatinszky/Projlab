package application;

public class Door extends Tile
{
	private Scale scale;
	private boolean isOpen;
	
	public Door(Scale scale, Tile up, Tile down, Tile left, Tile right)
	{
		super(up, down, left, right);
		this.scale = scale;
		System.out.println("->[:Door].Door(Scale scale, Tile up, Tile down, Tile left, Tile right)");
	}
	
	public Tile pass()
	{
		return null;
	}
	
	public void open()
	{
		
	}
	
	public void close()
	{
		
	}
}
