package id.atiatulmaula.registeronclickdemo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

/**
 * @author atiatulmaula.wordpress.com
 * 1. Implementasi langsung OnClickListener di class MainActivity
 * 2. Membuat object/instansiasi OnClickListener
 * 3. Langsung inisialiasi di xml
 */
public class MainActivity extends Activity implements OnClickListener{
	
	private Button btnType1;
	private Button btnType2;
	private Button btnType3;
	private TextView txtType1;
	private TextView txtType2;
	private TextView txtType3;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main_layout);
		
		btnType1 =(Button) findViewById(R.id.register_onclick_type_1);
		btnType2 =(Button) findViewById(R.id.register_onclick_type_2);
		btnType3 =(Button) findViewById(R.id.register_onclick_type_3);
		txtType1 = (TextView) findViewById(R.id.textview_register_onclick_type_1);
		txtType2 = (TextView) findViewById(R.id.textview_register_onclick_type_2);
		txtType3 = (TextView) findViewById(R.id.textview_register_onclick_type_3);
		
		btnType1.setOnClickListener(this);
		btnType2.setOnClickListener(listenerType2);
	}

	private OnClickListener listenerType2 = new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			if (txtType2.getVisibility() == View.GONE) {
				txtType2.setVisibility(View.VISIBLE);
			}else{
				txtType2.setVisibility(View.GONE);
			}
		}
	};
	
	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.register_onclick_type_1:
			if (txtType1.getVisibility() == View.GONE) {
				txtType1.setVisibility(View.VISIBLE);
			}else{
				txtType1.setVisibility(View.GONE);
			}
			break;
		default:
			break;
		}
	}
	
	public void onClickType3(View v){
		if (txtType3.getVisibility() == View.GONE) {
			txtType3.setVisibility(View.VISIBLE);
		}else{
			txtType3.setVisibility(View.GONE);
		}
	}
}
