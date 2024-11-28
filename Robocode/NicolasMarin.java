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

        while (true) {
            setAhead(1200);
            moving = true;
            setTurnRight(77);
            waitFor(new TurnCompleteCondition(this));
            setTurnLeft(105);
        }
    }

    public void onScannedRobot(ScannedRobotEvent e) {
        double distance = e.getDistance();
        double enemyBearing = e.getBearing();
        double gunTurnAngle = normalizeBearing(enemyBearing);
        turnGunRight(gunTurnAngle); 

        if (distance <= 100) {
            fire(3);
        } else {
            fire(2); 
        }
    }

    public void onHitByBullet(HitByBulletEvent e) {
        reverseDirection();
    }

    public void onHitWall(HitWallEvent e) {
        reverseDirection();
    }

    public void reverseDirection() {
        if (moving) {
            setBack(100);
            moving = false;
        } else {
            setAhead(100);
            moving = true;
        }
    }

    public void onHitRobot(HitRobotEvent e) {
        if (e.isMyFault()) {
            setBack(275);
            setAhead(88);
            setBack(44);
        }
    }

    public double normalizeBearing(double angle) {
        while (angle > 180) angle -= 360;
        while (angle < -180) angle += 360;
        return angle;
    }
}
