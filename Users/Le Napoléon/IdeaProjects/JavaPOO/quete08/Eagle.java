public class Eagle extends Bird implements Fly {

    private boolean flying;
    private int altitude;

    public Eagle(String name) {
        super(name);
        this.flying = false;
        this.altitude = 0;
    }

    public int getAltitude() {
        return altitude;
    }

    public boolean isFlying() {
        return flying;
    }

    @Override
    public String sing() {
        return "Screech!";
    }

    @Override
    public void takeOff() {
        if (!this.flying && this.altitude == 0) {
            this.flying = true;
            System.out.printf("%s takes off %n", this.getName());
        }
    }

    @Override
    public int ascend(int meters) {
        if(this.flying){
            this.altitude = Math.max(this.altitude + meters, 0);
            System.out.printf("%s flies upward at altitude: %d%n", this.getName(), this.altitude);
        }
        return this.altitude;
    }

    @Override
    public void glide() {
        if (this.flying) {
            System.out.printf("%s glides %n", this.getName());
        }
    }

    @Override
    public int descend(int meters) {
        if (this.flying) {
            this.altitude = Math.max(this.altitude - meters, 0);
            System.out.printf("%s flies downward at altitude: %d%n", this.getName(), this.altitude);
        }
        return this.altitude;
    }

    @Override
    public void land() {
        if (this.flying && this.altitude == 0) {
            this.flying = false;
            System.out.printf("%s lands %n", this.getName());
        } else if (this.flying) {
            System.out.printf("%s can't land %n", this.getName());
        }
    }
}