package suza.project.gumb2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    public static final String RESULT_POINTS = "rez";

    TextView tvResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        tvResult = (TextView) findViewById(R.id.tvPointResult);

        Intent intent = getIntent();

        tvResult.setText(intent.getStringExtra(RESULT_POINTS));
    }

}
