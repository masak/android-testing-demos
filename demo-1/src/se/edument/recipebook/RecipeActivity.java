package se.edument.recipebook;

import android.app.Activity;
import android.os.Bundle;

public class RecipeActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
    	  super.onCreate(savedInstanceState);

    	  setTitle(getIntent().getStringExtra("recipe_title"));
    	  setContentView(R.layout.recipe);
    }
}
