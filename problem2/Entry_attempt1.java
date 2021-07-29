package problem9;

class Account{}
class CA : Account{
	
	Dialog d;
	CA(Dialog D)
	{
		this.d = D;
	}
	showDisplay(){
		d.Display()
	}
}
class SA : Account{
	Dialog d;
	SA)Dialog D){
		this.d = D;
	}
	showDisplay(){
		d.Display()
	}
}
class Dialog {}
class SADialog : Dialog {}
class CADialog : Dialog {}

public class Entry {
	public static void ShowUI(Account account) {
		Dialog dlg=null;
		try{
			account.showDisplay();
		}catch(NullPointerException e)
		{
		}
		
	}
	
	static void main()
	{
		Dialog saDialog = new  SADialog();
		Account account = new SA(saDialog);
		ShowUI(account);
		
	}
}
