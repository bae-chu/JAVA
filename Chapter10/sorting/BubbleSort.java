package sorting;

public class BubbleSort implements Sort {
	int[] arr;
	int t;
	int flag;
	int i;
	
	@Override
	public void ascending(int[] arr) {
		System.out.println("BubbleSort ascending");
		
		
		for(i=1; i<arr.length; i++) {		// i=�ݺ�Ƚ��. j�� arr.length-i �� ����ߵǱ� ������ i=1���� ����.  
			boolean flag = true; //  flag�� for �ݺ� �Ҷ����� �ʱ�ȭ ���Ѿ� �ϹǷ�  for �� �ȿ� ����.
			for(int j=0; j<arr.length-i; j++) {  //  j�� �ε��� ��ġ�̹Ƿ� j=0�� �Ǿ���
				if(arr[j]>arr[j+1]) {
					t=arr[j];
					arr[j]=arr[j+1];
					
					arr[j+1]=t;
					flag=false; //���� ���ȿ� �����ͱ�ȯ�� �ѹ��̶� �Ͼ�ٸ� flag���� false�� ���� �ݺ�. ture�� ���� ������ �ļ� break. 
				}
				}
				if(flag) break;					
			}		
			System.out.println("�ݺ�Ƚ�� : " + i);
		for(i=0; i<arr.length; i++) {
			System.out.print(arr[i] + "\t");			
			}
	}
				
	/*		���� �ۼ��Ѱ� 
	 * 		for(int i=1; i<arr.length; i++) {	
	 * 		for(int j=0; j<arr.length-i; j++) {	
	 * 		if(arr[j]>arr[j+1]) {
					t=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=t;
					}
				else if(flag=0; flag<arr.length; flag++) {
					break;
				}
				
				i=i+1;
				}
				
				}
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
			}
	}
	*/	
	


	@Override
	public void descending(int[] arr) {
		System.out.println("BubbleSort decending");
	}

	@Override
	public void description() {
		Sort.super.description(); //�̰� ��Ʈ �������̽����� �����ߴ� �κ� (���ڸ� �����ϴ� �˰����Դϴ�) �״�� ����ϴ� ��ɾ�
		System.out.println("BubbleSort �Դϴ�.");
	}
	
	
}