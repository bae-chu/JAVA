package sorting;

public class SelectSort implements Sort {
	@Override
	public void ascending(int[] arr) {
		System.out.println("SelectSort ascending");

		int i;
		int j;
		int t;

		for (i = 0; i < arr.length - 1; i++) {
			for (j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					t = arr[i];
					arr[i] = arr[j];
					arr[j] = t;
				}
			}
		}
		for (i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
		System.out.println();
	}

	@Override
	public void descending(int[] arr) {
		System.out.println("SelectSort decending");

	}
}
