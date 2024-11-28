package NicolasMarin;
import robocode.*;
import java.awt.Color;

public class NicolasMarin extends AdvancedRobot {
    boolean moving;

    public void run() {
        setBodyColor(new Color(0, 0, 0));
        setGunColor(new Color(0, 0, 0));
        setRadarColor(new Color(255, 255, 255));
        setBulletColor(new Color(255, 255, 255));
        setScanColor(new Color(0, 0, 0));

        setTurnRadarRight(360); 

        while (true) {
            setAhead(600);
            moving = true;
            waitFor(new TurnCompleteCondition(this));
            setTurnRight(90); 
            waitFor(new TurnCompleteCondition(this)); 
            setTurnLeft(90); 
            waitFor(new TurnCompleteCondition(this)); 

            if (getVelocity() == 0) {
                reverseDirection();
            }
        }
    }

    public void onScannedRobot(ScannedRobotEvent e) {
        double distance = e.getDistance();  
        double enemyBearing = e.getBearing(); 
        double gunTurnAngle = normalizeBearing(enemyBearing); 

        turnGunRight(gunTurnAngle);

        if (distance <= 100) {
            fire(3); 
            fire(3);
            fire(3);
            setBack(75); 
        } else if (distance <= 200) {
            fire(2);  
        } else {
            fire(1); 
        }

        setAhead(150);
    }

    public void onHitByBullet(HitByBulletEvent e) {
        reverseDirection(); 
    }

    public void onHitWall(HitWallEvent e) {
        reverseDirection();  
    }

    public void reverseDirection() {
        if (moving) {
            setBack(200); 
            moving = false;
        } else {
            setAhead(200); 
            moving = true;
        }
    }
    public double normalizeBearing(double angle) {
        while (angle > 180) angle -= 360;
        while (angle < -180) angle += 360;
        return angle;
    }
}
