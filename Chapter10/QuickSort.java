package sorting;

public class QuickSort implements Sort {

	@Override
	public void ascending(int[] arr) {
		System.out.println("QuickSort ascending");
	
	}

	@Override
	public void descending(int[] arr) {
		System.out.println("QuickSort decending");
	}

	public void description() {
		Sort.super.description(); //�̰� ��Ʈ �������̽����� �����ߴ� �κ� (���ڸ� �����ϴ� �˰����Դϴ�) �״�� ����ϴ� ��ɾ�
		System.out.println("QuickSort �Դϴ�.");
	}
}
