// A. Super Class


// Это абстрактный класс, представляющий компьютер.
public abstract class Computer {
 
    // Абстрактные методы для получения информации о RAM, HDD и CPU.
    public abstract String getRAM();
    public abstract String getHDD();
    public abstract String getCPU();
 
    // Переопределенный метод toString() для предоставления строкового представления компьютера.
    @Override
    public String toString(){
        return "RAM= " + this.getRAM() + ", HDD=" + this.getHDD() + ", CPU=" + this.getCPU();
    }
}



// B. Sub Classes
// Класс PC расширяет суперкласс Computer и предоставляет конкретную реализацию.
package com.journaldev.design.model;
public class PC extends Computer {
 private String ram;
 private String hdd;
 private String cpu;
 // Конструктор инициализирует эти поля
    // Переопределенные методы для предоставления конкретных реализаций абстрактных методов.
}
 public PC(String ram, String hdd, String cpu){
 this.ram=ram;
 this.hdd=hdd;
 this.cpu=cpu;
 }
 @Override
 public String getRAM() {
 return this.ram;
 }
 @Override
 public String getHDD() {
 return this.hdd;
 }
 @Override
 public String getCPU() {
 return this.cpu;
 }
}


// Notice that both the classes are extending Computer class.

package com.journaldev.design.model;
public class Server extends Computer {
 private String ram;
 private String hdd;
 private String cpu;
 // Класс Server также расширяет суперкласс Computer и предоставляет конкретную реализацию.
 public Server(String ram, String hdd, String cpu){
 this.ram=ram;
 this.hdd=hdd;  
 this.cpu=cpu;
   // Конструктор инициализирует эти поля
    // Переопределенные методы для предоставления конкретных реализаций абстрактных методов.
 }
 @Override
 public String getRAM() {
 return this.ram;
 }
 @Override
 public String getHDD() {
 return this.hdd;
 }
 @Override
 public String getCPU() {
 return this.cpu;
 }
}




// C. Factory Class

package com.journaldev.design.factory;
import com.journaldev.design.model.Computer;
import com.journaldev.design.model.PC;
import com.journaldev.design.model.Server;

// Этот класс реализует фабричный метод getComputer, который создает объекты PC и Server
// в зависимости от переданного типа.
public class ComputerFactory {
 public static Computer getComputer(String type, String ram, String hdd, String cpu)
 {
 if("PC".equalsIgnoreCase(type)) return new PC(ram, hdd, cpu);
 else if("Server".equalsIgnoreCase(type)) return new Server(ram, hdd, cpu);
 return null;
 }
}

//Here is a simple test client program that uses above factory pattern  implementation.

package com.journaldev.design.test;
import com.journaldev.design.abstractfactory.PCFactory;
import com.journaldev.design.abstractfactory.ServerFactory;
import com.journaldev.design.factory.ComputerFactory;
import com.journaldev.design.model.Computer;

// Простая программа-клиент, использующая реализацию фабричного паттерна выше
public class TestFactory {
 public static void main(String[] args) {
    //Этот код демонстрирует паттерн "Фабричный метод" в Java для создания объектов классов PC и Server, наследующихся от суперкласса Computer
 Computer pc = ComputerFactory.getComputer("pc","2 GB","500 GB","2.4 GHz");
 Computer server = ComputerFactory.getComputer("server","16 GB","1 TB","2.9 GHz");
 System.out.println("Factory PC Config::"+pc);
 System.out.println("Factory Server Config::"+server);
 }
}

//A. Super Class and Sub-Classes

package com.journaldev.design.model;

// Объявление абстрактного класса с именем "Computer".
public abstract class Computer {

    // Объявление абстрактных методов для получения характеристик компьютера.
    public abstract String getRAM(); // Метод для получения информации об оперативной памяти.
    public abstract String getHDD(); // Метод для получения информации о жестком диске.
    public abstract String getCPU(); // Метод для получения информации о процессоре.

    // Переопределение метода toString() из класса Object.
    // Метод возвращает строку с информацией о компьютере (RAM, HDD, CPU).
    @Override
    public String toString() {
        return "RAM= " + this.getRAM() + ", HDD=" + this.getHDD() + ", CPU=" + this.getCPU();
    }
}



package com.journaldev.design.model;
 
 
// Этот класс наследует функциональность абстрактного класса "Computer".
public class PC extends Computer {

    // Приватные поля для хранения характеристик компьютера (RAM, HDD, CPU).
    private String ram;
    private String hdd;
    private String cpu;

