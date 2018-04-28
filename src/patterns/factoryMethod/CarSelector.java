package patterns.factoryMethod;

//Фабричный метод

class CarSelector {
    Car getCar(RoadType roadType) {
        Car car = null;
        switch (roadType) {
            case CITY:
                car = new Porsche();
                break;
            case OFF_ROAD:
                car = new Geep();
                break;
            case GAZON:
                car = new OtherGeep();
                break;
        }
        return car;
    }
}
