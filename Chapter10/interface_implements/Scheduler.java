package scheduler;

public interface Scheduler {
	public void getNextCall();
	public void sendCallToAgent();

	/*
	 * 본문에서 default public void getNextCall(); 써서 디폴트 선언을 해버리고, 
	 * 하위 클래스의
	 *  @Override
		public void getNextCall() {
		System.out.println("상담 전화를 순서대로 대기열에서 가져옵니다.");
		
		이 명령은 삭제해버리면 상위 클래스인 scheduler에서 정의하고 하위에 있는 구구절절 다 지울 수 있음. 
	}
	 */
}
