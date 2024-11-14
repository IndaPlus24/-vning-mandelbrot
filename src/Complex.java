/**
 * Complex: Simple class for representing complex numbers along with addition and squaring
 * @author: Benjamin Widman
 * @version: 2023-11-24
 */

public class Complex {
    private final double real; 
    private final double imag; 

    public Complex() {
        this(0.0, 0.0);
    }

    public Complex(double r) {
        this(r, 0.0);
    }

    public Complex(double r, double i) {
         this.real = r;
         this.imag = i;
    }

    public Complex add(Complex addend) {
        return new Complex((this.real + addend.real), (this.imag + addend.imag));
    }

    public Complex square() {
        // (a+bi)^2 = 
        // a^2 + 2abi + (bi)^2 = 
        // (a^2 - b^2) + 2abi
        return new Complex(real * real - imag * imag, 2 * real * imag);
    }
}
