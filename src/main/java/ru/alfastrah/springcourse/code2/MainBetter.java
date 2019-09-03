package ru.alfastrah.springcourse.code2;

public class MainBetter {

    static class Service {
        String getSomeService() {
            return "service got!";
        }
    }

    static class Client {
        Service service;

        void setService(Service service) {
            this.service = service;
        }

        void clientJob() {
            System.out.println(service.getSomeService());
        }
    }

    public static void main(String[] args) {
        Client client = new Client();
        Service service = new Service();
        client.setService(service);
        client.clientJob();
    }
}
