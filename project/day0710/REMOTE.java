package project.day0710;

public class REMOTE {// ������ Ŭ����
	private TV pair;
	
	public REMOTE() {pair = null;}
	public void SetPair(TV target) {pair = target;}
	public void pushPwBtn() {
		pair.PushPwBtn();
	}
	public void pushChUp() {
		pair.PushChUpBtn();
	}
	public void pushChDw() {
		pair.PushChDownBtn();
	}
	public void pushVolUp() {
		pair.PushVolUpBtn();
	}
	public void pushVolDw() {
		pair.PushVolDownBtn();
	}
}
