package Epam_TDD_and_JunitTask.check_A_InString;

class deleteAFromFirst2Positions {

	public String delete(String string) {
		int length=string.length();
		String result=string;
		if(string.equals("A"))
		{
			result="";
		}
		else if(string.charAt(0)=='A' && string.charAt(1)!='A')
			{
				result=string.substring(1,length);
			}
		else if(string.charAt(0)=='A' && string.charAt(1)=='A' )
			{
				result=string.substring(2,length);
			}
		else if(string.charAt(0)!='A' && string.charAt(1)=='A' )
		{
			String r1=string.substring(0,1);
			String r2=string.substring(2,length);
			result=r1+r2;
			
		}
		return result;
	}

}
