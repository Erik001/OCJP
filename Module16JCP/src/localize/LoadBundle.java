package localize;

import java.util.ResourceBundle;

public class LoadBundle {
	public static void main(String[] args) {
		ResourceBundle resource = ResourceBundle.getBundle("bundle.Labels_en_CA");
		System.out.println(resource.getString("clave"));
		System.out.println(resource.getString("clave2"));
		for(String key: resource.keySet()){
			System.out.println(resource.getString(key));
		}
	}
	

}
