package Car;

import javax.sound.midi.Soundbank;
import javax.xml.bind.SchemaOutputResolver;

public class Automobile {

    private String color;
    private String type;
    private int age;

    public Automobile(String type, String color){
        this.type= type;
        this.color = color;
    }

    public String getColor() {

        return color;
    }

    public void setColor(String color) {

        this.color = color;
    }

    public String getType() {

        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args){
        Automobile ford = new Automobile("ford", "black");
        System.out.println("Here is the initial color of ford: " + ford.getColor());
        ford.setColor("blue");
        System.out.println("Here is the new color of ford: " + ford.getColor());

       float myMinFloatValue = Float.MIN_VALUE;
       float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float minimum value = "  + myMinFloatValue);
        System.out.println("Float maximum value = "  + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double minimum value = " + myMinDoubleValue);
        System.out.println("Double maximum value = " + myMaxDoubleValue);

    int myIntValue = 5 / 3;
    float myFloatValue = 5f /3f;
    double myDoubleValue = 5d /3d;
        System.out.println("MyIntValue =" + myIntValue);
        System.out.println("MyFloatValue =" + myFloatValue);
        System.out.println("MyDoubleValue =" + myDoubleValue);

    }

    }

