
package com.example.cryptotracker;

import android.os.Bundle;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private CryptoAdapter cryptoAdapter;
    private List<Crypto> cryptoList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);
        cryptoList = new ArrayList<>();

        // Example data
        cryptoList.add(new Crypto("Bitcoin", "£7,665.69", "-1.19%", R.drawable.bitcoin_icon));
        cryptoList.add(new Crypto("Ethereum", "£631.21", "+2.54%", R.drawable.ethereum_icon));
        cryptoList.add(new Crypto("Ripple", "£0.67", "-7.74%", R.drawable.ripple_icon));
        cryptoList.add(new Crypto("Bitcoin Cash", "£889.03", "-7.06%", R.drawable.bitcoincash_icon));
        cryptoList.add(new Crypto("Litecoin", "£151.05", "-4.06%", R.drawable.litecoin_icon));

        cryptoAdapter = new CryptoAdapter(this, cryptoList);
        listView.setAdapter(cryptoAdapter);
    }
}
