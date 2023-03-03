package Core.Models;

@SuppressWarnings("ALL")
public class Toy implements Comparable<Toy> {
    public int id;
    public String name;
    public int weight;

    public Toy(int id, String name, int weight) {
        this.id = id;
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return  "_____________________"+ "\n" +
                " Идентификатор:" + id + "\n" +
                " Имя: " + name + "\n" +
                " Вес: " + weight + "\n" +
                "_____________________"+"\n";
    }

    @Override
    public int compareTo(Toy o) {
        return o.getWeight() - this.getWeight();
    }
}
