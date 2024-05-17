import java.io.*;
import java.util.Scanner;
/*В исходном файле содержится строка в формате UTF-8. В результирующий файл
 переписать слова, с четным числом букв и в конце дописать их количество.*/
public class Main {

    // 1. Создаете File src
    // 2. DataOutputStream(src)
    // 3. Запись в src

    // 4. DataInputStream(src)
    // 5. Чтение из src
    // 6. Создание File result
    // 7. DataOutputStream(result)
    // 8. Запись в result по условию

    // 9. DataInputStream(result)
    // 10. Чтение result и вывод в консоль

    public static void main(String[] args) throws IOException {
        File f = new File("1.txt");
        File f2 = new File("out.txt");
        int [] arr = new int[]{1,2,3,4,5,6,7,8,9,10};
        try (DataOutputStream dout = new DataOutputStream(new FileOutputStream(f));
             DataInputStream din = new DataInputStream(new FileInputStream(f));
             DataOutputStream dout2 = new DataOutputStream(new FileOutputStream(f2));
             DataInputStream din2 = new DataInputStream(new FileInputStream(f2));
             ){
            f.createNewFile();
            String str = "Второй конструктор позволяет указать размер буфера, при достижении " +
                    "которого данные будут записаны в выходной поток";
            dout.writeUTF(str);

            String s = din.readUTF();
            String [] words = s.split(" ");
            int count = 0;
            for (int i = 0; i < words.length; i++) {
                if(words[i].length()%2==0){
                    dout2.writeUTF(words[i]);
                    count++;
                }
            }
            dout2.writeInt(count);

            for (int i = 0; i < count; i++) {
                System.out.print(din2.readUTF() + " ");
            }
            System.out.println("\n Количество слов = " + din2.readInt());

        }catch (IOException io ){
            System.out.println("Ошибка IO");
        }
    }
}