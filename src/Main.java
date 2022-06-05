import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class Main {
	static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws NumberFormatException, IOException {
		//FILL YOUR CODE
		 System.out.println("Enter no. of users");
		 int no=Integer.parseInt(br.readLine());
		 UserDAO dao = new UserDAO();
		 for(int i=1;i<=no;i++) {
			 System.out.println("Enter name of user "+i);
	            String name = br.readLine();
	            System.out.println("Enter phone number of user "+i);
	            long pn = Long.parseLong(br.readLine());
			 	System.out.println("Enter user id of user "+i);
	            String uid = br.readLine();
	            System.out.println("Enter password of user "+i);
	            String pwd = br.readLine();
	            
	           User u=new User(uid,name,pn,pwd);
	            dao.insert(u);
			 
		 }
		 
		 List<User> userlist = dao.list();
	        System.out.println("User Details");
	        System.out.printf("%-15s %-15s %s\n","Name","Phone number","User id");
	        for(User u:userlist)
	        {
	            System.out.format("%-15s %-15s %s\n",u.getName(),u.getPhoneNumber(),u.getUserId());
	        }
		 
	}
}

