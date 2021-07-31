package com.example.contacts_app

//data class-> that deals with the data and provide various functions
//in data class primary constructor can contain only properties

data class ModelContacts(var image:Int,var contactName:String)


//we have made data and this would be supplied to RecyclerViewAdapter



object dataSupplier {
    var contactsList= listOf<ModelContacts>(
        ModelContacts(R.drawable.a,"Akshay"),
        ModelContacts(R.drawable.a,"Amir"),
        ModelContacts(R.drawable.a,"Anirudh"),
        ModelContacts(R.drawable.a,"Aman"),
        ModelContacts(R.drawable.a,"Aastha"),
        ModelContacts(R.drawable.a,"Aashima"),
        ModelContacts(R.drawable.a,"Alaska"),
        ModelContacts(R.drawable.a,"Amsterdam"),
        ModelContacts(R.drawable.a,"Akshay"),
        ModelContacts(R.drawable.a,"Amir"),
        ModelContacts(R.drawable.a,"Anirudh"),
        ModelContacts(R.drawable.a,"Aman"),
        ModelContacts(R.drawable.a,"Aastha"),
        ModelContacts(R.drawable.a,"Aashima"),
        ModelContacts(R.drawable.a,"Alaska"),
        ModelContacts(R.drawable.a,"Amsterdam"),
        ModelContacts(R.drawable.b,"Badmash"),
        ModelContacts(R.drawable.b,"Bisham"),
        ModelContacts(R.drawable.b,"Bakshi"),
        ModelContacts(R.drawable.b,"Bachi"),
        ModelContacts(R.drawable.b,"Balma"),
        ModelContacts(R.drawable.b,"Billi"),
        ModelContacts(R.drawable.b,"Bishti"),
        ModelContacts(R.drawable.b,"Buddhi"),
        ModelContacts(R.drawable.b,"Brampton"),
        ModelContacts(R.drawable.b,"Bilaspur"),
        ModelContacts(R.drawable.c,"Chapal"),
        ModelContacts(R.drawable.c,"carl"),
        ModelContacts(R.drawable.c,"crow"),
        ModelContacts(R.drawable.c,"cresh"),
        ModelContacts(R.drawable.c,"cream"),
        ModelContacts(R.drawable.c,"Chapal"),
        ModelContacts(R.drawable.c,"carl"),
        ModelContacts(R.drawable.c,"crow"),
        ModelContacts(R.drawable.c,"cresh"),
        ModelContacts(R.drawable.c,"cream"),
        ModelContacts(R.drawable.d,"Dunken"),
        ModelContacts(R.drawable.d,"dashing"),
        ModelContacts(R.drawable.d,"dolli"),
        ModelContacts(R.drawable.d,"daka"),
        ModelContacts(R.drawable.d,"Disk"),
        ModelContacts(R.drawable.d,"Dunken"),
        ModelContacts(R.drawable.d,"dashing"),
        ModelContacts(R.drawable.d,"dolli"),
        ModelContacts(R.drawable.d,"daka"),
        ModelContacts(R.drawable.d,"Disk"))


}