package com.example.abdulqader.alfalzah.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.abdulqader.alfalzah.R;
import com.example.abdulqader.alfalzah.model.cars;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MyAdapter extends  RecyclerView.Adapter<MyAdapter.ViewHolder>{

    private List<cars>list;
    private Context context;

    public MyAdapter(List<cars> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(
                        R.layout.car_list,
                        parent,
                        false
                );

        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull final MyAdapter.ViewHolder holder, int position) {
        final cars carslist = list.get(position);
        int mExpandedPosition=-1;

//                    holder.linearLayout.setAlpha(0.0f);
//
//                    // Start the animation
//                    holder.linearLayout.animate()
//                            .translationY(view.getHeight())
//                            .alpha(1.0f)
//                            .setListener(null);


//        holder.from.setText(carslist.getFrom());
//        holder.to.setText(carslist.getTo());
//        holder.date.setText(carslist.getDate()+" "+carslist.getTime());
//     //   holder.num.setText(carslist.getNumber_of_passenger()+ "ركاب");
//        holder.price.setText(carslist.getPrice()+"ريال");
//        holder.contact.setText(carslist.getContact());



    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

//        @BindView(R.id.from)TextView from;
//        @BindView(R.id.to)TextView to;
//        @BindView(R.id.date)TextView date;
//      //  @BindView(R.id.num)TextView num;
//        @BindView(R.id.price)TextView price;
//        @BindView(R.id.contact)TextView contact;
//        @BindView(R.id.gone)LinearLayout linearLayout;
        public ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);

        }
    }
}
