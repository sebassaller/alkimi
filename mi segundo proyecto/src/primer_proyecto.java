
public class primer_proyecto {
	public static void main(String args[]){
		for (int numero=1; numero<=5; numero++){
	    	if (numero %3==0) {
	    		System.out.println(numero +"Fizz");
	    	}else {
	    	if (numero %5==0) {
	    		System.out.println(numero + "FizzBuzz");
	    	}else {
	    		System.out.println(numero);
	    	  }
	    	}
	    }
	}
}