package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public void ride() {
        System.out.println("Bus rides from Kyiv to Lviv");
    }

    @Override
    public void passengers(int passengers) {
        System.out.println("Bus holds " + passengers + " passengers");
    }

    @Override
    public int fill(int petrol) {
        return petrol * 28;
    }
}
