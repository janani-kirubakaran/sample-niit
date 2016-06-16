package loginmodel;

public class UserDAO {
	public boolean isValid(String userid,String password)
	{
		if(userid.equals("janani") && password.equals("harry-potter"))
		{
			return true;
		}
		else
		{
			return false;
		}
	}

}
