public class Tank {
    int x, y;
    int dir;
    int fuel;

    public Tank() {
        this.fuel = 100;
    }

    public Tank(int x, int y) {
        this.x = x;
        this.y = y;
        this.fuel = 100;
    }

    public Tank(int x, int y, int fuel) {
        this.x = x;
        this.y = y;
        this.fuel = fuel;
    }


    public void goForward(int i) {
            if (fuel - i > 0) {
                if (dir == 0) { x += i; fuel -= Math.abs(i); }
                else if (dir == 1) {y += i; fuel -= Math.abs(i);}
                else if (dir == 2) {x -= i; fuel -= Math.abs(i);}
                else {y -= i; fuel -= Math.abs(i);}
            }
            else if (fuel - i <= 0) {
                if (dir == 0) { x = fuel + x; fuel = 0;}
                else if (dir == 1) {y = fuel + y; fuel = 0;}
                else if (dir == 2) {x = fuel + x; fuel = 0;}
                else {y = fuel + y; fuel = 0;}
            }

    }

    public void printPosition() {
        System.out.println("The Tank is at " + x +", " + y + " now. Fuel = " + fuel);
    }

    public void turnLeft() {
        dir--;
        if (dir == -1) dir = 3;
    }

    public void turnRight() {
        dir++;
        if (dir == 4) dir = 0;
    }

    public void goBackward(int i) {
        goForward(-i);
    }
}
