package test_p9;

public class Sample4_3 {
	public static void main(String[] args) {
		RacingCar rccar1 = new RacingCar();
		rccar1.newShow();
	}
}
class Car{
	protected int num;
	protected double gas;
	
	public Car(){
		num=0;
		gas=0;
		System.out.println("�Ͳ��F���l");
	}
	public Car(int n,double g){
		num=n;
		gas=g;
		System.out.println("�Ͳ��F������"+num+"�T�o�q��"+gas+"�����l");
	}
	public void setCar(int n,double g) {
		num=n;
		gas=g;
		System.out.println("�N�����]��"+num+"�T�o�q�]��"+gas);
	}
	public void show() {
		System.out.println("�����O"+num);
		System.out.println("�T�o�q�O"+gas);
	}
}
class RacingCar extends Car{
	private int course;
	public RacingCar() {
		course=0;
		System.out.println("�Ͳ��F�ɨ�");
	}
	public RacingCar(int n,double g,int c) {
		super(n,g);
		course=c;
		System.out.println("�Ͳ��F�s����"+course+"���ɨ�");
	}
	public void setCourse(int c) {
		course=c;
		System.out.println("�N�ɨ��s���]��"+course);
	}
	public void newShow() {
		System.out.println("�ɨ��������O"+num);
		System.out.println("�T�o�q�O"+gas);
		System.out.println("�ɨ��s���O"+course);
		
	}
}