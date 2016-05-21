package consolepkg;

import java.io.Console;

public class TestConsole {

	public static void main(String[] args) {
		boolean userValid = false;
		Console cons = System.console();
		if(cons != null){
			String user;
			String password;
			do{
				user = cons.readLine("%s","UserName: ");
				password = new String(cons.readPassword("%s", "Password: "));
				if(user.equals("oracle") && password.equals("java")){
					userValid = true;
				}else{
					System.out.println("Usuario o contraseña invalida.");
				}
			}while(!userValid);
		}

	}

}
