package ifexample;

public class IfExampleTest1 {
	public static void main(String[] args) {
		
		int score = 44;
		char grade;
		
		if(score >= 90) {
			grade = 'A'; 
		}
		else if (score >= 80){
			grade = 'B';
		}
		else {
			grade ='F';
		}
		
		System.out.println("성적은 " + score + "점 이고, 학점은" + grade + "입니다.");
		

	}
}

/*
 * int score = Integer.parseInt(inbr.readLine()); char grade;
 * 
 * if (score >= 90); { grade = 'A'; } else if (score >= 80); { grade = 'B'; }
 * else if (score >= 70); { grade = 'C'; } else if (score >= 60); { grade = 'D';
 * } else { grade = 'F'; }
 */