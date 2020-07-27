package project.day0706;

public class TV {
	private int Ch;
	private int Vol;
	private boolean Power;
	
	public TV() {
		Ch = 1;
		Vol = 0;
		Power = false;
	}
	
	void VolumeUp() {
		if(Power) {
			if(Vol == 10) Vol = 0;
			else Vol++;
		}
	}
	void VolumeDown() {
		if(Power) {
			if(Vol != 0) Vol--;
		}
	}
	void ChannelUp() {
		if(Power) {
			if(Ch == 13) Vol = 1;
			else Vol++;
		}
	}
	void ChannelDown() {
		if(Power) {
			if(Ch == 1) Vol = 13;
			else Vol--;
		}
	}
	void pushPwrButton() {
		Power = !Power;
		
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		if (Power)
			return new String().format("Channel : %d\nVolume %d",Ch, Vol);
		else
			return new String("전원이 꺼져있습니다.");
	}
}
