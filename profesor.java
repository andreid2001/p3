/**
 * 
 */
package proiect;

import java.util.Random;

public class profesor {
	
	String cnp;
	String nume, prenume, email, materie,parola;
	
	public profesor(String prenume, String nume,String cnp, String materie) {
		super();
		this.nume = nume;
		this.prenume = prenume;
		this.email=prenume.toLowerCase()+'.'+nume.toLowerCase()+"@e-uvt.ro";
		
		
		
		
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
	   
		
		
	   int leftLimit1 = 48; // '0'
	   int rightLimit1 = 57; // '9'
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

	public String getCnp() {
		return cnp;
	}

	public void setCnp(String cnp) {
		this.cnp = cnp;
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

	public String getMaterie() {
		return materie;
	}

	public void setMaterie(String materie) {
		this.materie = materie;
	}
	
	
	
}
