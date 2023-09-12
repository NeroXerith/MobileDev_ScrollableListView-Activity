package com.bryle_sanico.listviewactivity;
import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    ListView Items;
    Integer[] ICON = {
            R.drawable.anime1, R.drawable.anime2, R.drawable.anime3,
            R.drawable.anime4, R.drawable.anime5, R.drawable.anime6,
            R.drawable.anime7, R.drawable.anime8, R.drawable.anime9,
            R.drawable.anime10
    };
    String[] NAMES = {
            "Rudeus Greyrat", "Roxy Migurdua", "Eris Greyrat", "Sylphiette", "Zenith Greyrat", "Zanoba Shirone", "Ruijerd",
            "Orsted", "Kishirika Kirishirika", "Aisha Greyrat"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CustomAdapter adapter = new CustomAdapter();
        Items = findViewById(R.id.itemList);
        Items.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                // Pass selected icon's resource ID to FullScreen.class
                Intent intent = new Intent(MainActivity.this, FullScreen.class);
                intent.putExtra("selectedIcon", ICON[i]);
                startActivity(intent);
            }
        });
        Items.setAdapter(adapter);
    }

    class CustomAdapter extends BaseAdapter {
        @Override
        public int getCount() {
            return ICON.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View v, ViewGroup vg) {
            v = getLayoutInflater().inflate(R.layout.customlayout, null);
            TextView dispName = v.findViewById(R.id.DispName);
            ImageView dispImg = v.findViewById(R.id.DispImg);
            dispName.setText(NAMES[i]);
            dispImg.setImageResource(ICON[i]);
            return v;
        }
    }
}
