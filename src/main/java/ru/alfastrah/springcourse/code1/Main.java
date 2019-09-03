package ru.alfastrah.springcourse.code1;

public class Main {
    static class Service {
        String getSomeService() {
            return "service got!";
        }
    }

    static class Client {
        Service service;

        Client() {
            service = new Service();
        }

        void clientJob() {
            System.out.println(service.getSomeService());
        }
    }

    public static void main(String[] args) {
        Client client = new Client();
        client.clientJob();
    }
}

