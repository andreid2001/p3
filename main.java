package proiect;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;




public class main {

	static student x;static profesor y;
	static ArrayList<student> studenti=new ArrayList<student>();
	static ArrayList<profesor> profesori=new ArrayList<profesor>();
	
	public static void Login(String email, String parola)
	{int i=0,ok=0;
	
	while(i<studenti.size())
	{if(studenti.get(i).getEmail().equals(email.toLowerCase())) // && studenti.get(i).getParola().equals(parola))
	{
	System.out.println("Buna ziua, "+studenti.get(i).getPrenume()+' '+studenti.get(i).getNume());
	ok=1;
	break;}
	i++;
	}
	i=0;
	
	while(i<profesori.size())
	{if(profesori.get(i).getEmail().equals(email.toLowerCase())) //&& profesori.get(i).getParola().equals(parola))
	{
	System.out.println("Buna ziua, "+profesori.get(i).getPrenume()+' '+profesori.get(i).getNume());
	ok=2;
	break;}
	i++;
	}
	if (ok==1) {System.out.println("tip cont: student");
	System.out.println("Date scolaritate: "+"Facultatea de Informatica si Matematica, "+"Anul: " + studenti.get(i).getAn()+", grupa "+studenti.get(i).getGrupa()+", subgrupa: "+studenti.get(i).getSubgrupa()+", media: "+studenti.get(i).getMedie()+", " +studenti.get(i).getLoc());
	int optiune=1;
	while(optiune!=0) {
	System.out.print("selectati o optiune:\n1 - schimbati parola\n0 - exit\n");
	Scanner scanner= new Scanner(System.in);
	optiune = scanner.nextInt();
	if(optiune==1) changepassword(studenti.get(i));
	}
	if (optiune==0) System.out.println("La revedere!");
	}

	else if (ok==2) {System.out.println("tip cont: profesor");
	int optiune=1;
	while(optiune!=0) {
	System.out.print("selectati o optiune:\n1 - schimbati parola\n0 - exit\n");
	Scanner scanner= new Scanner(System.in);
	optiune = scanner.nextInt();
	if(optiune==1) changepassword(studenti.get(i));
	}
	if (optiune==0) System.out.println("La revedere!");
	}
	else System.out.println("email sau parola incorecte");
	}
	
	
	
	public static void changepassword(student x)
	{
		System.out.print("introduceti parola veche:" );
		Scanner scanner = new Scanner(System.in);		
		String parola = scanner.next();
		if(parola.equals(x.getParola())) {
			System.out.print("Introduceti parola noua:");
			parola=scanner.next();
			x.setParola(parola);
		}
		else System.out.println("Parola gresita");
	}
	
	
	public static void main(String[] args) {
	
	
	x=new student("Andrei", "Draghicescu","5010421353535",1,1,1);
	studenti.add(x);
	x=new student("Valentin", "Costache","5010421353535",1,3,2);
	studenti.add(x);
	x=new student("Dragos", "Florea","5011010223115",1,3,1);
	studenti.add(x);
	x=new student("Radu", "Flesar","5021223353535",1,1,1);
	studenti.add(x);
	x=new student("Razvan", "Dinga","5990321213665",2,2,2);
	studenti.add(x);
	
	

	
	
	y=new profesor("Sebastian","Stefaniga","5920304321133","programare");
	profesori.add(y);
	y=new profesor("Todor","Ivascu","5750614355533","programare");
	profesori.add(y);
	y=new profesor("Mircea","Marin","5920304321133","mate");
	profesori.add(y);
	y=new profesor("as","Stefaniga","5920304321133","programare");
	profesori.add(y);
	
		
	/*	System.out.println("student sau profesor");
		Scanner scanner = new Scanner(System.in);		
		String myString = scanner.next();
	
		if (myString.equals("student")) {System.out.println(x.getParola());System.out.println(studenti.get(0).getNume());}
		else if (myString.equals("profesor")) {y=new profesor("prof","profesor","6020304321133","mate");System.out.println(y.getParola());}
		else System.out.println("nu ati selectat o optiune valida");
	*/
	
	
	System.out.println("introduceti emailul si parola");
	
	
	Scanner scanner = new Scanner(System.in);
	
	String email = scanner.next();
	String parola = scanner.next();
	Login(email,parola);
	
	}
	 
}

