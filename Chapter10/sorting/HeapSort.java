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
		Sort.super.description(); //�̰� ��Ʈ �������̽����� �����ߴ� �κ� (���ڸ� �����ϴ� �˰����Դϴ�) �״�� ����ϴ� ��ɾ�
		System.out.println("HeapSort �Դϴ�.");
	}
}
