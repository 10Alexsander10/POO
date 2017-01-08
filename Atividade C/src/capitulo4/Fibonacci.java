package capitulo4;

public class Fibonacci {
	String sequencia = "";
	
	public int calculaFibonacci2(int quant){
		 if(quant == 0)
			 return 0;
		 else if(quant == 1)
			 return 1;
		 else
		      return calculaFibonacci2(quant - 1) + calculaFibonacci2(quant - 2);
		 	
		}
	
	public String calculaFibonacci(int quant){
		
		for(int i=1;i<quant;i++)
			sequencia += (calculaFibonacci3(i)+" ");
		
		return sequencia;
	}
	
	static long calculaFibonacci3(int quant) {
        return (quant < 2) ? quant : calculaFibonacci3(quant - 1) + calculaFibonacci3(quant - 2);
    }
	}

