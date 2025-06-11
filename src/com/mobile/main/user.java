/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mobile.main;
import java.time.*;
/**
 *
 * @author USER
 */
public abstract class user {
    protected String email;
    protected String password;
    protected String username;
    protected String noHP;
    protected LocalDate ttl;
    protected String id;

    public user(String email, String password, String username, String noHP, LocalDate ttl, String id) {
        this.email = email;
        this.password = password;
        this.username = username;
        this.noHP = noHP;
        this.ttl = ttl;
        this.id = id;
    }
}
