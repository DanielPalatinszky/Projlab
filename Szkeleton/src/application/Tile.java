package application;

public class Tile implements Visitor, Visitable
{
	private Tile up;
	private Tile down;
	private Tile left;
	private Tile right;
	
	public Tile(Tile up, Tile down, Tile left, Tile right)
	{
		this.up = up;
		this.down = down;
		this.left = left;
		this.right = right;
		System.out.println("->[:Tile].Tile(Tile up, Tile down, Tile left, Tile right)");
	}
	
	public void setUp(Tile up)
	{
		System.out.println("->[:Tile].setUp(Tile up)");
		this.up = up;
	}
	
	public void setDown(Tile down)
	{
		System.out.println("->[:Tile].setDown(Tile down");
		this.down = down;
	}
	
	public void setLeft(Tile left)
	{
		System.out.println("->[:Tile].setLeft(Tile left)");
		this.left = left;
	}
	
	public void setRight(Tile right)
	{
		System.out.println("->[:Tile].setRight(Tile right)");
		this.right = right;
	}
	
	public Tile getUp()
	{
		System.out.println("->[:Tile].getUp()");
		System.out.println("<-[:Tile].getUp()");
		return up;
	}
	
	public Tile getDown()
	{
		System.out.println("->[:Tile].getDown()");
		System.out.println("<-[:Tile].getDown()");
		return down;
	}
	
	public Tile getLeft()
	{
		System.out.println("->[:Tile].getLeft()");
		System.out.println("<-[:Tile].getLeft()");
		return left;
	}
	
	public Tile getRight()
	{
		System.out.println("->[:Tile].getRight()");
		System.out.println("<-[:Tile].getRight()");
		return right;
	}
	
	public Tile pickedUp()
	{
		System.out.println("->[:Tile].pickedUp()");
		System.out.println("<-[:Tile].pickedUp()");
		return null;
	}
	
	public Tile putDown(Crate crate)
	{
		System.out.println("->[:Tile].putDown()");
		System.out.println("<-[:Tile].putDown()");
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
