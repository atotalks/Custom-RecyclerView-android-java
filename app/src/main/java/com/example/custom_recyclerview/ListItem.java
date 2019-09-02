package com.example.custom_recyclerview;

public class ListItem {
    public String getListName() {
        return listName;
    }

    public void setListName(String listName) {
        this.listName = listName;
    }

    public ListItem(String listName) {
        this.listName = listName;
    }

    private String listName;
}
