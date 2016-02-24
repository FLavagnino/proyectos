package diaCero;

public class DiaCero {
	public static void main(String[] args) {
		Double productsQuantity = Double.parseDouble(args[0]);
		Double unitPrice = Double.parseDouble(args[1]);
		String cityCode = args[2];
		Double totalPrice = productsQuantity * unitPrice;
		Double discount;
		Double tax;
		
		if (totalPrice < 1000) {
			discount = 0.03;
		} else { if (totalPrice < 5000) {
			discount = 0.05;
		} else { if (totalPrice < 7000) {
			discount = 0.07;
		} else { if (totalPrice < 10000) {
			discount = 0.1;
		} else {
			discount = 0.15;
		}
		}
		}
		}
		switch (cityCode){
		case "UT":
			tax = 0.0685;
			break;
		case "NV":
			tax = 0.08;
			break;
		case "TX":
			tax = 0.0625;
			break;
		case "AL":
			tax = 0.04;
			break;
		case "CA":
			tax = 0.0825;
			break;
		default:
			tax = 0.0;
			break;
		}
		System.out.println("Precio total: " + totalPrice);
		System.out.println("Tax: " + tax);
		System.out.println("Descuento aplicado: " + discount);
		System.out.println("Impuestos agregados: " + (totalPrice * (1 - discount) * tax));
		System.out.println("Monto final: " + (totalPrice * (1 - discount) * (tax + 1)));
	}
}