package se.edument.recipebook;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class RecipeListActivity extends ListActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
    	  super.onCreate(savedInstanceState);

    	  setListAdapter(new ArrayAdapter<String>(this, R.layout.recipe_list_item, RECIPES));

    	  ListView lv = getListView();
    	  lv.setTextFilterEnabled(true);
    	  
    	  lv.setOnItemClickListener(new OnItemClickListener() {
    		  public void onItemClick(AdapterView<?> parent, View view,
    				  int position, long id) {

    			  Toast.makeText(RecipeListActivity.this, ((TextView)view).getText(), 3);
    		  }
    	  });
    }
    
    static final String[] RECIPES = new String[] {
    	"Pots de creme",
    	"Frozen banana cappucino",
    	"Peanut-butter cookies",
    	"Prosciutto Pizza",
    	"Summer Tomato & Basil Pasta",
    	"Buttermilk pancake",
    	"Raspberry cheese soufflé",
    	"Semiffredo all’Amaretto",
    	"Chocolate biscotti",
    	"Pea, Potato and Ham Soup",
    	"Peach and Kinako Smoothie"
    };
}