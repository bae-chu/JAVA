package loopexample;

public class BreakExample3 {
	public static void main(String[] args) {

		int sum = 0;
		int num;

		a: for (num = 1;; num++) {		//���ǽ� break �Ŵ°� ���ϴ� ��ġ�� ���� �ϰ������ å���� �յڷ� �ϳ��� �Ⱦ��ָ� ��
			sum += num;
			if (sum > 500)
				break a;				//å�����̸��� ����ο��� �ǰ�, ���⼱ a�� �޾���. 
		}
		System.out.println(sum);
		System.out.println(num);
	}

}
