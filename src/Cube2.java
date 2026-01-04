public class Cube2 {
    private Cube basicCube;
    private String color;


    public Cube2() {
        this.basicCube = new Cube(1);
        this.color = "black";
    }

    public Cube2(int side) {
        this.basicCube = new Cube(side);
        this.color = "black";
    }

    public Cube2(int side, String color) {
        this.basicCube = new Cube(side);
        this.color = color;
    }


    public int getSide() {
        return basicCube.getSide();
    }

    public void setSide(int side) {
        basicCube.setSide(side);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public int calculateSurfaceArea() {
        int s = getSide();
        return 6 * s * s;
    }

    public int calculateVolume() {
        int s = getSide();
        return s * s * s;
    }


    public boolean equals(Cube2 other) {
        if (other == null) {
            return false;
        }
        return this.getSide() == other.getSide()
                && this.color.equals(other.color);
    }


    @Override
    public String toString() {
        return "Cube{side=" + getSide() + ", color=\"" + color + "\"}";
    }


    public Cube2 add(Cube2 other) {
        int a = this.getSide();
        int b = other.getSide();

        int cSquared = a * a + b * b;
        int c = (int) Math.round(Math.sqrt(cSquared));

        if (c * c != cSquared) {
            throw new IllegalArgumentException();
        }

        return new Cube2(c, this.color);
    }


    public Cube2 minus(Cube2 other) {
        int a = this.getSide();
        int b = other.getSide();

        int cSquared = a * a - b * b;

        if (cSquared <= 0) {
            throw new IllegalArgumentException();
        }

        int c = (int) Math.round(Math.sqrt(cSquared));

        if (c * c != cSquared) {
            throw new IllegalArgumentException();
        }

        return new Cube2(c, this.color);
    }
}
