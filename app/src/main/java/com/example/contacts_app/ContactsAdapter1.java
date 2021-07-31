package com.example.contacts_app;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.helper.widget.Layer;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;

import com.timehop.stickyheadersrecyclerview.StickyRecyclerHeadersAdapter;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class ContactsAdapter1 extends RecyclerView.Adapter<ContactsAdapter1.ContactViewHolder> {
    private List<ModelContacts> contactsList;
    private Context context;
    private List<String> contactHeaders= new ArrayList<String>();

    public ContactsAdapter1(List<ModelContacts> contacts,Context context) {
        contactsList=contacts;
        this.context=context;
    }

    @Override
    public ContactViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        //in this we have to create a viewHolder , for this we have to inflate the views
        View view=LayoutInflater.from(context).inflate(R.layout.single_contact_item,parent,false);
        return new ContactViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull ContactViewHolder holder, int position) {
        //in this we have just set the values to the contacts ViewHolder
        String contactNameSingle=contactsList.get(position).getContactName();
        int imageRes=contactsList.get(position).getImage();
        holder.contactTextView.setText(contactNameSingle);
        holder.contactsImageView.setImageResource(imageRes);
    }


    @Override
    public int getItemCount() {
        return contactsList.size();
    }

    String getHeaderForCurrentPosition(int position){
        contactHeaders.add("A");
        contactHeaders.add("B");
        contactHeaders.add("C");
        contactHeaders.add("D");
        contactHeaders.add("E");
        contactHeaders.add("E");
        contactHeaders.add("E");
        contactHeaders.add("E");
        contactHeaders.add("E");
        contactHeaders.add("E");
        contactHeaders.add("E");
        contactHeaders.add("E");
        contactHeaders.add("E");
        contactHeaders.add("E");
        contactHeaders.add("E");  
        contactHeaders.add("F");
        contactHeaders.add("G");
        contactHeaders.add("G");
        contactHeaders.add("G");
        contactHeaders.add("G");
        contactHeaders.add("G");
        contactHeaders.add("G");
        contactHeaders.add("G");
        contactHeaders.add("G");
        contactHeaders.add("G");
        contactHeaders.add("G");
        contactHeaders.add("G");
        contactHeaders.add("G");
        contactHeaders.add("G");
        contactHeaders.add("G");
        contactHeaders.add("G");
        contactHeaders.add("G");
        contactHeaders.add("G");
        contactHeaders.add("G");

        for(int i=0;i<contactHeaders.size();i++){
            if(position==i)
                return contactHeaders.get(position);
        }
        return "";


    }

     class ContactViewHolder extends ViewHolder{

         ImageView contactsImageView;
        TextView contactTextView;

        public ContactViewHolder(View itemView) {
            super(itemView);
            contactsImageView=itemView.findViewById(R.id.contactImage);
            contactTextView=itemView.findViewById(R.id.contactName);
        }
    }




}
