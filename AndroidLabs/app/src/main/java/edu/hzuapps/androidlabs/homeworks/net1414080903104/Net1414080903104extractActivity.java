package edu.hzuapps.androidlabs.homeworks.net1414080903104;

/*
 * ʵ�֡��鿨����ť��������飺
 * ��10��id���루0-9�������ѡȡһ�����룬���������id��������ݿ�����ȡ�ÿ��Ƶ���������
 */
import edu.hzuapps.androidlabs.homeworks.net1414080903104.Visitdatabases;
import edu.hzuapps.androidlabs.homeworks.net1414080903104.Accessdata;
import edu.hzuapps.androidlabs.R;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.util.*;


public class Net1414080903104extractActivity extends ActionBarActivity {
    int num;//���ڴ������õ������֣������ִ����ſ��Ƶ�id
    Accessdata U=new Accessdata();//����һ��Accessdata�����Ա����ڴ�Ŵ����ݿ��ȡ�õ���ĳ��������
	Visitdatabases Visit=new Visitdatabases();//����һ��Visitdatabases�����Ա������ݿ⴫�����ݻ��ߴ����ݿ��ڻ�ȡ����
    
	protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.extractactivity_net1414080903104);
        
        num=randomnum();
        System.out.print(num);
        /*
        try {
			U=Visit.findonecard(num);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Log.e("android", "fail to connect!"+"  "+e.getMessage());
		}//��num����Visitdatabases�ࣨ�����������Ķ���  V ����װ�����������ʵ����ݿ�����Ӧ�����ݣ�
        //������Visit���ص����͸�ֵ������U��* 
         */
        //��ʱ�����U��������getXXX������ȡ�����ݿ��ڵ����ݣ�
        TextView textView2_1 = (TextView)findViewById(R.id.textView2_1);
        TextView textView3_1 = (TextView)findViewById(R.id.textView3_1);
        TextView textView4_1 = (TextView)findViewById(R.id.textView4_1);
        TextView textView5_1 = (TextView)findViewById(R.id.textView5_1);
        TextView textView6_1 = (TextView)findViewById(R.id.textView6_1);
        TextView textView7_1 = (TextView)findViewById(R.id.textView7_1);
        TextView textView8_1 = (TextView)findViewById(R.id.textView8_1);
        textView2_1.setText("1");
        textView3_1.setText("������Alter");
        textView4_1.setText("SSR");
        textView5_1.setText("��������");
        textView6_1.setText("9999");
        textView7_1.setText("9999");
        textView8_1.setText("9999");
        //û�취�ӷ�װ���ȡ����
        /*textView3_1.setText(U.getName());
        textView4_1.setText(U.getLevel());
        textView5_1.setText(U.getBackground());
        textView6_1.setText(U.getStrength());
        textView7_1.setText(U.getDefensive());
        textView8_1.setText(U.getHp());
        * 
        */
        //����õ�������ʾ����(����д����)
         
    }
	
	public int randomnum(){//����һ����0-9֮��������������ķ���
		Random random= new Random();
		int result=random.nextInt(10);
		return result;
	}
    
}
