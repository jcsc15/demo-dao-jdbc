package application;

import java.text.SimpleDateFormat;
import java.util.Date;

import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Department obj = new Department(1, "books");
		
		Seller seller = new Seller(1, "Julio", "julio@email.",new Date(), 3500.0, obj);
		
		System.out.println(seller);

	}

}
