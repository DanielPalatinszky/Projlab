package application;

public class Tile implements Visitor, Visitable
{
	private Tile up;
	private Tile down;
	private Tile left;
	private Tile right;
	
	public Tile(Tile up, Tile down, Tile left, Tile right)
	{
		
	}
	
	public void setUp(Tile up)
	{
		
	}
	
	public void setDown(Tile down)
	{
		
	}
	
	public void setLeft(Tile left)
	{
		
	}
	
	public void setRight(Tile right)
	{
		
	}
	
	public Tile getUp()
	{
		return up;
	}
	
	public Tile getDown()
	{
		return down;
	}
	
	public Tile getLeft()
	{
		return left;
	}
	
	public Tile getRight()
	{
		return right;
	}
	
	public Tile pickedUp()
	{
		return null;
	}
	
	public Tile putDown(Crate crate)
	{
		return null;
	}

	@Override
	public void accept(Tile tile)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void accept(Renderer renderer, int i, int j)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(Player player)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(Floor floor)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(Door door)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(Scale scale)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(Wall wall)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(Portal portal)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(Hole hole)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(Crate crate)
	{
		// TODO Auto-generated method stub
		
	}
	
	
}
