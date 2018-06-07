class Cartesian implements Complex {

  private final double real;
  private final double imag;

  public Cartesian(final double real, final double imag) {
    this.real = real;
    this.imag = imag;
  }

  public Cartesian(final Complex that) {
    real = that.getReal();
    imag = that.getImag();
  }

  @Override
  public double getReal() {
    return real;
  }

  @Override
  public double getImag() {
    return imag;
  }

  @Override
  public double getDistance() {
    return Math.hypot(real, imag);
  }

  @Override
  public double getAngle() {
    return Math.atan2(imag, real);
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
