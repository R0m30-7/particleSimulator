package ProgettiMiei.Java.particleSimulator;

public class Particle {
    double x = 0;
    double y = 0;
    boolean positive = true;
    int charge = 1;
    double xAccel = 0;
    double yAccel = 0;
    double minVel = 0.000001;

    public Particle(double x, double y, boolean positive, int charge){
        this.x = x;
        this.y = y;
        this.positive = positive;
        this.charge = charge;
    }

    public void UpdatePos(double theta, double acceleration){
        x += xAccel / Game.FPSGoal;
        y += yAccel / Game.FPSGoal;

        xAccel += acceleration * Math.cos(theta);
        yAccel += acceleration * Math.sin(theta);
        
        xAccel *= GamePanel.friction;
        yAccel *= GamePanel.friction;

        if(Math.abs(yAccel) < minVel && Math.abs(xAccel) < minVel){
            xAccel = 0;
            yAccel = 0;
        }
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public boolean getPositive(){
        return positive;
    }

    public int getCharge() {
        return charge;
    }

    public void setxAccel(double xAccel) {
        this.xAccel = xAccel;
    }

    public void setyAccel(double yAccel) {
        this.yAccel = yAccel;
    }

    public double getxAccel() {
        return xAccel;
    }

    public double getyAccel() {
        return yAccel;
    }
}