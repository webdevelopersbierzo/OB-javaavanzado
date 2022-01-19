package com.company;

import com.company.app.App;

public class Main {

    public static void main(String[] args) {
	App app = App.getInstance();
    App app2 = App.getInstance();

    app.On();
    app2.On();
        System.out.println(app + "" + app2);
    }
}
