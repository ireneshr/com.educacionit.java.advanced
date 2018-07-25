package com.educacionit.java.advanced.classes;

public class AppNotification {

    public static void main(String[] args){

        Notificator app= new Notificator();
        app.setNotification(new PushNotification());
        app.send( "Irene Hermosilla", "Homer Simpson", "Esta es mi primera clase..");
        System.out.println();

        app.setNotification(new EmailNotification());
        app.send( "Irene Hermosilla", "Homer Simpson", "Esta es mi primera clase..");
        System.out.println();

        app.setNotification(
                new INotification() {
                    @Override
                    public void send(String from, String to, String msg) {
                        System.out.printf("Using Anonymous class %s send msg %s to %s",from, msg,to);
                    }
                }
        );
        app.send( "Irene Hermosilla", "Homer Simpson", "Esta es mi primera clase..");
        System.out.println();

        app.setNotification(
                //Se pasa unicamente el cuerpo del metodo
                (String from, String to, String msg) -> {
                    System.out.printf("Using Lambda %s send msg %s to %s",from, msg,to);
                }
        );
        app.send( "Irene Hermosilla", "Homer Simpson", "Esta es mi primera clase..");
        System.out.println();

        app.setNotification((from, to, msg) -> System.out.printf("Using Lambda simplified %s send msg %s to %s",from, msg,to));
        app.send( "Irene Hermosilla", "Homer Simpson", "Esta es mi primera clase..");
        System.out.println();

    }

}
