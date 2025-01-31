public class Praktikum {
  public static void main(String[] args) {
        int freeHours = 4; // Объявили переменную с количеством свободного 
времени в часах и присвоили ей значение
                        
        checkReading(freeHours); // вызываем метод с циклом и передаём в 
него количество свободного времени
  }

  public static void checkReading(int freeHours) {
    if (freeHours >= 2) { 
        for (int i = 1; i < 4; i = i + 1) {
          System.out.println("Анатолий прочитал " + i + "-ю главу");
        }
    } else {
        System.out.println("Сегодня не читаем.");
    }
  }

} 
