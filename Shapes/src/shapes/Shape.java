package shapes;

import java.awt.Graphics;

public abstract class Shape {
	//������:���������޷�ʵ�־������ĺ���
	//������:���������޷������ʵ�����
	//���续һ��Բ,ֱ��,��������ȷ�Ĵ���,����"��һ����״"���޷�ֱ��������,����"��һ����״"�����˻�Բ�ͻ�ֱ��

	public abstract void draw(Graphics g);
	public static void main(String[] args) {
		//Shapes s = new Shape();//����,�����಻�ܲ���ʵ������
	}
}
//�����಻�ܲ���ʵ������
//�����������(����Shapes������Line��Circle)����ʵ��(����д)�����еĳ�����,�������Լ��ͱ�ɳ�����