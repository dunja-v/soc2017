package suza.project.gumb2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class GameActivity extends AppCompatActivity {

    private int numClick = 6;
    private Long points = 0L;
    private Button btnClick;
    private TextView tvPoints;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        btnClick = (Button) findViewById(R.id.btnClick);
        tvPoints = (TextView) findViewById(R.id.tvPoints);

        btnClick.setOnClickListener(new View.OnClickListener() {

            long lasttime = System.currentTimeMillis();
            long time = System.currentTimeMillis();
            @Override
            public void onClick(View v) {
                RelativeLayout layout = (RelativeLayout) findViewById(R.id.lGameActivity);
                int screenHeight = layout.getHeight();
                int screenWidth = layout.getWidth();
                int buttonHeight = btnClick.getHeight();
                int buttonWidth = btnClick.getWidth();
                lasttime = time;
                time = System.currentTimeMillis();
                int x = new Double(Math.ceil(Math.random()*(screenWidth-buttonWidth))).intValue();
                int y = new Double(Math.ceil(Math.random()*(screenHeight-buttonHeight))).intValue();
                btnClick.setX(x);
                btnClick.setY(y);
                numClick=numClick-1;
                points+=(10000-(time-lasttime))>0?(10000-(time-lasttime)):0;
                tvPoints.setText(points.toString());
                if (numClick==0){
                    Intent intent = new Intent(GameActivity.this, ResultActivity.class);
                    intent.putExtra(ResultActivity.RESULT_POINTS, points.toString());
                    startActivity(intent);
                    finish();
                }
            }
        });
    }


}
