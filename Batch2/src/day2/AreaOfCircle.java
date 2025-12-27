package day2;
class circle{
	int r;
	static double pie = 3.14;
	
	public circle(int r){
		 this.r = r;
	}
	
	double display(){
		return r*r*pie;
	}
}

class AreaOfCircle {
	public static void main(String[] args) {
		circle  c = new circle( 6 );
		System.out.println(c.display());
	}
}
