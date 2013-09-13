package br.com.yenilik.boaviagem;

import java.util.Arrays;
import java.util.List;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;

public class ViagemListActivity extends ListActivity implements OnItemClickListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listarViagens()));
		ListView listView = getListView();
		listView.setOnItemClickListener(this);
	}
	
	private List<String> listarViagens() {
		return Arrays.asList("S�o Paulo", "Bonito", "Macei�");
	}

	@Override
	public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
		TextView textView = (TextView) view;
		String mensagem = "Viagem selecionada: " + textView.getText();
		
		Toast.makeText(getApplicationContext(), mensagem, Toast.LENGTH_SHORT).show();
		startActivity(new Intent(this, GastoListActivity.class));
	}
	
}
