//2018204017 ������

package jisu;

import java.util.Scanner;

public class jeesoo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true) {
			
			//�ݺ��� ����ؼ� ����
			
		Scanner in = new Scanner(System.in);
		
		System.out.print("��ǰ ���� �Է� (1~10000) : ");
		int price = in.nextInt();
		
		if(price==0) {
			//���ǹ� : price ���� 0�� �Է��ϸ� �ݺ����� ��������.
			System.out.print("���α׷� ����......");
			break;
		}	
		
		System.out.print("���� �ݾ� �Է� (1~10000) : ");
		int pay = in.nextInt();
		
		int less = pay - price; //�ܾװ��� �Է¹޴� ����.
		
		int a=less/5000,
				b=less%5000;
		// a�� 5000�� ���� b�� �ܾ׿��� 5000���� �� ������
		
		int c,d,e,f;
		
		System.out.printf("- 5000�� : %d��\n", a);
		a=b/1000; 
		b=b%1000;
		// a�� 1000�� ���� b�� ���� b������ a*1000�� �A �������� ��.
		System.out.printf("- 1000�� : %d��\n", a);
		a=b/500;
		b=b%500;
		// ���� ������� �����ϰ� ����.
		System.out.printf("- 500�� : %d��\n", a);
		a=b/100;
		b=b%100;
		System.out.printf("- 100�� : %d��\n", a);
		a=b/50;
		b=b%50;
		
		c=b/10; b=b%10;
		d=b/5; b=b%5;
		
		System.out.printf("- 50�� : %d��, 10�� : %d��, 5��  : %d��, 1�� : %d��\n",a,c,d,b);

		System.out.print("===========================\n");
		
		
	}

}
}
