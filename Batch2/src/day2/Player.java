package day2;

class Data {
	 String name;
	 int age;
	 int mom;
	 int best_score;
	 String Country;
	 String team;
 }
 
 class football extends Data{
	 int goals;
	 int assist;
	 int High_Score;
	 football (String name,int age,int mom,int best_score,String Country,String team){
		 this.age = age;
		 this.mom = mom;
		 this.best_score = best_score;
		 this.Country = Country;
		 this.team = team; 
		 this.name = name;
	 }
	 
	 void display(){      
		 System.out.println(name);
		 System.out.println(mom);
		 System.out.println(best_score);
		 System.out.println(Country);
		 System.out.println(team);
	 }
 }
 
 class cricket extends Data{
	 int Centuries;
	 int half_Centuries;
 }

 public class Player {
	public static void main(String[] args) {
		football d1 = new football("Spyrec",21,25,26,"india","F1");
			d1.display();
	}
	
}
