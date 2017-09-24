package jsf.bootstrap;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


@ManagedBean(name="RegisterBean")
@SessionScoped
public class RegisterBean {

	private String firstname;
	private String lastname;
	private String address;
	private String phonenumber;
	private String personalemail;
	private String username;
	private String password;
	
	public String getFirstName()
	{
		return firstname;
	}
	
	public void setFirstName(String firstname)
	{
		this.firstname = firstname;
	}
	
	public String getLastname()
	{
		return lastname;
	}
	
	public void setLastname(String lastname)
	{
		this.lastname = lastname;
	}
	public String getAddress()
	{
		return address;
	}
	
	public void setAddress(String address)
	{
		this.address = address;
	}
	public String getPhoneNumber()
	{
		return phonenumber;
	}
	
	public void setPhoneNumber(String phonenumber)
	{
		this.phonenumber = phonenumber;
	}
	public String getPersonalEmail()
	{
		return personalemail;
	}
	
	public void setPersonalEmail(String personalemail)
	{
		this.personalemail = personalemail;
	}
	public String getUsername()
	{
		return username;
	}
	
	public void setUsername(String username)
	{
		this.username = username;
	}
	
	public String getPassword()
	{
		return password;
	}
	
	public void setPassword(String password)
	{
		this.password = password;
	}
	
	
	public String createResigerForm(){
//		System.out.println("Welcome, Admin !");
		return "Registerop";}
	
}
