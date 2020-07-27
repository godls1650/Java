package dongAri.src;

public class Graduate extends Member{
	public Graduate() {
		this("",2020,"","");
	}
	
	public Graduate(String name,int joinYear, String address,String phonenum){
		super(name, joinYear,address, phonenum);
	}
	
	public Graduate(Graduate src) {
		super(src.sName, 0,src.sAddress, src.sPhoneNum);
		this.nCardinal  = src.nCardinal;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return new String().format("%-10s%2d±â\t%-30s\t%-14s", 
				this.sName,this.nCardinal,this.sAddress,this.sPhoneNum);
	}
	
	@Override
	public void LoadFromFile(String fileName) {
		// TODO Auto-generated method stub
		return;
	}

	
}
