package proiect;

import java.util.Comparator;
import java.util.Random;

public class student {


int grupa, subgrupa, an;
String cnp;
float medie;
String nume, prenume, email,parola;
boolean loc;

public student(String prenume, String nume, String cnp,int grupa, int subgrupa, int an) {
	this.grupa = grupa;
	this.subgrupa = subgrupa;
	this.an = an;
	this.cnp = cnp;
	this.medie = 5;
	this.nume = nume;
	this.prenume = prenume;
	this.email = prenume.toLowerCase()+'.'+nume.toLowerCase()+cnp.substring(1,3)+"@e-uvt.ro";

	
	
	
	
	
	int leftLimit = 97; // letter 'a'
    int rightLimit = 122; // letter 'z'
    int targetStringLength = 8;
    Random random = new Random();
    StringBuilder buffer = new StringBuilder(targetStringLength);
    for (int i = 0; i < targetStringLength; i++) {
        int randomLimitedInt = leftLimit + (int) 
          (random.nextFloat() * (rightLimit - leftLimit + 1));
        buffer.append((char) randomLimitedInt);
    }
   
	
	
   int leftLimit1 = 48; // letter 'a'
   int rightLimit1 = 57; // letter 'z'
   int targetStringLength1 = 2;
   Random random1 = new Random();
   StringBuilder buffer1 = new StringBuilder(targetStringLength);
   for (int i = 0; i < targetStringLength1; i++) {
       int randomLimitedInt1 = leftLimit1 + (int) 
         (random.nextFloat() * (rightLimit1 - leftLimit1 + 1));
       buffer1.append((char) randomLimitedInt1);
   }
   parola= buffer.toString()+buffer1.toString();;
	
	
	
}

public int getGrupa() {
	return grupa;
}

public void setGrupa(int grupa) {
	this.grupa = grupa;
}

public int getSubgrupa() {
	return subgrupa;
}

public void setSubgrupa(int subgrupa) {
	this.subgrupa = subgrupa;
}

public int getAn() {
	return an;
}

public void setAn(int an) {
	this.an = an;
}

public String getCnp() {
	return cnp;
}

public void setCnp(String cnp) {
	this.cnp = cnp;
}

public float getMedie() {
	return medie;
}

public void setMedie(float medie) {
	this.medie = medie;
}

public String getNume() {
	return nume;
}

public void setNume(String nume) {
	this.nume = nume;
}

public String getPrenume() {
	return prenume;
}

public void setPrenume(String prenume) {
	this.prenume = prenume;
}

public String getEmail() {
	return email;
}

public String getParola() {
	return parola;
}

public void setParola(String parola) {
	this.parola = parola;
}

public void setEmail(String email) {
	this.email = email;
}

public String getLoc() {
	if((!loc))
	return "Loc finantat de la bugetul de stat";
	else return "Loc cu taxa";
}

public void setLoc(boolean loc) {
	this.loc = loc;
}

@Override
public String toString() {
	return "student [grupa=" + grupa + ", subgrupa=" + subgrupa + ", an=" + an + ", cnp=" + cnp + ", medie=" + medie
			+ ", nume=" + nume + ", prenume=" + prenume + ", email=" + email + ", parola=" + parola + ", Loc=" + loc
			+ "]";
}



}