    // Конструктор класса "PC" для инициализации характеристик компьютера.
    public PC(String ram, String hdd, String cpu) {
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
    }

    // Переопределение абстрактных методов из класса "Computer".

    // Метод для получения информации об оперативной памяти компьютера.
    @Override
    public String getRAM() {
        return this.ram;
    }

    // Метод для получения информации о жестком диске компьютера.
    @Override
    public String getHDD() {
        return this.hdd;
    }

    // Метод для получения информации о процессоре компьютера.
    @Override
    public String getCPU() {
        return this.cpu;
    }
}





package com.journaldev.design.model;
 
 // Этот класс наследует функциональность абстрактного класса "Computer".
public class Server extends Computer {

    // Приватные поля для хранения характеристик сервера (RAM, HDD, CPU).
    private String ram;
    private String hdd;
    private String cpu;

    // Конструктор класса "Server" для инициализации характеристик сервера.
    public Server(String ram, String hdd, String cpu) {
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
    }

    // Переопределение абстрактных методов из класса "Computer".

    // Метод для получения информации об оперативной памяти сервера.
    @Override
    public String getRAM() {
        return this.ram;
    }

    // Метод для получения информации о жестком диске сервера.
    @Override
    public String getHDD() {
        return this.hdd;
    }

    // Метод для получения информации о процессоре сервера.
    @Override
    public String getCPU() {
        return this.cpu;
    }
}





// Определение интерфейса ComputerAbstractFactory.
// Этот интерфейс определяет метод createComputer(),
// который будет реализован фабриками для создания объектов Computer.
package com.journaldev.design.abstractfactory;
import com.journaldev.design.model.Computer;

public interface ComputerAbstractFactory {
    public Computer createComputer();
}

// Заметьте, что метод createComputer() возвращает экземпляр суперкласса Computer.
// Теперь наши фабричные классы будут реализовывать этот интерфейс
// и возвращать экземпляры своих соответствующих подклассов.

// Реализация фабричного класса PCFactory, который создает объекты класса PC.
package com.journaldev.design.abstractfactory;
import com.journaldev.design.model.Computer;
import com.journaldev.design.model.PC;

public class PCFactory implements ComputerAbstractFactory {
    private String ram;
    private String hdd;
    private String cpu;
    
    // Конструктор класса PCFactory для инициализации характеристик компьютера.
    public PCFactory(String ram, String hdd, String cpu){
        this.ram=ram;
        this.hdd=hdd;
        this.cpu=cpu;
    }
    
    // Реализация метода createComputer() для создания объекта PC.
    @Override
    public Computer createComputer() {
        return new PC(ram,hdd,cpu);
    }
}






// Реализация фабричного класса ServerFactory, который создает объекты класса Server.
package com.journaldev.design.abstractfactory;
import com.journaldev.design.model.Computer;
import com.journaldev.design.model.Server;

public class ServerFactory implements ComputerAbstractFactory {
    private String ram;
    private String hdd;
    private String cpu;
    
    // Конструктор класса ServerFactory для инициализации характеристик сервера.
    public ServerFactory(String ram, String hdd, String cpu){
        this.ram=ram;
        this.hdd=hdd;
        this.cpu=cpu;
    }
    
    // Реализация метода createComputer() для создания объекта Server.
    @Override
    public Computer createComputer() {
        return new Server(ram,hdd,cpu);
    }
}







//
// Импорт необходимых классов и пакетов.

package com.journaldev.design.test;
import com.journaldev.design.abstractfactory.PCFactory;
import com.journaldev.design.abstractfactory.ServerFactory;
import com.journaldev.design.factory.ComputerFactory;
import com.journaldev.design.model.Computer;

public class TestDesignPatterns {

    public static void main(String[] args) {
        testAbstractFactory();
    }

    // Метод для тестирования абстрактной фабрики.
    private static void testAbstractFactory() {
        // Создание объекта PC с помощью фабрики PCFactory и заданными характеристиками.
        Computer pc = com.journaldev.design.abstractfactory.ComputerFactory.getComputer(new PCFactory("2 GB","500 GB","2.4 GHz"));
        
        // Создание объекта Server с помощью фабрики ServerFactory и заданными характеристиками.
        Computer server = com.journaldev.design.abstractfactory.ComputerFactory.getComputer(new ServerFactory("16 GB","1 TB","2.9 GHz"));
        
        // Вывод информации о конфигурации созданных компьютеров.
        System.out.println("AbstractFactory PC Config::" + pc);
        System.out.println("AbstractFactory Server Config::" + server);
    }
}

