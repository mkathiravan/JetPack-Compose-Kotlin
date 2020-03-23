package com.example.myapplication

object UserDataSource {

    fun getUsers(): List<User>
    {
        return ArrayList<User>().apply {
            add(User(1,"Kathiravan","kathiravan@gmail.com"))
            add(User(2,"Srikant","srikanth@gmail.com"))
            add(User(3,"Ramesh","ramesh@gmail.com"))
            add(User(4,"Pradeep","pradeep@gmail.com"))
            add(User(5,"Deepak","deepak@gmail.com"))
            add(User(6,"Harish","harish@gmail.com"))
            add(User(7,"Prajeesh","prajeesh@gmail.com"))
            add(User(8,"Karthik","karthik@gmail.com"))
            add(User(9,"Paramesh","paramesh@gmail.com"))
            add(User(10,"Manju","manju@gmail.com"))
        }
    }
}