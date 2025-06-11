/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mobile.main;
import com.mobile.model.Mobil;
import java.time.LocalDate;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
/**
 *
 * @author user
 */
public class testDrive {
    private String nama;
    private String tanggal;
    private Mobil mobil;

    public testDrive(String nama, String tanggal, Mobil mobil) {
        this.nama = nama;
        this.tanggal = tanggal;
        this.mobil = mobil;
    }
    public void getJadwal() throws IOException{
        List<String> lines = Files.readAllLines(Paths.get("user.txt"));
        
        String hp = lines.get(2);
        String email = lines.get(3);
        String jadwal = "=== Test Drive === \n Nama: " + nama + "\n" +"Nomor HP: " + hp +"\n"+"Email: "+email+"\n"+ "Tanggal: " + tanggal + "\n" + "Mobil: " +mobil.getCarName() + "\n";
        try(FileWriter writer = new FileWriter("jadwal.txt")){
            writer.write(jadwal);
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
