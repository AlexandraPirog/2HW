package seminars.second.hw;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {
    Car car;
    Motorcycle motorcycle;

    @BeforeEach
    void setUp() {
        car = new Car("Reno", "Sandero", 2013);
        motorcycle = new Motorcycle("GTAstyleMotorbike", "just a bike", 2004);
    }

    @Test
    @DisplayName("- проверка того, что экземпляр объекта Car также является экземпляром транспортного средства; (instanceof)")
    void testCarDependanceOfVehicle() {

        assertTrue(car instanceof Vehicle);
    }

    @Test
    @DisplayName("проверка того, объект Car создается с 4-мя колесами")
    void testCarWeels() {

        assertEquals(car.getNumWheels(), 4);
    }

    @Test
    @DisplayName("проверка того, объект Motorcycle создается с 2-мя колесами")
    void testMotorcycleWeels() {

        assertEquals(motorcycle.getNumWheels(), 2);
    }

    @Test
    @DisplayName("проверка того, объект Car развивает скорость 60 в режиме тестового вождения (testDrive())")
    void testCarTestDriveSpeed() {

        car.testDrive();
        assertEquals(car.getSpeed(), 60); // JUnit
    }

    @Test
    @DisplayName("проверка того, объект Motorcycle развивает скорость 75 в режиме тестового вождения (testDrive())")
    void testMotorcycleTestDriveSpeed() {

        motorcycle.testDrive();
        assertEquals(motorcycle.getSpeed(), 75);
    }

    @Test
    @DisplayName("проверить, что в режиме парковки (сначала testDrive, потом park, т.е эмуляция движения транспорта) машина останавливается (speed = 0)")
    void testCarParkSpeed() {

        car.testDrive();
        car.park();
        assertEquals(car.getSpeed(), 0);
    }

    @Test
    @DisplayName("проверить, что в режиме парковки (сначала testDrive, потом park  т.е эмуляция движения транспорта) мотоцикл останавливается (speed = 0)")
    void testMotorcycleParkSpeed() {

        motorcycle.testDrive();
        motorcycle.park();
        assertEquals(motorcycle.getSpeed(), 0);
    }
}

}