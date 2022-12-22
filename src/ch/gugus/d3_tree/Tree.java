package ch.gugus.d3_tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tree {
    ArrayList<Leaf> leafs = new ArrayList<>();
    int age;
    String name;



    Integer[20] sizes;


    public Tree(int leafs, int age, String name) {
        this.age = age;
        this.name = name;

        for (int i = 0; i < 20; i++)
        {

        }

        List<Integer> Leafsize = Arrays.asList(sizes);

        for (int i = 0; i < leafs; i++)
        {
            this.leafs.add(new Leaf(10));
        }

    }

    public ArrayList<Leaf> getLeafs() {
        return leafs;
    }

    public void setLeafs(ArrayList<Leaf> leafs) {
        this.leafs = leafs;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
