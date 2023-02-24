package robot_luckieskywalker;
import robocode.*;
import java.awt.Color;

/**
 * LuckieSkywalker - a robot by Lucas Farias - @lucasfariassa
 */
public class LuckieSkywalker extends Robot {

    // Comportamentos padrões - Default behaviors
    public void run() {
        setColors(Color.orange,Color.green,Color.orange); // Cor do corpo, arma, radar - Color of body, gun, radar

        // Loop principal do Robô - Robot main loop
        while(true) {
            ahead(100);
        }
    }

    // Quando o Robô scaneia outro robô - When the Robot scans other(s) robot(s)
    public void onScannedRobot(ScannedRobotEvent e) {
        Bullet b = fireBullet(100);
        b.getVictim();
    }

    // Quando o Robô é atingido por um robô inimigo - When the Robot is hit by an enemy bullet
    public void onHitByBullet(HitByBulletEvent e) {
        back(10);
    }

    // Quando o Robô bate num muro - When the Robot hit a wall
    public void onHitWall(HitWallEvent e) {
        back(20);
        turnRight(180);
    }
}
