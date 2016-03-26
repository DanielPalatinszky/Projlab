package application;

public class Floor extends Tile
{
	private boolean zpm;
	
	public Floor(boolean zpm, Tile up, Tile down, Tile left, Tile right)
	{
		super(up, down, left, right);
	}
	
	public boolean getZPM()
	{
		return zpm;
	}
	
	public void setZPM(boolean zpm)
	{
		
	}
}
