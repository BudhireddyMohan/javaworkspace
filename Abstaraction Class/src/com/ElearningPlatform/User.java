package com.ElearningPlatform;

public abstract class User {
    private String username;
    private String email;
    private String role;
    
    
    User(String username,String email,String role){
    	this.username=username;
    	this.email=email;
    	this.role=role;
    }
    
    
    public abstract void  accessDashboard() ;
    
    public void login() {
    	System.out.println("Login successful.");
    }
    
    public void logout() {
    	System.out.println("Logout successful.");
    }
    public void updateProfile() {
    	System.out.println("Profile updated successfully.");
    }
    
    
}
