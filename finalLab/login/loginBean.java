package finalLab.login;

public class loginBean{
	private String email, pwd;

	public loginBean(){

	}

	public String getEmail(){
		return email;
	}

	public void setEmail(String mail){
		this.email = mail;
	}


	public String getPwd(){
		return pwd;
	}

	public void setPwd(String pass){
		this.pwd = pass;
	}

}