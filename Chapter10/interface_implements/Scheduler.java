package scheduler;

public interface Scheduler {
	public void getNextCall();
	public void sendCallToAgent();

	/*
	 * �������� default public void getNextCall(); �Ἥ ����Ʈ ������ �ع�����, 
	 * ���� Ŭ������
	 *  @Override
		public void getNextCall() {
		System.out.println("��� ��ȭ�� ������� ��⿭���� �����ɴϴ�.");
		
		�� ����� �����ع����� ���� Ŭ������ scheduler���� �����ϰ� ������ �ִ� �������� �� ���� �� ����. 
	}
	 */
}
