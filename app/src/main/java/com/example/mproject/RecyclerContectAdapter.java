package com.example.mproject;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class RecyclerContectAdapter extends RecyclerView.Adapter<RecyclerContectAdapter.ViewHolder>
{
    Context context;
    List<ContactModel> arrContacts;
    RecyclerContectAdapter(Context context, List<ContactModel> arrContacts)

    {
        this.context=context;
        this.arrContacts= arrContacts ;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.contects,parent,false);
        ViewHolder viewHolder=new ViewHolder(view);
        return viewHolder;

    }
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.txtRam.setText(arrContacts.get(position).getRam());
        holder.txtDate.setText(arrContacts.get(position).getdate());
        holder.txtAtime.setText(arrContacts.get(position).getAtime());
        holder.txtStime.setText(arrContacts.get(position).getStime());
    }
    @Override
    public int getItemCount() {
        return arrContacts.size() ;
    }
    public class ViewHolder extends RecyclerView.ViewHolder{
       private TextView txtRam,txtDate,txtAtime,txtStime;
        private ImageView imgContact;
        public ViewHolder(View itemView)
        {
            super(itemView);
            txtRam=(TextView) itemView.findViewById(R.id.textView);
            txtDate=(TextView) itemView.findViewById(R.id.textView1);
            txtAtime=(TextView) itemView.findViewById(R.id.textView2);
            txtStime=(TextView) itemView.findViewById(R.id.textView3);
        }
    }
}

