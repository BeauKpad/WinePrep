import com.BeauKpad.wineprep.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;


public class CardActivity extends Activity implements OnClickListener{

	Button bNextCard;
	Button bFlipCard;
	TextView tvText;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.flshcard);
		bNextCard = (Button)findViewById(R.id.bNextCard);
		bFlipCard = (Button)findViewById(R.id.bFlipCard);
		tvText = (TextView)findViewById(R.id.tvCardText);
	}


	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.bFlipCard:
			
			break;
		case R.id.bNextCard:
			
			break;

		default:
			break;
		}
		
	}

}
