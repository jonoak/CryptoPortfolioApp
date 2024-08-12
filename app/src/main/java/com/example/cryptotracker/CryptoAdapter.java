
package com.example.cryptotracker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.BaseAdapter;
import java.util.List;

public class CryptoAdapter extends BaseAdapter {
    private Context context;
    private List<Crypto> cryptoList;

    public CryptoAdapter(Context context, List<Crypto> cryptoList) {
        this.context = context;
        this.cryptoList = cryptoList;
    }

    @Override
    public int getCount() {
        return cryptoList.size();
    }

    @Override
    public Object getItem(int position) {
        return cryptoList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.crypto_item, parent, false);
        }

        Crypto currentCrypto = (Crypto) getItem(position);

        ImageView iconView = convertView.findViewById(R.id.cryptoIcon);
        TextView nameView = convertView.findViewById(R.id.cryptoName);
        TextView valueView = convertView.findViewById(R.id.cryptoValue);
        TextView changeView = convertView.findViewById(R.id.cryptoChange);

        iconView.setImageResource(currentCrypto.getIcon());
        nameView.setText(currentCrypto.getName());
        valueView.setText(currentCrypto.getValue());
        changeView.setText(currentCrypto.getChange());

        return convertView;
    }
}
