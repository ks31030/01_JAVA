/*
 ������ ������ �� �ϳ��� �������� �ϳ��� �ڷ����� �����ϴ�.
 �������� ���� �����ϴ�.
 * int = ����;
 * String = ���ڿ�;
������, �޸�(RAM)�� ���� ����ϱ� ���� ����
������ ���� : �޸� ������ �����͸� ������ �� �ִ� ������ �Ҵ��ϴ� ��.
���� ���� ��� :
 1) �ڷ��� ������;
 2) �ڷ��� ������ = ��;
*/
public class Variable {
	public static void main(String[] args) {
		int age = 28;
		System.out.println("���� : " + age);
		int month = 8;
		int day = 28;
		System.out.println(month+"��"+day+"��");
		String date = "��";
		System.out.println(month+date+day+"��");
		
		// �ڽ��� �̸��� �� ���� ���� ������ ����� ���ô�.
		String name = "�輮";
		 month = 9;
		 day = 12;
		
		System.out.println(name+month+day);
		
		
		
		
		//1. �ڷ��� ������;
		int number1;
		number1 = 100;
		System.out.println("number1 : "+ number1);
		number1 = 200; //�������� ���� �����ϴ�.
		System.out.println("number1(����) : "+ number1);
		
		//�ڷ��� ������ = ������;
		int number2 = 300;
		System.out.println("number2 : "+ number2);
		
		String name1 = "�輮";
		System.out.println("name1 : " + name1);
		name1 = "Hi �輮";
		System.out.println("name1(����) : " + name1);
		
		
		
		
		
	}
}
