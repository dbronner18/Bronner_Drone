package bronner_Drone;

public class Bronner_Drone {
	private final String[] DIRECTIONS = new String[] {"North", "East", "South", "West"};
	private int x_pos;
	private int y_pos;
	private int z_pos;
	private String orientation;
	
	public Bronner_Drone(){
		//set starting points for drone 
		x_pos = 0;
		y_pos = 0;
		z_pos = 0;
		orientation = DIRECTIONS[0];
	}

	public int getX_pos() {
		return x_pos;
	}

	public void moveX_pos(int x_pos) {
		//move drone forward or backward
		this.x_pos += x_pos;
	}

	public int getY_pos() {
		return y_pos;
	}

	public void moveY_pos(int y_pos) {
		//turn drone left or right (0-3) to match orientation
		this.y_pos += y_pos;
		//set orientation based on new y value
		setOrientation();
	}

	public int getZ_pos() {
		return z_pos;
	}

	public void moveZ_pos(int z_pos) {
		//move drone up or down
		this.z_pos += z_pos;
	}

	public String getOrientation() {
		return orientation;
	}

	public void setOrientation() {
		//IF(y value less than North)
		if(this.y_pos < 0)
			//set y value to West
			this.y_pos = 3;
		//ELSE IF(y value greater than West)
		else if (this.y_pos > 3)
			//set y value to North
			this.y_pos = 0;
		
		//set orientation to new value
		this.orientation = DIRECTIONS[this.y_pos];
	}

	@Override
	public String toString() {
		//display drone coordinates
		return "Bronner_Drone [x_pos=" + x_pos + ", y_pos=" + y_pos + ", z_pos=" + z_pos + ", orientation="
				+ orientation + "]";
	}
}
