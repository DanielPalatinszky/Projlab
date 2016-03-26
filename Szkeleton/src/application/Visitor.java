package application;

public interface Visitor
{
	public void visit(Player player);
	public void visit(Floor floor);
	public void visit(Door door);
	public void visit(Scale scale);
	public void visit(Wall wall);
	public void visit(Portal portal);
	public void visit(Hole hole);
	public void visit(Crate crate);
}
