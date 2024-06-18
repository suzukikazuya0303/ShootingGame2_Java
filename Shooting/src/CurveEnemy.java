
public class CurveEnemy extends Enemy{
	public CurveEnemy(double x,double y,double vx,double vy) {
		super (x,y,vx,vy);
	}
	public void move() {
		super.move();
		if(x < GameWorld.player.x) {
			x++;
		}
		if(x > GameWorld.player.x) {
			x--;
		}
	}
}