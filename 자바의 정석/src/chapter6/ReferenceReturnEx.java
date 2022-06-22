package chapter6;

public class ReferenceReturnEx {
    public static void main(String[] args) {
        Data returnedData = returnData();
        System.out.println("returnedData.num = " + returnedData.num);
        // returnedData.num = 555
    }

    static Data returnData() {
        Data data = new Data();
        data.num = 555;
        return data;
    }
}

class Data {
    int num = 3;
}
