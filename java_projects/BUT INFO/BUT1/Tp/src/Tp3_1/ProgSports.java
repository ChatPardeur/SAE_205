package Tp3_1;

public class ProgSports 
{
	public static void main(String[] args) 
	{
		Sport tir_arc = new Sport(1, "tir à l'arc");
		SportCo foot = new SportCo(2, "football", 11);
		SportCo tennisD = new SportCo(3, "tennis en double", 2);
		Sport escrime = new Sport(4, "escrime");
		SportCo rugby = new SportCo(5, "rugby", 15);
		
		LesSports sports = new LesSports(5);
		
		sports.ajouterSport(tir_arc);
		sports.ajouterSport(foot);
		sports.ajouterSport(tennisD);
		sports.ajouterSport(escrime);
		sports.ajouterSport(rugby);
		
		sports.afficher();
		

	}
}
