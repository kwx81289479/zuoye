package kwx;

import java.util.ArrayList;
import java.util.HashMap;

public class Status {
	private ArrayList<String> zhuangTai;//�����������״̬
	private HashMap<String, ArrayList<String>> tiMu;//�����������״̬��ѡ��
	
	public Status(){
		//��ʼ��ֵ
		zhuangTai = new ArrayList<String>();
		tiMu = new HashMap<String, ArrayList<String>>();
        
		
		//������
		String qingKuang = "Լ��ٵ�";
		zhuangTai.add(qingKuang);
		
		//ѡ�����
		String xuanXiang1 = "�ֻ�������";
		String xuanXiang2 = "��Ϸ��û��";
		String xuanXiang3 = "�ڸ�����";
		String xuanXiang4 = "�ڹ����͸�������";
		
		
		ArrayList<String> temp = new ArrayList<String>();
		//�����м����
		temp.add(xuanXiang1);
		temp.add(xuanXiang2);
		temp.add(xuanXiang3);
		temp.add(xuanXiang4);
		
		//�������ѡ�����hash��
		tiMu.put(qingKuang, temp);
	}
	public ArrayList<String> getZhuangTai(){
		return zhuangTai;
	}
	public void setZhuangTai(ArrayList<String> zhaungTai){
		this.zhuangTai = zhaungTai;
		
	}
	public HashMap<String, ArrayList<String>> getTiMu(){
		return tiMu;
	}
	

}
