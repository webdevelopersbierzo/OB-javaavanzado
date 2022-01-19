package com.company.app;

public class App {
    private static App app;
    boolean isOn = false;

    //constructor vacio
    private App(){}

    //metodos

    public static App getInstance(){
        if(app == null){
            app = new App();
        }
        return app;
    }
    public void On(){
        if(!isOn){
            isOn = true;
        }
    }

}
