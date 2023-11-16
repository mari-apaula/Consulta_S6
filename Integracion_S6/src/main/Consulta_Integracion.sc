// Ejercicio 1

  def integracion(f: Double => Double, a: Double, b: Double): Double = {
    val x: Double = (a + b) / 2
    (b - a) * (f(a) + 4 * f(x) + f(b)) / 6
  }

  val ejem = (x: Double) => -Math.pow(x, 2) + (8 * x) - 12
  integracion(ejem, 3, 5)

// Ejercicio 2

  // 1
  val f1 = (x: Double) => -Math.pow(x, 2.0) + (8 * x) - 12
  integracion(f1, 3, 5)
  // 2
  val f2 = (x: Double) => 3 * Math.pow(x, 2)
  integracion(f2, 0, 2)
  // 3
  val f3 = (x: Double) => x + 2 * Math.pow(x, 2) - Math.pow(x, 3) + 5*Math.pow(x,4)
  integracion(f3, -1, 1)
  // 4
  val f4 = (x: Double) => (2 * x + 1) / (Math.pow(x, 2.0) + x)
  integracion(f4, 1, 2)
  // 5
  val f5 = (x: Double) => Math.exp(x)
  integracion(f5, 0, 1)
  // 6
  val f6 = (x: Double) => 1 / Math.pow(x-1, 1.0/2)
  integracion(f6, 2, 3)
  // 7
  val f7 = (x: Double) => 1 / (1 + Math.pow(x,2.0))
  integracion(f7, 0, 1)

// Ejercicio 3

  def calculoError (x : Double, y : Double ) = {
    Math.abs(x - y)
  }

  calculoError(7.33, integracion(f1, 3, 5))
  calculoError(8, integracion(f2, 0, 2))
  calculoError(3.333, integracion(f3, -1, 1))
  calculoError(1.09861, integracion(f4, 1, 2))
  calculoError(1.71828, integracion(f5, 0, 1))
  calculoError(0.828427, integracion(f6, 2, 3))
  calculoError(0.785398, integracion(f7, 0, 1))