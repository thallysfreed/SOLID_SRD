package com.silth;

public class ClienteRepository {
    public void insert(){
        System.out.println("Inserir");
    }

    public void update(){
        System.out.println("Update");
    }

    public void delete(){
        System.out.println("Delete");
    }

    public void get(Integer id){
        System.out.println("Get" + id.toString());
    }
}
