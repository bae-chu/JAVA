package loopexample;

public class ForExampleTest {
	public static void main(String[] args) {
		/* �ؿ����� ���� �ۼ��Ѱ�. 
		int i;
		String t = "�ȳ��ϼ���";
		for(i=1; i<=10; i++) {
		
			System.out.print(t+i+", ");
		}
		System.out.println("");

		*/
		
/*�ؿ����� ������ ��� 1
		
			for(int i=1; i<=10; i++) {
			System.out.print("�ȳ��ϼ���"+ i);
			if(i < 10) {
				System.out.print(", ");
			}
		}
		
		*/
//���� ���
				
			for(int i=1; i<=10; i++) {
			System.out.print("�ȳ��ϼ���"+ i + (i<10?", ":""));
		
			}
		}
	
	
}
