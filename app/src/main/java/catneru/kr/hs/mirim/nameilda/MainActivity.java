package catneru.kr.hs.mirim.nameilda;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    MyListAdapter myListAdapter;
    ArrayList<list_item> list_itemArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=(ListView)findViewById(R.id.my_listView);

        list_itemArrayList = new ArrayList<list_item>();


    }

    public class Listviewitem {
        private int icon;
        private String name;
        public int getIcon(){return icon;}
        public String getName(){return name;}
        public Listviewitem(int icon,String name){
            this.icon=icon;
            this.name=name;
        }
    }

}
