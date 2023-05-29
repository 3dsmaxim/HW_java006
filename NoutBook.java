import java.util.TreeMap;

public class NoutBook {
    String modelName;
    int ram;
    int hhd;
    String os;
    String color;

    public NoutBook(String modelName, int ram, int hhd, String os, String color) {
        this.modelName = modelName;
        this.ram = ram;
        this.hhd = hhd;
        this.os = os;
        this.color = color;

    }

    public String getmodelName() {
        return modelName;

    }

    public int getRam() {
        return ram;

    }

    public int getHhd() {
        return hhd;

    }

    public String getOs() {
        return os;

    }
    public String getColor() {
            return color;
    
        }

    public String prinTo() {
        return "Модель: " + modelName.toString() +
                ",\n     Объем оперативной памяти: " + ram + " ГБ." +
                ",\n     Объем жесткого диска: " + hhd + " ГБ." +
                ",\n     Операционная система: " + os.toString() +
                ",\n     Цвет: " + color.toString();
    }

    public void addAll(TreeMap<Integer, String> chekMap) {
    }

}
