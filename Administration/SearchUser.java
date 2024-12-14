package com.example.administration_saklaenhaamim_2221380;

public class SearchUser
{
    private String username;
    private int userid;

    public SearchUser(String username, int userid) {
        this.username = username;
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    @Override
    public String toString() {
        return "SearchUser{" +
                "username='" + username + '\'' +
                ", userid=" + userid +
                '}';
    }
}