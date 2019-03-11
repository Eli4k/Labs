package finalLab.viewData;
public class ListBean{
	private int id;
	private String monday, tuesday, wednesday, thursday, friday;

	public ListBean(){

	}

	public void setId(int id){
		this.id = id;
	}

	public void setMonday(String monday){
		this.monday = monday;
	}

	public void setTuesday(String tuesday){
		this.tuesday = tuesday;
	}

	public void setWednesday(String wednesday){
		this.wednesday = wednesday;
	}

	public void setThursday(String thursday){
		this.thursday = thursday;
	}

	public void setFriday(String friday){
		this.friday = friday;
	}

	public int getId(){
		return this.id;
	}
	
	public String getMonday(){
		return this.monday;
	}

	public String getTuesday(){
		return this.tuesday;
	}

	public String getWednesday(){
		return this.wednesday;
	}

	public String getThursday(){
		return this.thursday;
	}

	public String getFriday(){
		return this.friday;
	}

}