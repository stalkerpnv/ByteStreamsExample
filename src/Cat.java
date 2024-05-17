public class Cat extends Animal{
    // name, age, voice()
    // конструктор

    Cat(String name, int age){
        super(name,age);
    }

    // Один метод - множество реализации
    @Override
    public void voice() {
        System.out.println(name + " Meow");
    }


    public static void main(String[] args) {
        Cat cat = new Cat("Barsik",5);
        cat.voice();
    }
}
