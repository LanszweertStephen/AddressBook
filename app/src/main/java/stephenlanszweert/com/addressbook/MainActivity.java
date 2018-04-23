package stephenlanszweert.com.addressbook;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import stephenlanszweert.com.addressbook.stephenlanszweert.com.addressbook.domain.Contact;

public class MainActivity extends AppCompatActivity {

    private ListView lst;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lst = (ListView)findViewById(R.id.lstContacts);
        final List<Contact> contacts = new ArrayList<Contact>();
        contacts.add(new Contact("Lanszweert","Stephen","0468169575","stephenlanszweert@hotmail.be"));
        contacts.add(new Contact("Boucquet","Emma","0457894526","emmaboucquet@hotmail.com"));
        ArrayAdapter<Contact> arrayAdapter = new ArrayAdapter<Contact>(
                this,
                android.R.layout.simple_list_item_1,
                contacts );

        lst.setAdapter(arrayAdapter);
        lst.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            // argument position gives the index of item which is clicked
            public void onItemClick(AdapterView<?> arg0, View v, int position, long arg3)
            {
                Contact selectedContact = contacts.get(position);
                Toast.makeText(getApplicationContext(), "Movie Selected : "+selectedContact.getEmail(),   Toast.LENGTH_SHORT).show();
            }
        });
    }
}
