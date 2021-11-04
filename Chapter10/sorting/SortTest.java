package sorting;

import java.io.IOException;

public class SortTest {
	public static void main(String[] args) throws IOException {
		System.out.println("���� ����� �����ϼ���.");
		System.out.println("B : Bubblesort ");
		System.out.println("H : Heapesort ");
		System.out.println("Q : Quicksort ");
		System.out.println("S : Slectsort ");
		
		int ch = System.in.read();
		Sort sort = null;
				
		if(ch == 'B' || ch == 'b') {
			sort = new BubbleSort();
		}
		else if(ch == 'H' || ch == 'h') {
			sort = new HeapSort();
		}
		else if(ch == 'Q' || ch == 'q') {
			sort = new QuickSort();
		}
		else if(ch == 'S' || ch == 's') {
			sort = new SelectSort();
		}
		else {
			System.out.println("�������� �ʴ� ����Դϴ�.");
			return;
		}
//		int[] arr = new int[10];
		int[] arr = {10, 20 ,30, 40, 50}; //bubble sort �˰��� ���
		sort.ascending(arr);
		sort.descending(arr);
		sort.description();
	}

}
