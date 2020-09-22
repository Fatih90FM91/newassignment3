package assignment_3;

public class quastion5 {

	public static void main(String[] args) {
		
		int inputSeconds ,hours,minutes,seconds;
		
		inputSeconds =3695;
		minutes =inputSeconds/60;
		hours=minutes/60;
		
		minutes =minutes%60;
		seconds=inputSeconds%60;
		System.out.println(hours + ":" + minutes +":" + seconds);
		
		

	}
}
