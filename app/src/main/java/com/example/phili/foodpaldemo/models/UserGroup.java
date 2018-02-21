package com.example.phili.foodpaldemo.models;

import java.util.Set;

/**
 * Created by phili on 2018-02-21.
 */

public class UserGroup {

    private String groupID;
    private String groupName;
    private String mealTime;
    private String restaurantName;

    private String description;



    // one group can have many users
    private Set<User> currentUsers;

    // default constructor
    public UserGroup(){

    }

//    public UserGroup(String groupID, String groupName, String mealTime, String restaurantName, String description) {
//        this.groupID = groupID;
//        this.groupName = groupName;
//        this.mealTime = mealTime;
//        this.restaurantName = restaurantName;
//        this.description = description;
//    }
    //Test only
    public UserGroup(String groupName, String mealTime, String restaurantName) {
        //this.groupID = groupID;
        this.groupName = groupName;
        this.mealTime = mealTime;
        this.restaurantName = restaurantName;
        //this.description = description;
    }

    public String getGroupID() {
        return groupID;
    }

    public void setGroupID(String groupID) {
        this.groupID = groupID;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getMealTime() {
        return mealTime;
    }

    public void setMealTime(String mealTime) {
        this.mealTime = mealTime;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<User> getCurrentUsers() {
        return currentUsers;
    }

    public void setCurrentUsers(Set<User> currentUsers) {
        this.currentUsers = currentUsers;
    }
}
