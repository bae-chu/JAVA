package loopexample;

public class ForExample1 {
	public static void main(String[] args ) {
		
		int i;
		int sum;
		for(i=1, sum=0; i<=10; i++) {
			sum += i;
			}
		
		System.out.println("1���� 10������ ���� ? : " + sum);
	}
}
/*		
		
// ������ i �� ������ �Ⱦ���쿡�� �Ʒ��� ���� int ���� ������  for �� �ȿ��� �ϴ°� �Ϲ�����. 
		int i; 
		int sum=0; // sum=0�� ��� ������� �ʴ� �������̹Ƿ�, �̰� for�� �ٱ����� �ʱ⼱�� ���ִ°� �Ϲ���. 
		for(int i=1; i<=10; i++) {
			sum += i;
			}
		
		System.out.println("1���� 10������ ���� ? : " + sum);
		}
}
*/