package colpack;

import java.util.Scanner;

public class UtilDemo2 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Please tell your role name...:");
		String myrole=scan.nextLine();
		System.out.println("Give your password...");
		String pwd=scan.nextLine();
		UserRoles role=UserRoles.valueOf(myrole);
		role=PermissionApp.checkPermission(role,pwd);
		switch(role.permission) {
		case 1:{
			System.out.println("Permission granted...");
			break;
		}
		case 0:{
			System.out.println("Permission Denied....");
		}
		}
	}
}
class PermissionApp{
	public static UserRoles checkPermission(UserRoles role,String pwd) {
		switch(role) {
		case admin:{
			String p=role.getValue();
			if(p.equals(pwd)) {
				role.setPermission(1);
				return role;
			}
			else {
				return role;
			}
			
		}
		case devops:{
			String p=role.getValue();
			if(p.equals(pwd)) {
				role.setPermission(1);
				return role;
			}
			else {
				return role;
			}
		}
		default:{
			 role.setPermission(0);
			 return role;
		}
		}
	}
}
enum UserRoles{
	admin("admin"),devops("secret"),developer("superman"),tester("spiderman"),accounts("shazam"),hr("shakthiman");
	
	String value;
	UserRoles(String value){
		this.value=value;
	}
	public String getValue() {
		return this.value;
	}
	int permission=0;
	public void setPermission(int i) {
		permission=i;
	}
}



