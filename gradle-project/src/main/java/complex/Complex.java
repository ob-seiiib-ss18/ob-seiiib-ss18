package complex;

interface Complex {
  double getReal();

  double getImag();

  double getDistance();

  double getAngle();

  Complex add(Complex that);

  Complex mult(Complex that);
}
