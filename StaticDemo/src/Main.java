import javax.naming.ldap.ManageReferralControl;

public class Main {

	public static void main(String[] args) {
		ProductManager manager =new ProductManager();
		Product product =new Product();
		product.price=1000;
		product.name="Laptop";
		manager.add(product);
		
		DatebaseHelper.Connection.creatConnection();
	}

}
