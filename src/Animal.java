public class Animal {
    // 1. Атрибуты - Характеристики объекта
    public String name;
    int age;
    // 2. Методы - Поведение объекта  + Конструктор
    public void voice(){
        System.out.println(name + " voice");
    }
    Animal(){
        name = null;
        age = 0;
    }
    Animal(String name, int age){
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        Animal animal = new Animal("Name",10);
    }
}
