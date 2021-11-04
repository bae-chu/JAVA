package sorting;

public class HeapSort implements Sort {

	@Override
	public void ascending(int[] arr) {
		System.out.println("HeapSort ascending");
	
	}

	@Override
	public void descending(int[] arr) {
		System.out.println("HeapSort decending");
	}

	@Override
	public void description() {
		Sort.super.description(); //이건 소트 인터페이스에서 정의했던 부분 (숫자를 정렬하는 알고리즘입니다) 그대로 출력하는 명령어
		System.out.println("HeapSort 입니다.");
	}
}
