package sorting;

public class BubbleSort implements Sort {
	int[] arr;
	int t;
	int flag;
	int i;
	
	@Override
	public void ascending(int[] arr) {
		System.out.println("BubbleSort ascending");
		
		
		for(i=1; i<arr.length; i++) {		// i=반복횟수. j의 arr.length-i 랑 맞춰야되기 때문에 i=1부터 시작.  
			boolean flag = true; //  flag는 for 반복 할때마다 초기화 시켜야 하므로  for 문 안에 넣음.
			for(int j=0; j<arr.length-i; j++) {  //  j는 인덱스 위치이므로 j=0이 되야함
				if(arr[j]>arr[j+1]) {
					t=arr[j];
					arr[j]=arr[j+1];
					
					arr[j+1]=t;
					flag=false; //도는 동안에 데이터교환이 한번이라도 일어났다면 flag값을 false로 만들어서 반복. ture면 정렬 종료라고 쳐서 break. 
				}
				}
				if(flag) break;					
			}		
			System.out.println("반복횟수 : " + i);
		for(i=0; i<arr.length; i++) {
			System.out.print(arr[i] + "\t");			
			}
	}
				
	/*		내가 작성한거 
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
		Sort.super.description(); //이건 소트 인터페이스에서 정의했던 부분 (숫자를 정렬하는 알고리즘입니다) 그대로 출력하는 명령어
		System.out.println("BubbleSort 입니다.");
	}
	
	
}