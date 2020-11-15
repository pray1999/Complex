package beans;
 
public class Complex {
  private double real;
  private double ima;
public double getReal() {
	return real;
}
public void setReal(double real) {
	this.real = real;
}
public double getIma() {
	return ima;
}
public void setIma(double ima) {
	this.ima = ima;
}
public Complex(double real, double ima) {
	this.real = real;
	this.ima = ima;
}
public Complex() {}
 
 public Complex add(Complex a) {
	  return new Complex(this.real+a.real,this.ima+a.ima);
  }
 public String toString() {
	 String r=null;
	 if(ima<0) {
		 r=""+real+ima+"i";
	 }else {
		 r=real+"+"+ima+"i";
	 }
	 return r;
 }
}