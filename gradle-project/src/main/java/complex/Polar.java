package complex;

class Polar implements Complex {

  private final double distance;
  private final double angle;

  public Polar(final double distance, final double angle) {
    this.distance = distance;
    this.angle = angle;
  }

  public Polar(final Complex that) {
    distance = that.getDistance();
    angle = that.getAngle();
  }

  @Override
  public double getReal() {
    return Math.cos(angle) * distance;
  }

  @Override
  public double getImag() {
    return Math.sin(angle) * distance;
  }

  @Override
  public double getDistance() {
    return distance;
  }

  @Override
  public double getAngle() {
    return angle;
  }

  @Override
  public Complex add(Complex that) {
    return null;
  }

  @Override
  public Complex mult(Complex that) {
    return null;
  }
}
