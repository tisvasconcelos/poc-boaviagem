package br.com.yenilik.boaviagem;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class DashboardActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.dashboard);
	}
	
	public void selecionarOpcao(View view) {
		TextView textView = (TextView) view;
		String opcao = "Op��o: " + textView.getText().toString();
		Toast.makeText(this, opcao, Toast.LENGTH_LONG).show();
	}
	
}
