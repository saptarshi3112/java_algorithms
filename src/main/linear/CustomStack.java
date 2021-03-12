package main.linear;

import java.util.ArrayList;

public class CustomStack {

    private final ArrayList<Integer> list = new ArrayList<>();

    public void push (int value) {
        this.list.add(value);
    }

    public void pop () {
        try {
            this.list.remove(0);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public int peek () {
        return this.list.get(0);
    }

    public int size () {
        return this.list.size();
    }

    public boolean isEmpty () {
        return this.size() == 0;
    }
}
