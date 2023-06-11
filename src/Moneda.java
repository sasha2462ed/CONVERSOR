
class Moneda {

    private double valor;
    private String TipoDivisa;
    
    
    
    public String getTipoDivisa() {
		return TipoDivisa;
	}

	public void setTipoDivisa(String tipoDivisa) {
		TipoDivisa = tipoDivisa;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}


	public double Convertir (double divisa, String TipoDivisa) {
		
		double dolar;
		if(TipoDivisa.equals("Convertir Dolar a Euros")) {
			dolar = divisa * 0.93030;
			return dolar;
		} else if(TipoDivisa.equals("Convertir Dolar a Libras Esterlinas")) {
			dolar = divisa * 0.798777;
			return dolar;
			
		} else if(TipoDivisa.equals("Convertir Dolar a Yen Japonés")) {
			dolar = divisa * 139.40;
			return dolar;
			
		} else if(TipoDivisa.equals("Convertir Dolar a Won sul-coreano")) {
			dolar = divisa * 1287.68;
			return dolar;
			
		} else if(TipoDivisa.equals("Convertir de Euros a Dolar"))	{
			dolar = divisa * 1.08;
			return dolar;
		} else if(TipoDivisa.equals("Convertir de Libras Esterlinas a Dolar")) {
			dolar = divisa * 1.26;
			return dolar;
			
		}
		return 0;
	}
	
}
