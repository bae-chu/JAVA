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
 		String strNum="100 "; // ������ �����־ ������. 
 		iValue2 = Integer.valueOf(strNum.trim()); //���鹮�� ���� trim�� ���־ 13�� 100 ������ ���� ó����
 		
 		
 		
 				
	}
}
