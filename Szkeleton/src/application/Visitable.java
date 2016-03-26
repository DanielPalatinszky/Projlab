package application;

public interface Visitable
{
	public void accept(Tile tile);
	public void accept(Renderer renderer, int i, int j);
}
