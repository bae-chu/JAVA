package wrapper;

public class WrapperTest {
	public static void main(String[] args) {
		Integer iValue = new Integer(100);
 		Double dValue = new Double(0.0);
 		iValue=200;
 		int myValue = iValue.intValue();
 		double myDValue = dValue.doubleValue();
 		int myValue2 = iValue;
 		Integer iValue2 = Integer.valueOf(myValue);
 		iValue2 = myValue2;
 		String strNum="100 "; // 원래는 공백있어서 오류남. 
 		iValue2 = Integer.valueOf(strNum.trim()); //공백문자 제거 trim이 들어가있어서 13행 100 공백이 필터 처리됨
 		
 		
 		
 				
	}
}
