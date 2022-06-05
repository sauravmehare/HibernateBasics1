import javax.persistence.Entity;  
import javax.persistence.Id;  
import javax.persistence.Table; 

@Entity  
@Table(name= "\"user\"") 
public class User{
	@Id
	private String userId;
	private String name;
	private long phoneNumber;
	private String password;
	
	public User() {
		super();
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public User(String userId, String name, long phoneNumber, String password) {
		super();
		this.userId = userId;
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.password = password;
	}
	
	
	
}
