package JavaCore_11;

public class Task_01 {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        Courier courier1 = new Courier();
        Picker picker1 = new Picker();

        picker1.setWarehouse(warehouse);
        courier1.setWarehouse(warehouse);

        System.out.println("ЗП Сборщик "+ picker1.getSalary()+" ЗП Курьер "+ courier1.getSalary());
        System.out.println(warehouse.toString());
        outputCourier(courier1);
        outputPicker(picker1);
        System.out.println("ЗП Сборщик "+ picker1.getSalary()+" ЗП Курьер "+ courier1.getSalary());
        System.out.println(warehouse.toString());



    }
    public static void outputPicker(Worker Worker){
        for (int i = 0; i < 1501; i++) {
            Worker.doWork();
            Worker.bonus();
        }
    }
    public static void outputCourier(Worker Worker){
        for (int i = 0; i < 1001; i++) {
            Worker.doWork();
            Worker.bonus();
        }
    }

}
