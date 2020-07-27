package project.day0710;

public class TV {
	private int Ch;//채널정보
	private int vol; // 음량
	private boolean Power;// 전원
	
	private final static int lastCh = 10;
	private final static int lastVol = 10;
	
	public TV() {this(0,0,false);}
	public TV(int c, int v, boolean p) {
		Ch = c; vol = v; Power = p;
	}
	public TV(TV origin) {
		this(origin.Ch, origin.vol,origin.Power);}
	public int getCh() {
		return Ch;
	}
	public void setCh(int ch) {
		Ch = ch;
	}
	public int getVol() {
		return vol;
	}
	public void setVol(int vol) {
		this.vol = vol;
	}
	public boolean isPower() {
		return Power;
	}
	public void setPower(boolean power) {
		Power = power;
	}
	
	public void PushChUpBtn() {
		
		if(Power)Ch = Ch != lastCh ? Ch + 1 : 1;
	}
	public void PushChDownBtn() {
		if(Power)Ch = Ch != 1 ? Ch - 1 : lastCh;
	}
	
	public void PushVolUpBtn() {
		if(Power)vol = vol != lastVol ? vol + 1 : 1;
	}
	public void PushVolDownBtn() {
		if(Power)vol = vol != 1 ? vol - 1 : lastVol;
	}
	public void PushPwBtn() {
		Power = !Power;
	}
	public void showState() {
		if(Power)System.out.printf("CH : %d\nVol:%d\n", Ch,vol);
	}
}













