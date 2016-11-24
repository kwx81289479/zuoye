package kwx;

import java.util.ArrayList;
import java.util.HashMap;

public class Status {
	private ArrayList<String> zhuangTai;//用来保存随机状态
	private HashMap<String, ArrayList<String>> tiMu;//用来保存随机状态和选项
	
	public Status(){
		//初始化值
		zhuangTai = new ArrayList<String>();
		tiMu = new HashMap<String, ArrayList<String>>();
        
		
		//情况添加
		String qingKuang = "约会迟到";
		zhuangTai.add(qingKuang);
		
		//选项添加
		String xuanXiang1 = "手机静音了";
		String xuanXiang2 = "游戏还没完";
		String xuanXiang3 = "在给你煮饭";
		String xuanXiang4 = "在工作和给你买东西";
		
		
		ArrayList<String> temp = new ArrayList<String>();
		//升成中间变量
		temp.add(xuanXiang1);
		temp.add(xuanXiang2);
		temp.add(xuanXiang3);
		temp.add(xuanXiang4);
		
		//将情况和选项放入hash表
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
